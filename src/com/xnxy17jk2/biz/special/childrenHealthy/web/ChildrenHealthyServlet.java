package com.xnxy17jk2.biz.special.childrenHealthy.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xnxy17jk2.biz.special.childrenHealthy.service.ChildrenHealthyService;
import com.xnxy17jk2.entity.ChildrenHealthy;
import com.xnxy17jk2.util.BaseServlet;
import com.xnxy17jk2.util.WebUtil;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.biz.special.childrenHealthy.web
 * @类名: ChildrenHealthyServlet
 * @描述: 类说明
 * @作者: Guo_SY
 * @创建时间: 2020年5月7日 下午8:50:47
 */
public class ChildrenHealthyServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
	private ChildrenHealthyService service = new ChildrenHealthyService();

	/**
	 * 获取信息
	 * 
	 */
	public void query(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		List<ChildrenHealthy> list;
		int pageSize = 10;
		int count = service.getCount();
		String curPage = request.getParameter("currentPage");

		if (WebUtil.isEmpty(curPage)) {
			curPage = "0";
		}

		if (count > Integer.parseInt(curPage) * pageSize) {
			list = service.query(Integer.parseInt(curPage) * pageSize, 
					Integer.parseInt(curPage) * pageSize + pageSize);
		} else {
			curPage = (Integer.parseInt(curPage) - 1) + "";
			list = service.query(Integer.parseInt(curPage) * pageSize, 
					Integer.parseInt(curPage) * pageSize + pageSize);
		}
		
		if(!list.isEmpty()){
			// 将数据存入request
			show(request, list);
		}
		
		request.setAttribute("currentPage", curPage);
		request.setAttribute("count", count);

		// 转发到一个页面上去显示
		request.getRequestDispatcher("/jsp/special/childrenHealthy/list.jsp").forward(request, response);
		
	}

	/**
	 * 搜索
	 * @throws IOException 
	 * @throws ServletException 
	 * 
	 */
	public void search(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String factor = request.getParameter("factor");
		String content = request.getParameter("content");
		List<ChildrenHealthy> list = service.search(factor, content);
		
		if(!list.isEmpty()){
			// 将数据存入request
			show(request, list);
		}

		request.setAttribute("currentPage", "0");
		request.setAttribute("count", "1");
		
		request.getRequestDispatcher("/jsp/special/childrenHealthy/list.jsp").forward(request, response);
	}

	/**
	 * 添加
	 * 
	 * @throws IOException
	 * @throws ServletException
	 * 
	 */
	public void add(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		ChildrenHealthy childrenHealthy = WebUtil.copyRequestToBean(request, ChildrenHealthy.class);
		childrenHealthy.setId(WebUtil.getIdNo());
		// 保存数据
		if (service.save(childrenHealthy)) {
			response.getWriter().write(
					"<script>alert('添加成功'); window.location='childrenHealthy?action=query';</script>");
			response.getWriter().flush();
		} else {
			response.getWriter().write(
					"<script>alert('添加失败'); window.location='childrenHealthy?action=query';</script>");
			response.getWriter().flush();
		}
	}

	/**
	 * 获取修改项
	 * 
	 * @throws IOException
	 * @throws ServletException
	 * 
	 */
	public void revise(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String id = request.getParameter("id");
		ChildrenHealthy childrenHealthy = service.findById(id);

		request.setAttribute("childrenHealthy", childrenHealthy);
		request.getRequestDispatcher("/jsp/special/childrenHealthy/revise.jsp").forward(request, response);
	}

	/**
	 * 提交修改
	 * 
	 * @throws IOException
	 * @throws ServletException
	 * 
	 */
	public void update(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		ChildrenHealthy childrenHealthy = WebUtil.copyRequestToBean(request, ChildrenHealthy.class);
		// 提交修改数据
		if (service.update(childrenHealthy)) {
			response.getWriter().write(
					"<script>alert('修改成功'); window.location='childrenHealthy?action=query';</script>");
			response.getWriter().flush();
		} else {
			response.getWriter().write(
					"<script>alert('修改失败'); window.location='childrenHealthy?action=query';</script>");
			response.getWriter().flush();
		}
	}

	/**
	 * 删除单个
	 * 
	 * @throws IOException
	 * @throws ServletException
	 * 
	 */
	public void delete(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String id = request.getParameter("id");
		service.delete(id);
		query(request, response);
	}

	/**
	 * 删除选中项
	 * 
	 * @throws IOException
	 * @throws ServletException
	 * 
	 */
	public void delAll(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		HttpSession session = request.getSession(true);
		String[] idList = ((String) session.getAttribute("strId")).split(",");
		String[] ids = (request.getParameter("delList")).split(",");
		for (String id : ids) {
			service.delete(idList[Integer.parseInt(id)]);
		}
		request.setAttribute("currentPage", request.getParameter("currentPage"));
		query(request, response);
	}

	/**
	 * 将内容存入request中去
	 * 
	 */
	private void show(HttpServletRequest request, List<ChildrenHealthy> list) {
		
		HttpSession session = request.getSession(true);
		String strId = "";
		String childrenHealthys = "";
		for (ChildrenHealthy childrenHealthy : list) {
			childrenHealthys += childrenHealthy.getAll() + ",";
			strId += childrenHealthy.getId() + ",";
		}
		
		request.setAttribute("childrenHealthys", childrenHealthys.substring(0, childrenHealthys.length() - 1));
		session.setAttribute("strId", strId.substring(0, strId.length() - 1));
	}
	
}