package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ShowTableDao;
import entity.Student;

/**
 * Servlet implementation class InsertServlet
 */
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
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
//		System.out.println("ok");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		Student stu = new Student();
		stu.setName(request.getParameter("name"));
		stu.setClas(request.getParameter("clas"));
		stu.setAddr(request.getParameter("addr"));
		if(new ShowTableDao().insertData(stu)){
			out.println("ok");
			out.println("<a href=/web/showTable.jsp>back</a><br>");
			out.println("<a href=/web/ShowServlet>see</a>");
			request.getRequestDispatcher("/ShowServlet").forward(request, response);
			
		}else{
			out.println("not ok");
			out.println("<a href=/web/showTable.jsp>back</a>");
		}
	}
	
}
