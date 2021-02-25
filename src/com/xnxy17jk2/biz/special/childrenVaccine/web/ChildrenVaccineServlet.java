package com.xnxy17jk2.biz.special.childrenVaccine.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xnxy17jk2.biz.special.childrenVaccine.service.ChildrenVaccineService;
import com.xnxy17jk2.entity.ChildrenVaccine;
import com.xnxy17jk2.util.BaseServlet;
import com.xnxy17jk2.util.WebUtil;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.biz.special.childrenVaccine.web
 * @����: ChildrenVaccineServlet
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��5��7�� ����8:51:18
 */
public class ChildrenVaccineServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
	private ChildrenVaccineService service = new ChildrenVaccineService();

	/**
	 * ��ȡ��Ϣ
	 * 
	 */
	public void query(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		List<ChildrenVaccine> list;
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
			// �����ݴ���request
			show(request, list);
		}
		
		request.setAttribute("currentPage", curPage);
		request.setAttribute("count", count);

		// ת����һ��ҳ����ȥ��ʾ
		request.getRequestDispatcher("/jsp/special/childrenVaccine/list.jsp").forward(request, response);
		
	}

	/**
	 * ����
	 * @throws IOException 
	 * @throws ServletException 
	 * 
	 */
	public void search(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String factor = request.getParameter("factor");
		String content = request.getParameter("content");
		List<ChildrenVaccine> list = service.search(factor, content);
		
		if(!list.isEmpty()){
			// �����ݴ���request
			show(request, list);
		}

		request.setAttribute("currentPage", "0");
		request.setAttribute("count", "1");
		
		request.getRequestDispatcher("/jsp/special/childrenVaccine/list.jsp").forward(request, response);
	}

	/**
	 * ���
	 * 
	 * @throws IOException
	 * @throws ServletException
	 * 
	 */
	public void add(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		ChildrenVaccine childrenVaccine = WebUtil.copyRequestToBean(request, ChildrenVaccine.class);
		childrenVaccine.setId(WebUtil.getIdNo());
		// ��������
		if (service.save(childrenVaccine)) {
			response.getWriter().write(
					"<script>alert('��ӳɹ�'); window.location='childrenVaccine?action=query';</script>");
			response.getWriter().flush();
		} else {
			response.getWriter().write(
					"<script>alert('���ʧ��'); window.location='childrenVaccine?action=query';</script>");
			response.getWriter().flush();
		}
	}

	/**
	 * ��ȡ�޸���
	 * 
	 * @throws IOException
	 * @throws ServletException
	 * 
	 */
	public void revise(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String id = request.getParameter("id");
		ChildrenVaccine childrenVaccine = service.findById(id);

		request.setAttribute("childrenVaccine", childrenVaccine);
		request.getRequestDispatcher("/jsp/special/childrenVaccine/revise.jsp").forward(request, response);
	}

	/**
	 * �ύ�޸�
	 * 
	 * @throws IOException
	 * @throws ServletException
	 * 
	 */
	public void update(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		ChildrenVaccine childrenVaccine = WebUtil.copyRequestToBean(request, ChildrenVaccine.class);
		// �ύ�޸�����
		if (service.update(childrenVaccine)) {
			response.getWriter().write(
					"<script>alert('�޸ĳɹ�'); window.location='childrenVaccine?action=query';</script>");
			response.getWriter().flush();
		} else {
			response.getWriter().write(
					"<script>alert('�޸�ʧ��'); window.location='childrenVaccine?action=query';</script>");
			response.getWriter().flush();
		}
	}

	/**
	 * ɾ������
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
	 * ɾ��ѡ����
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
	 * �����ݴ���request��ȥ
	 * 
	 */
	private void show(HttpServletRequest request, List<ChildrenVaccine> list) {
		
		HttpSession session = request.getSession(true);
		String strId = "";
		String childrenVaccines = "";
		for (ChildrenVaccine childrenVaccine : list) {
			childrenVaccines += childrenVaccine.getAll() + ",";
			strId += childrenVaccine.getId() + ",";
		}
		
		request.setAttribute("childrenVaccines", childrenVaccines.substring(0, childrenVaccines.length() - 1));
		session.setAttribute("strId", strId.substring(0, strId.length() - 1));
	}
	
}