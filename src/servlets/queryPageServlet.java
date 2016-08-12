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
public class queryPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public queryPageServlet() {
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
//		ShowTableDao std = new ShowTableDao();
//		List list = std.getStuList();
		List list = (List) request.getSession().getAttribute("stuListQ");
		int totalPage;
		if(list.size() % 10 == 0 ){
			totalPage = list.size() / 10;
		}else{
			totalPage = list.size() / 10 + 1;
		}
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
			if(list.size() >= 10){
				request.getSession().setAttribute("stuQueryList", list.subList(page * 10 - 10, page * 10));
			}else{
				request.getSession().setAttribute("stuQueryList", list.subList(0, list.size())); 
			}
			request.getRequestDispatcher("/showQueryTable.jsp").forward(request, response);
			break;
		case 2:
			if(page != totalPage){
				request.getSession().setAttribute("page", page + 1);
				page++;
				request.getSession().setAttribute("page", page);
				if(page * 10 == list.size()){
					request.getSession().setAttribute("stuQueryList", list.subList(page * 10 - 10, page * 10)); 
				}else{
					if(page == totalPage){
						request.getSession().setAttribute("stuQueryList", list.subList(page * 10 - 10, list.size()));
					}else{
						request.getSession().setAttribute("stuQueryList", list.subList(page * 10 - 10, page * 10)); 
					}
				}
			}
			request.getRequestDispatcher("/showQueryTable.jsp").forward(request, response);
			break;
		case 3:
			request.getSession().setAttribute("page", totalPage);
			request.getSession().setAttribute("stuQueryList", list.subList(totalPage * 10 - 10, list.size()));
			request.getRequestDispatcher("/showQueryTable.jsp").forward(request, response);
			break;
		}
		
	}

}
