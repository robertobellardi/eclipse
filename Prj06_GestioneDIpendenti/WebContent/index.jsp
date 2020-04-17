<%@page import="controller.LibroMatricola"%>
<%

LibroMatricola lm=new LibroMatricola();
session.setAttribute("libro", lm);


%>

<%@ include file="header.jsp"%> <!--importa altri file jsp per costruire dinamicamente
									la pagina e dividerla in contenitori-->

	<h1>Gestionale Dipendenti</h1>


























<%@ include file="footer.jsp"%>	