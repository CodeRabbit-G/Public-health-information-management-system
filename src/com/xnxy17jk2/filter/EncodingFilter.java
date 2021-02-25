package com.xnxy17jk2.filter;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.util
 * @����: EncodingFilter
 * @˵��: ϵͳ��ȫ������������������
 * 			������װ����ģʽ��request�������װ�Σ���д��صĻ�ȡ�����ķ���
 * @����: Guo_SY
 * @����ʱ��: 2020��4��29�� ����12:51:53
 */
public class EncodingFilter implements Filter {
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		MyRequest myRequest = new MyRequest((HttpServletRequest) request);
		response.setContentType("text/html;charset=utf-8");
		chain.doFilter(myRequest, response);
	}
}

/**
 * request��װ����
 */
class MyRequest extends HttpServletRequestWrapper {

	private HttpServletRequest request;

	public MyRequest(HttpServletRequest request) {
		super(request);

		this.request = request;
	}

	@Override
	public String getParameter(String name) {
		String value = null;
		try {
			/**
			 * Post��ʽ
			 */
			this.request.setCharacterEncoding("utf-8");
			value = this.request.getParameter(name);
			/**
			 * Get��ʽ���ֶ�����
			 */
			if ("GET".equals(this.request.getMethod())) {
				if (value != null) {
					value = new String(value.getBytes("iso-8859-1"), "utf-8");
				}
			}
			return value;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Override
	public String[] getParameterValues(String name) {
		try {
			/**
			 * Post��ʽ
			 */
			this.request.setCharacterEncoding("utf-8");
			String[] values = this.request.getParameterValues(name);
			/**
			 * Get�������ֶ�����
			 */
			if ("GET".equals(this.request.getMethod())) {
				if (values != null) {
					String[] newParam = new String[values.length];
					for (int i = 0; i < values.length; i++) {
						newParam[i] = new String(values[i].getBytes("iso-8859-1"), "utf-8");
					}
					return newParam;
				}
			}
			return values;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Map getParameterMap() {
		try {
			
			request.setCharacterEncoding("utf-8");
			Map map = request.getParameterMap();
			
			if ("GET".equals(request.getMethod())) {
				if (map != null) {
					Map newMap = new HashMap();
					Set<Entry> set = map.entrySet();
					for (Entry entry : set) {
						String[] value = (String[]) entry.getValue();

						// ��Map��value���ַ������飩�������½��룬֮������µ��ַ�������
						String[] newValue = new String[value.length];
						for (int i = 0; i < newValue.length; i++) {
							newValue[i] = new String(value[i].getBytes("iso-8859-1"), "utf-8");
						}
						newMap.put(entry.getKey(), newValue);
					}
					return newMap;
				}
			}
			return map;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}