package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ShowTableDao;

/**
 * Servlet implementation class RegisServlet
 */
public class RegisServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password1 = request.getParameter("password1");
		String password2 = request.getParameter("password2");
		if(!"".equals(password1) && password1 != null && !"".equals(username) && username != null ){
			if(password1.equals(password2)){
				if(!new ShowTableDao().usernameExists(username)){
					new ShowTableDao().insertUser(username, password1);
					response.sendRedirect("/web/login.jsp");
					return;
				}
			}
		}
		PrintWriter out = response.getWriter();
		out.println("<h1>注册失败</h1><hr>");
//		response.sendRedirect("/web/regis.jsp"); 
		request.getRequestDispatcher("/regis.jsp").forward(request, response);
		out.flush();
	}

}
