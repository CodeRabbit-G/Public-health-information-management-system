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
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.filter
 * @类名: UserLoginFilter
 * @描述: 未登录用户过滤器
 * @作者: Guo_SY
 * @创建时间: 2020年5月2日 下午1:09:40
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
