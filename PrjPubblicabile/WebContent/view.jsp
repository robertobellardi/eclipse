<%@page import="controller.Portale"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Pubblicabile"%>

<% 
	ArrayList<Pubblicabile> portale=Portale.getInstance().getPortale();
%>
	<table class="table table-dark">
	  <thead>
	    <tr>
	      <th scope="col">Tipo</th>
	      <th scope="col">Nome campo</th>
	    </tr>
	  </thead>
	  <tbody>
	  
<% 
			for(int i=0;i<portale.size();i++) {
%>
				<tr>
					<td><%=portale.get(i).getClassName()%></td>
					<td><%=portale.get(i).getName()%></td>
				</tr>
<%
}
%>
	  </tbody>
</table>

<a class="btn btn-primary" href="index.jsp" role="button" aria-expanded="false">
    Torna alla home
</a>

