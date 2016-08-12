package servlets;

import java.io.IOException;


import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.generic.NEW;

import service.ShowTableDao;

/**
 * Servlet implementation class ShowServlet
 */
public class ShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowServlet() {
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
		ShowTableDao std = new ShowTableDao();
		@SuppressWarnings("rawtypes")
		List list = std.getStuList();
		int totalPage;
		if(list.size() % 10 == 0 ){
			totalPage = list.size() / 10;
		}else{
			totalPage = list.size() / 10 + 1;
		}
		int page = 1;
		if(list.size() >= 10){
			request.getSession().setAttribute("stuList", list.subList(0, 10));
		}else{
			request.getSession().setAttribute("stuList", list.subList(0, list.size()));
		}
		request.getSession().setAttribute("first", "1"); 
		request.getSession().setAttribute("last", totalPage);
		request.getSession().setAttribute("page", page);
		request.getSession().setAttribute("total", list.size());
		request.getRequestDispatcher("/showTable.jsp").forward(request, response);
	}
	
}
