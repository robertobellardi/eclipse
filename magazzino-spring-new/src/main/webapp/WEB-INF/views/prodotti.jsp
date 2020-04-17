<%@ include file="header.jsp" %>

<h1>Prodotti</h1>

<a href="addProdotti" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Aggiungi Prodotto</a>
<a href="addMagazzino" class="btn btn-secondary btn-lg active" role="button" aria-pressed="true">Aggiungi magazzino</a>

<c:if test="${messaggio != null}">
<div class="alert alert-success" role="alert">
  ${messaggio}
</div>
</c:if>

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
					<a href="deleteProdotto?id=${prod.id}"><i class="material-icons">delete</i></a>
				</td>
				<td>
					<a href="updateProdotto?id=${prod.id}"><i class="material-icons">edit</i></a>
				</td>
			</tr>

		</c:forEach>

	</table>

<%@ include file="footer.jsp" %>