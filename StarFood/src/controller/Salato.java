package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Prodotto;

/**
 * Servlet implementation class Dolce
 */
@WebServlet("/salati")
public class Salato extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pagina = "salati";
		request.setAttribute("pagina", pagina);
		ArrayList<Prodotto> pr=Prodotti.filtraElenco("salati");
		Collections.sort(pr, new OrdinatorePrezzo());
		request.setAttribute("prodotti",pr);
		request.getRequestDispatcher("header.jsp").include(request, response);
		request.getRequestDispatcher("menu.jsp").include(request, response);
		request.getRequestDispatcher("content.jsp").include(request, response);
		request.getRequestDispatcher("footer.jsp").include(request, response);
	}

}
