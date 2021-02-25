package com.xnxy17jk2.util;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.util
 * @类名: BaseServlet
 * @说明: 基础的servlet，该类中存放通常的servlet代码 
 * 			注意：具体的业务servlet需要继承此类。
 * @作者: Guo_SY
 * @创建时间: 2020年4月29日 下午12:42:15
 */
@SuppressWarnings("serial")
public class BaseServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 得到action的参数值
		String action = request.getParameter("action");
		// 根据action参数值调用对应的方法（约定前提： action值和方法名称保持一致！！！)
		// 通过反射调用方法,得到类对象
		@SuppressWarnings("rawtypes")
		Class clazz = this.getClass();

		try {
			// 得到方法对象
			@SuppressWarnings("unchecked")
			Method method = clazz.getDeclaredMethod(action, HttpServletRequest.class, HttpServletResponse.class);

			// 调用方法
			method.invoke(this, request, response);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
