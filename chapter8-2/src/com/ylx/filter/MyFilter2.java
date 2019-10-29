package com.ylx.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/Servlet1")
public class MyFilter2 implements Filter {
	public void init(FilterConfig fConfig) throws ServletException {
		// 过滤器对象在初始化时调用，可以配置一些初始化参数
	}
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		// 用于拦截用户的请求，如果和当前过滤器的拦截路径匹配，该方法会被调用
		PrintWriter out=resp.getWriter();
		out.write("Hello MyFilter2");
	}
	public void destroy() {
		// 过滤器对象在销毁时自动调用，释放资源
	}
}
