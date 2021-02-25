package com.xnxy17jk2.util;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.util
 * @����: BaseServlet
 * @˵��: ������servlet�������д��ͨ����servlet���� 
 * 			ע�⣺�����ҵ��servlet��Ҫ�̳д��ࡣ
 * @����: Guo_SY
 * @����ʱ��: 2020��4��29�� ����12:42:15
 */
@SuppressWarnings("serial")
public class BaseServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// �õ�action�Ĳ���ֵ
		String action = request.getParameter("action");
		// ����action����ֵ���ö�Ӧ�ķ�����Լ��ǰ�᣺ actionֵ�ͷ������Ʊ���һ�£�����)
		// ͨ��������÷���,�õ������
		@SuppressWarnings("rawtypes")
		Class clazz = this.getClass();

		try {
			// �õ���������
			@SuppressWarnings("unchecked")
			Method method = clazz.getDeclaredMethod(action, HttpServletRequest.class, HttpServletResponse.class);

			// ���÷���
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
