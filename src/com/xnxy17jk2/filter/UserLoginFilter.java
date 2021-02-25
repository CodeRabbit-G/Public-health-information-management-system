package com.xnxy17jk2.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.filter
 * @����: UserLoginFilter
 * @����: δ��¼�û�������
 * @����: Guo_SY
 * @����ʱ��: 2020��5��2�� ����1:09:40
 */
public class UserLoginFilter implements Filter{
	
	
	public void init(FilterConfig filterConfig) throws ServletException {
	}
	
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		
		if(req.getSession().getAttribute("user")==null){
			req.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
		}else{
			chain.doFilter(request, response);
		}
	}
	public void destroy() {
		
	}
}
