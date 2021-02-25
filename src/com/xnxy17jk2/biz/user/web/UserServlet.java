package com.xnxy17jk2.biz.user.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xnxy17jk2.biz.user.service.UserService;
import com.xnxy17jk2.entity.User;
import com.xnxy17jk2.util.BaseServlet;
import com.xnxy17jk2.util.MD5Util;
import com.xnxy17jk2.util.WebUtil;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.biz.user.web
 * @����: user
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��5��9�� ����10:10:08
 */
public class UserServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
	private UserService service = new UserService();

	/**
	 * ��¼
	 * 
	 */
	public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String code = request.getParameter("code");
		String sCode = (String) request.getSession().getAttribute("sCode");
		// ��ֹbug
		if (code == null) {
			response.sendRedirect(request.getContextPath() + "/jsp/login.jsp");
			return;
		}
		// ��֤��֤���Ƿ���ȷ
		if (code.trim().equals(sCode)) {
			User user = WebUtil.copyRequestToBean(request, User.class);
			// ��֤�û����Ƿ���ȷ
			User loginUser = service.login(user.getName());
			if (loginUser != null) {
				// ��֤����
				if (MD5Util.md5(user.getPassword()).equals(loginUser.getPassword())) {
					// ��¼�ɹ�
					request.getSession().setAttribute("user", loginUser);
					request.getSession().setAttribute("rights", loginUser.getRights());
					response.sendRedirect(request.getContextPath() + "/index.jsp");
					return;
				} else {
					// �������
					response.getWriter().write("<script>alert('������������'); window.location='" + request.getContextPath()
							+ "/jsp/login.jsp';</script>");
					response.getWriter().flush();
				}
			} else {
				// �û���������
				response.getWriter().write("<script>alert('�û���������'); window.location='" + request.getContextPath()
						+ "/jsp/login.jsp';</script>");
				response.getWriter().flush();
			}
		} else {
			// ��֤�����
			response.getWriter().write("<script>alert('��֤�����'); window.location='" + request.getContextPath()
					+ "/jsp/login.jsp';</script>");
			response.getWriter().flush();
		}
	}

	/**
	 * ��ȡ��Ϣ
	 * 
	 */
	public void query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<User> list;
		int pageSize = 10;
		int count = service.getCount() - 1;
		String curPage = request.getParameter("currentPage");

		if (WebUtil.isEmpty(curPage)) {
			curPage = "0";
		}

		if (count > Integer.parseInt(curPage) * pageSize) {
			list = service.query(Integer.parseInt(curPage) * pageSize, Integer.parseInt(curPage) * pageSize + pageSize);
		} else {
			curPage = (Integer.parseInt(curPage) - 1) + "";
			list = service.query(Integer.parseInt(curPage) * pageSize, Integer.parseInt(curPage) * pageSize + pageSize);
		}

		if (!list.isEmpty()) {
			// �����ݴ���request
			show(request, list);
		}

		request.setAttribute("currentPage", curPage);
		request.setAttribute("count", count);

		// ת����һ��ҳ����ȥ��ʾ
		request.getRequestDispatcher("/jsp/user/list.jsp").forward(request, response);

	}

	/**
	 * ����
	 * 
	 * @throws IOException
	 * @throws ServletException
	 * 
	 */
	public void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String factor = request.getParameter("factor");
		String content = request.getParameter("content");
		List<User> list = service.search(factor, content);

		if (!list.isEmpty()) {
			// �����ݴ���request
			show(request, list);
		}

		request.setAttribute("currentPage", "0");
		request.setAttribute("count", "1");

		request.getRequestDispatcher("/jsp/user/list.jsp").forward(request, response);
	}

	/**
	 * ������û�
	 * 
	 * @throws IOException
	 * @throws ServletException
	 * 
	 */
	public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		User user = WebUtil.copyRequestToBean(request, User.class);
		String confirm = request.getParameter("confirm");

		if (service.login(user.getName()) != null) {
			response.getWriter().write("<script>alert('�û��Ѵ���'); window.location='user?action=query';</script>");
			response.getWriter().flush();
			return;
		}

		if (!(user.getPassword().equals(confirm))) {
			response.getWriter().write("<script>alert('���ʧ��,���벻һ��'); window.location='user?action=query';</script>");
			response.getWriter().flush();
			return;
		}

		user.setId(WebUtil.getIdNo());
		// ��������
		if (service.save(user)) {
			response.getWriter().write("<script>alert('��ӳɹ�'); window.location='user?action=query';</script>");
			response.getWriter().flush();
		} else {
			response.getWriter().write("<script>alert('���ʧ��'); window.location='user?action=query';</script>");
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
	public void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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
	public void delAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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
	private void show(HttpServletRequest request, List<User> list) {

		HttpSession session = request.getSession(true);
		String rights = (String) session.getAttribute("rights");
		String strId = "";
		String users = "";
		if (rights.equals("admin")) {
			for (User user : list) {
				if (user.getId().equals("ROOT") || user.getRights().equals("admin"))
					continue;
				users += user.getAll() + ",";
				strId += user.getId() + ",";
			}
		}
		if (rights.equals("root")) {
			for (User user : list) {
				if (user.getId().equals("ROOT"))
					continue;
				users += user.getAll() + ",";
				strId += user.getId() + ",";
			}
		}

		request.setAttribute("users", users.substring(0, users.length() - 1));
		session.setAttribute("strId", strId.substring(0, strId.length() - 1));
	}

}
