package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InserisciController
 */
@WebServlet("/addTask")
public class InserisciController extends HttpServlet {
	TaskController tc;
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("task")!=null && request.getParameter("categoria")!=null) {
			if(request.getSession().getAttribute("TaskList")==null) {
				tc=new TaskController();
				request.getSession().setAttribute("TaskList",tc);
			}
			else
				tc=(TaskController)request.getSession().getAttribute("TaskList");
			
			if(tc.addTask(request.getParameter("categoria"),request.getParameter("task")))
				response.getWriter().append("Inserito");
			else
				response.getWriter().append("Non inserito");
						
			response.sendRedirect("index.html");
		}
	
	}
}
