package controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Animale;
import model.Cane;
import model.Cibo;
import model.Commestibile;
import model.Gatto;
import model.Secco;
import model.Topo;
import model.Umido;

/**
 * Servlet implementation class Router
 */
@WebServlet("/negozio")
public class Router extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Secco crocchette=new Secco();
		crocchette.setNome("Trainer");
		crocchette.setQuantita(12);
		
		Umido bustine=new Umido();
		bustine.setNome("Almo nature");
		bustine.setQuantita(2.4);
		
		List<Animale> rifugioAnimali=Arrays.asList(
				new Cane(),
				new Cane(),
				new Cane(),
				new Gatto(),
				new Gatto(),
				new Gatto(),
				new Topo(),
				new Topo(),
				new Topo()
				);
		
		RifugioAnimali rifugio=new RifugioAnimali(rifugioAnimali);
		
		Commestibile c;
		double rand;
		for (Animale animale : rifugioAnimali) {
			rand=Math.random();
			if(rand >0.67)
				c=crocchette;
			else if(rand > 0.34)
				c=bustine;
			else
				c=(Topo)rifugioAnimali.get(6);
			
			animale.mangia(c);
		}
		
		StringBuilder sb= new StringBuilder();
		/*
		for (Animale animale : rifugioAnimali) {
			sb.append(animale.toString()+"<br>");
		}*/
		
		for (Animale animale : rifugioAnimali) {
			sb.append(animale.toString()+" ---> "+animale.isSoddisfazione()+"<br>");
		}
		
		response.getWriter().append(sb);		
	}
}
