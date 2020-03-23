<%@ include file="header.jsp" %>

<h1>Prodotti</h1>

<a href="addProdotti" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Aggiungi Prodotto</a>
<a href="addMagazzino" class="btn btn-secondary btn-lg active" role="button" aria-pressed="true">Aggiungi magazzino</a>

<div class="alert alert-success" role="alert">
  ${messaggio}
</div>

	<table class="table table-hover">
		<tr>
			<th>Prodotto</th>
			<th>Prezzo</th>
			<th></th>
			<th></th>
		</tr>
		<c:forEach items="${prodotti}" var="prod">

			<tr>
				<td>${prod.descrizione}</td>
				<td>${prod.prezzo}</td>
				<td>
					<a href="deleteProdotto?id=${prod.id}"><img class="" src="../img/trash.png" alt="elimina"></a>
				</td>
				<td>
					<a href="updateProdotto?id=${prod.id}"><span class="glyphicon glyphicon-search" aria-hidden="true"></span><img class="" src="../img/pen.png" alt="modifica"></a>
				</td>
			</tr>

		</c:forEach>

	</table>

<%@ include file="footer.jsp" %>