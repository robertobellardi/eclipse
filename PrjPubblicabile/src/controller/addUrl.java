package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Link;

/**
 * Servlet implementation class addUrl
 */
@WebServlet("/addUrl")
public class addUrl extends HttpServlet {

	private static final long serialVersionUID = 1L;
	Portale portale=Portale.getInstance();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		portale.addElement(new Link((String)request.getParameter("nomeUrl")));
		response.sendRedirect("index.jsp");
	}

}
