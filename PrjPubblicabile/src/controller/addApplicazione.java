package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Applicazione;

/**
 * Servlet implementation class addApplicazione
 */
@WebServlet("/addApplicazione")
public class addApplicazione extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Portale portale=Portale.getInstance();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		portale.addElement(new Applicazione((String)request.getParameter("nomeApp")));
		response.sendRedirect("index.jsp");
	}
}
