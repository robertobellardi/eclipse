package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Testo;

/**
 * Servlet implementation class addTesto
 */
@WebServlet("/addTesto")
public class addTesto extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Portale portale=Portale.getInstance();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		portale.addElement(new Testo((String)request.getParameter("nomeTesto")));
		response.sendRedirect("index.jsp");
	}

}
