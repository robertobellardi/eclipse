<%@page import="controller.LibroMatricola"%>
<%@ page import="model.Dipendente"%>

<%
if(request.getParameter("inserisci") != null){

	String nome=request.getParameter("nome");
	String cognome=request.getParameter("cognome");
	if(session.getAttribute("libro") != null){
		LibroMatricola lm=(LibroMatricola)session.getAttribute("libro");
		lm.addDipendente(new Dipendente(nome,cognome));	
		response.sendRedirect("elenco.jsp");
	}

}

 %>