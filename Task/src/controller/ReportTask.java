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
			sb.append("<table><tr><th>oggetto</th><th>categoria</th></tr>");
			for(String[] as:tc.getAllTask()) {
				sb.append("<tr><td>"+as[0]+"</td><td>"+as[1]+"</td></tr>");
			}
			sb.append("</table>");
			response.getWriter().append(sb.toString());
		}
		else
			response.getWriter().append("Non hai ancora inserito nulla");
	
	}

}
