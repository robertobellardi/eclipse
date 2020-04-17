package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Router
 */
@WebServlet("/Router")
public class Router extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Registro r =new Registro();
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		request.getRequestDispatcher("header.jsp").include(request, response);
		request.getRequestDispatcher("menu.jsp").include(request, response);
		
		StringBuilder sb=new StringBuilder();
		
		if(request.getParameter("page")!=null) {
			switch(request.getParameter("page")) {			
				case "registro":
					sb.append("<h1>Questo è il registro</h1><hr><br><table>");
					for(int i=0;i<r.getRegistro().size();i++) {
						sb.append("<tr><td>"+r.getRegistro().get(i).getNome()+"</td>");
						sb.append("<td>"+r.getRegistro().get(i).getCognome()+"</td>");
						sb.append("<td><a href='Router?page='presenti'&presente="+i+"'>presente</a></td>");
						sb.append("<td><a href='Router?'presenti'&presente='"+i+"'>assente</a></td></tr>");						
					}
					sb.append("</table>");
					break;
					
				case "presenti":					
					if(request.getParameter("parameter")!=null)
						r.getPresenti().add(r.getRegistro().get(Integer.parseInt(request.getParameter("presente"))));
					
					sb.append("<h1>Questo è il registro dei presenti</h1><hr><br><table>");
					for(int i=0;i<r.getPresenti().size();i++) {
						sb.append("<tr><td>"+r.getPresenti().get(i).getNome()+"</td>");
						sb.append("<td>"+r.getPresenti().get(i).getCognome()+"</td>");
						sb.append("<td><a href='#'</a></td>");
						sb.append("<td><a href='#'</a></td></tr>");						
					}
					sb.append("</table>");
					break;
					
				case "assenti":
					sb.append("Questo è il registro degli assenti");
					break;
					
				default:
					break;
			}
			
			response.getWriter().append(sb);			
		}	
		else
			response.getWriter().append("<h1>non hai passato nulla </h1>");
		
		request.getRequestDispatcher("content.jsp").include(request, response);		
		request.getRequestDispatcher("footer.jsp").include(request, response);		
	}

}
