package com.xnxy17jk2.biz.index.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xnxy17jk2.util.BaseServlet;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.biz.index.web
 * @类名: IndexServlet
 * @说明: 类说明
 * @作者: Guo_SY
 * @创建时间: 2020年4月29日 下午1:07:04
 */
public class IndexServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 主页
	 * @throws IOException 
	 * @throws ServletException 
	 * 
	 */
	public void manageIndex(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		
		request.getRequestDispatcher("/jsp/manageIndex.jsp").forward(request, response);
	}
	
	/**
	 * 退出系统
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
