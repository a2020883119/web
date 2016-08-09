package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ShowTableDao;

/**
 * Servlet implementation class PageServlet
 */
public class PageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PageServlet() {
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
		List list = std.getStuList();
		int totalPage = list.size() / 10 + 1;
		int page = Integer.valueOf(request.getParameter("p"));
		request.getSession().setAttribute("first", "1");
		request.getSession().setAttribute("last", totalPage);
		switch (Integer.valueOf(request.getParameter("n"))) {
		case 1:
			if(page != 1){
				request.getSession().setAttribute("page", page - 1);
				page--;
			}else{
				request.getSession().setAttribute("page", page);
			}
			request.getSession().setAttribute("stuList", list.subList(page * 10 - 10, page * 10));
			request.getRequestDispatcher("/showTable.jsp").forward(request, response);
			break;
		case 2:
			if(page != totalPage){
				request.getSession().setAttribute("page", page + 1);
				page++;
				request.getSession().setAttribute("page", page);
				if(page * 10 == list.size()){
					request.getSession().setAttribute("stuList", list.subList(page * 10 - 10, page * 10)); 
				}else{
					if(page == totalPage){
						request.getSession().setAttribute("stuList", list.subList(page * 10 - 10, list.size()));
					}else{
						request.getSession().setAttribute("stuList", list.subList(page * 10 - 10, page * 10)); 
					}
				}
			}
			request.getRequestDispatcher("/showTable.jsp").forward(request, response);
			break;
		case 3:
			request.getSession().setAttribute("page", totalPage);
			request.getSession().setAttribute("stuList", list.subList(totalPage * 10 - 10, list.size()));
			request.getRequestDispatcher("/showTable.jsp").forward(request, response);
			break;
		}
		
	}

}
