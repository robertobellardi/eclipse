package controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Stampa
 */
@WebServlet("/Stampa")
public class Stampa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("header.jsp").include(request, response);
		request.getRequestDispatcher("view.jsp").include(request, response);
		request.getRequestDispatcher("footer.jsp").include(request, response);
		
	}

}
