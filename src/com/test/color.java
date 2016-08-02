package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class color
 */
public class color extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public color() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String color = request.getParameter("color");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("</title>");
		out.println("</head>");
		out.println("<body bgcolor=" + color +">");
		out.println("<form action='color' method='post'>");
		out.println("<select name='color'>");
		out.println("<option value='red'>red</option>");
		out.println("<option value='blue'>blue</option>");
		out.println("<option value='black'>blcak<option>");
		out.println("<option value='yellow'>yellow</option>");
		out.println("<option value='gray'>gray</option>");
		out.println("</select>");
		out.println("<input type='submit' value='post'>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		out.println("");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String color = request.getParameter("color");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("</title>");
		out.println("</head>");
		out.println("<body bgcolor=" + color +">");
		out.println("<form action='color' method='post'>");
		out.println("<select name='color'>");
		out.println("<option value='red'>red</option>");
		out.println("<option value='blue'>blue</option>");
		out.println("<option value='yellow'>yellow</option>");
		out.println("<option value='gray'>gray</option>");
		out.println("</select>");
		out.println("<input type='submit' value='post'>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		out.println("");
	}

}
