package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cookie
 */
public class cookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		Cookie cookie = new Cookie("username", "zhangsan");
		cookie.setMaxAge(60 * 5);
		response.addCookie(cookie);
		out.println("<html><body><form action='cookie' method='post'><input type='submit' value='get cookie'></form></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		Cookie [] cookies = request.getCookies();
		out.println("<a href='cookie'>back</a><hr>");
		if(cookies != null){
			for(int i = 0; i < cookies.length; i++){
				Cookie temp = cookies[i];
				out.println(temp.getName() + " : " + temp.getValue() + "<br>");
			}
		}else{
			out.println("<p>no cookie</p>");
		}
		
	}

}
