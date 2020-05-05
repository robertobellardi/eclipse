package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReportTask
 */
@WebServlet("/ReportTask")
public class ReportTask extends HttpServlet {
	private static final long serialVersionUID = 1L;
	TaskController tc;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getSession().getAttribute("TaskList")==null) {
			tc=new TaskController();
			request.getSession().setAttribute("TaskList",tc);
		}
		tc=(TaskController)request.getSession().getAttribute("TaskList");
		
		if(tc!=null) {	
			StringBuilder sb=new StringBuilder();
			for(String[] as:tc.getAllTask()) {
				sb.append("<h1>"+as[0]+"-----"+as[1]+"</h1>");
			}
			response.getWriter().append(sb.toString());
		}
		else
			response.getWriter().append("Non hai ancora inserito nulla");
	
	}

}
