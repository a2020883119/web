package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ShowTableDao;
import entity.Student;

/**
 * Servlet implementation class QueryServlet
 */
public class QueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryServlet() {
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
		Student stu = new Student();
		if(!"".equals(request.getParameter("id"))){
			stu.setId(Integer.valueOf(request.getParameter("id")));
		}else{
			stu.setId(0);
		}
		stu.setName(request.getParameter("name"));
		stu.setClas(request.getParameter("clas"));
		stu.setAddr(request.getParameter("addr"));
		request.getSession().setAttribute("stuList", new ShowTableDao().getQueryStuList(stu));
		request.getRequestDispatcher("/showTable.jsp").forward(request, response);
	}

}
