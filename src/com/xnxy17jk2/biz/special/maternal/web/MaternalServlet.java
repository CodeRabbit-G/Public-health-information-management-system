package com.xnxy17jk2.biz.special.maternal.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xnxy17jk2.biz.special.maternal.service.MaternalService;
import com.xnxy17jk2.entity.Maternal;
import com.xnxy17jk2.util.BaseServlet;
import com.xnxy17jk2.util.WebUtil;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.biz.special.maternal.web
 * @����: MaternalServlet
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��5��7�� ����8:51:58
 */
public class MaternalServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
	private MaternalService service = new MaternalService();

	/**
	 * ��ȡ��Ϣ
	 * 
	 */
	public void query(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		List<Maternal> list;
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
		request.getRequestDispatcher("/jsp/special/maternal/list.jsp").forward(request, response);
		
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
		List<Maternal> list = service.search(factor, content);
		
		if(!list.isEmpty()){
			// �����ݴ���request
			show(request, list);
		}

		request.setAttribute("currentPage", "0");
		request.setAttribute("count", "1");
		
		request.getRequestDispatcher("/jsp/special/maternal/list.jsp").forward(request, response);
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
		
		Maternal maternal = WebUtil.copyRequestToBean(request, Maternal.class);
		maternal.setId(WebUtil.getIdNo());
		// ��������
		if (service.save(maternal)) {
			response.getWriter().write(
					"<script>alert('��ӳɹ�'); window.location='maternal?action=query';</script>");
			response.getWriter().flush();
		} else {
			response.getWriter().write(
					"<script>alert('���ʧ��'); window.location='maternal?action=query';</script>");
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
		Maternal maternal = service.findById(id);

		request.setAttribute("maternal", maternal);
		request.getRequestDispatcher("/jsp/special/maternal/revise.jsp").forward(request, response);
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
		
		Maternal maternal = WebUtil.copyRequestToBean(request, Maternal.class);
		// �ύ�޸�����
		if (service.update(maternal)) {
			response.getWriter().write(
					"<script>alert('�޸ĳɹ�'); window.location='maternal?action=query';</script>");
			response.getWriter().flush();
		} else {
			response.getWriter().write(
					"<script>alert('�޸�ʧ��'); window.location='maternal?action=query';</script>");
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
	private void show(HttpServletRequest request, List<Maternal> list) {
		
		HttpSession session = request.getSession(true);
		String strId = "";
		String maternals = "";
		for (Maternal maternal : list) {
			maternals += maternal.getAll() + ",";
			strId += maternal.getId() + ",";
		}
		
		request.setAttribute("maternals", maternals.substring(0, maternals.length() - 1));
		session.setAttribute("strId", strId.substring(0, strId.length() - 1));
	}
	
}