<%@ page import="model.*,controller.*" %>
<%@ include file="header.jsp"%> <!--importa altri file jsp per costruire dinamicamente
									la pagina e dividerla in contenitori-->

	<h1>elenco Dipendenti</h1>

	<table>
		<tr>
			<th>Nome</th>
			<th>Cognome</th>
			<th>Matricola</th>
			<th>Stipendio</th>
		</tr>
		
<% 
		if(session.getAttribute("libro") != null){
			LibroMatricola lm=(LibroMatricola)session.getAttribute("libro");
			for(Dipendente d : lm.getDipendenti()){
				%>
				<tr>
					<td><%=d.getNome()%></td>
					<td><%=d.getCognome()%></td>
					<td><%=d.getMatricola()%></td>
					<td><%=d.calcolaStipendio()%></td>			
				</tr>
				
<%
			}
		}
%>
	
	</table>

























<%@ include file="footer.jsp"%>	