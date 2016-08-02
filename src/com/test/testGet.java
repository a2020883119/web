package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class testGet
 */
public class testGet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public void init(){
		System.out.println(this.getServletName()+" init()");
	}
    @Override
	public void destroy() {
		// TODO Auto-generated method stub
    	System.out.println(this.getServletName()+" destroy()");
		super.destroy();
		
	}
	/**
     * @see HttpServlet#HttpServlet()
     */
    public testGet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		System.out.println("doGet");
		PrintWriter out = response.getWriter();
		out.println("<h1>doGet</h1>");
		out.println("<html><head><title></title></head><body>");
		out.println("<form action='testGet_servlet' method='get' ><input type='text' name='username'><input type='password' name='password'><input type='submit' value='get'></form>");
		out.println("</body></html><hr>");
		out.println("<h1>dopost</h1>");
		out.println("<html><head><title></title></head><body>");
		out.println("<form action='testGet_servlet' method='post' ><input type='text' name='username'><input type='password' name='password'><input type='submit' value='post'></form>");
		out.println("</body></html><hr>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost");
		PrintWriter out = response.getWriter();
		out.println("<h1>doPost</h1>");
	}

}
