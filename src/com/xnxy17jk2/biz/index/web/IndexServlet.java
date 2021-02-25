package com.xnxy17jk2.biz.index.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xnxy17jk2.util.BaseServlet;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.biz.index.web
 * @����: IndexServlet
 * @˵��: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��4��29�� ����1:07:04
 */
public class IndexServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;
	
	/**
	 * ��ҳ
	 * @throws IOException 
	 * @throws ServletException 
	 * 
	 */
	public void manageIndex(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		
		request.getRequestDispatcher("/jsp/manageIndex.jsp").forward(request, response);
	}
	
	/**
	 * �˳�ϵͳ
	 * @throws IOException 
	 * @throws ServletException 
	 * 
	 */
	public void quit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(true);
		session.invalidate();
		request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
	}
}
