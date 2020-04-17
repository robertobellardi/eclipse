<%@ include file="header.jsp"%> <!--importa altri file jsp per costruire dinamicamente
									la pagina e dividerla in contenitori-->

	<h1>inserisci.jsp</h1>
	
	<form method="post" name="inserisci" action="doInserisci.jsp">
		<input type="text" name="nome" placeholder="Inserisci il nome">
		<input type="text" name="cognome" placeholder="Inserisci il cognome">
		<input type=submit name="inserisci" value="inserisci">
	</form>


























<%@ include file="footer.jsp"%>	