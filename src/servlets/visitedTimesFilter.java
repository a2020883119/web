package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import db.DBCon;

/**
 * Servlet Filter implementation class visitedTimesFilter
 */
public class visitedTimesFilter implements Filter {

    /**
     * Default constructor. 
     */
    public visitedTimesFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/** url:http://localhost:8080/web/visitedTimes.jsp
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		Statement st = null;
		ResultSet rs = null;
		Connection conn = null;
		int count = -1;
		String sql = "select * from count";
		DBCon db = new DBCon();	
		conn = db.getConn();
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				count = rs.getInt(2);
			}
			count++;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpServletRequest hsrequest = (HttpServletRequest)request;
		HttpSession session = hsrequest.getSession();
		session.setAttribute("count", count);
		sql = "update count set count = " + count + " where id = 1";
		PrintWriter out = response.getWriter();
		try {
			if(st.executeUpdate(sql) != 0){
				out.print(count);
			}else{
				out.print("error");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		db.safeClose(rs);
		db.safeClose(st);
		db.safeClose(conn);
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
