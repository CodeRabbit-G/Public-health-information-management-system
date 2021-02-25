package com.xnxy17jk2.util;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.util
 * @类名: ImageServlet
 * @说明: 用于显示验证码的servlet
 * @作者: Guo_SY
 * @创建时间: 2020年4月29日 下午12:58:23
 */
public class ImageServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//得到session对象
		HttpSession session = request.getSession();
		/**
		 * 把验证码输出到浏览器
		 */
		OutputStream out = response.getOutputStream();
		String code = ValidateCodeUtil.genNewCode(out);
		//把验证保存到session域中,以备用户登录时校验之时用
		session.setAttribute("sCode", code);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
