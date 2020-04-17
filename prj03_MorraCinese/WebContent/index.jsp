<%@page import="esempinaula.MorraCinese"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Hello JSP</title>
<style>
	td{border: solid;border-color:green;}
</style>
</head>
<body>

	<%//scriptlet %>

	<h1>Morra Cinese</h1>
	<a href="?scelta=carta">Carta</a>
	<a href="index.jsp?scelta=forbice">Forbice</a>
	<a href="index.jsp?scelta=sasso">Sasso</a>
	
<%
	
	String scelta=request.getParameter("scelta");
	String stampa="";
	int indice=-1;
	if((scelta!=null)){
		if(scelta.equals("carta"))
			indice=0;
		else if(scelta.equals("forbice"))
			indice=1;
		else if(scelta.equals("sasso"))
			indice=2;
		if(indice>=0 && indice<=2)				
			stampa=MorraCinese.risultato(indice,MorraCinese.sceltaComputer());			
%>
		<h1><%=stampa %></h1>
<%
	}
%>
	
		
	
</body>
</html>