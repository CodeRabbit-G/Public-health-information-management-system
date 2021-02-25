package com.xnxy17jk2.biz.education.personal.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xnxy17jk2.biz.education.personal.service.PersonalService;
import com.xnxy17jk2.entity.Personal;
import com.xnxy17jk2.util.BaseServlet;
import com.xnxy17jk2.util.WebUtil;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.biz.education.personal.web
 * @����: Personal
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��5��7�� ����9:46:42
 */
public class PersonalServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
	private PersonalService service = new PersonalService();

	/**
	 * ��ȡ��Ϣ
	 * 
	 */
	public void query(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		List<Personal> list;
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
		request.getRequestDispatcher("/jsp/education/personal/list.jsp").forward(request, response);
		
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
		List<Personal> list = service.search(factor, content);
		
		if(!list.isEmpty()){
			// �����ݴ���request
			show(request, list);
		}

		request.setAttribute("currentPage", "0");
		request.setAttribute("count", "1");
		
		request.getRequestDispatcher("/jsp/education/personal/list.jsp").forward(request, response);
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
		
		Personal personal = WebUtil.copyRequestToBean(request, Personal.class);
		personal.setId(WebUtil.getIdNo());
		// ��������
		if (service.save(personal)) {
			response.getWriter().write(
					"<script>alert('��ӳɹ�'); window.location='personal?action=query';</script>");
			response.getWriter().flush();
		} else {
			response.getWriter().write(
					"<script>alert('���ʧ��'); window.location='personal?action=query';</script>");
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
		Personal personal = service.findById(id);

		request.setAttribute("personal", personal);
		request.getRequestDispatcher("/jsp/education/personal/revise.jsp").forward(request, response);
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
		
		Personal personal = WebUtil.copyRequestToBean(request, Personal.class);
		// �ύ�޸�����
		if (service.update(personal)) {
			response.getWriter().write(
					"<script>alert('�޸ĳɹ�'); window.location='personal?action=query';</script>");
			response.getWriter().flush();
		} else {
			response.getWriter().write(
					"<script>alert('�޸�ʧ��'); window.location='personal?action=query';</script>");
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
	private void show(HttpServletRequest request, List<Personal> list) {
		
		HttpSession session = request.getSession(true);
		String strId = "";
		String personals = "";
		for (Personal personal : list) {
			personals += personal.getAll() + ",";
			strId += personal.getId() + ",";
		}
		
		request.setAttribute("personals", personals.substring(0, personals.length() - 1).replace("\r\n", ""));
		session.setAttribute("strId", strId.substring(0, strId.length() - 1));
	}
	
}