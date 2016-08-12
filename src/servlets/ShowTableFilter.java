package servlets;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class ShowTableFilter
 */
public class ShowTableFilter implements Filter {

    /**
     * Default constructor. 
     */
    public ShowTableFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("拦截器关闭");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("\r拦截开始:" + sdf.format(new Date()));
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
//		System.out.println(req.getContextPath());///web
//		System.out.println(req.getRequestURI());///web/login.jsp
		if("/LoginServlet".equals(req.getServletPath()) || "/RegisServlet".equals(req.getServletPath())){
			if("true".equals(req.getSession().getAttribute("login.jsp")) || "true".equals(req.getSession().getAttribute("regis.jsp"))){
				System.out.println("拦截无效:" + req.getServletPath());
				req.getSession().setAttribute("login.jsp", "false");
				req.getSession().setAttribute("regis.jsp", "false"); 
				chain.doFilter(request, response);
				return;
			} 
		}
		if("/regis.jsp".equals(req.getServletPath()) || "/login.jsp".equals(req.getServletPath()) || "/js/js.js".equals(req.getServletPath()) || "/testUsernameServlet".equals(req.getServletPath())){
			System.out.println("拦截无效:" + req.getServletPath());
			req.getSession().setAttribute("login.jsp", "true");
			req.getSession().setAttribute("regis.jsp", "true");  
			chain.doFilter(request, response);
			return; 
		}
		System.out.println("当前用户:" + req.getSession().getAttribute("username")); 
		if(req.getSession().getAttribute("username") != null){
			req.getSession().getAttribute("username").toString(); 
			chain.doFilter(request, response);
			System.out.println("拦截无效:" + req.getServletPath());
		}else{
			// TODO: handle exception
			System.out.println("拦截成功: " + req.getServletPath());
			res.sendRedirect("/web/login.jsp"); 
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("拦截器开启");
	}

}






