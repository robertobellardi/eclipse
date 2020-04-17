<%@ include file="header.jsp" %>

	<h1>Magazzino</h1>

<a href="addMagazzino" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Aggiungi magazzino</a>
<a href="addProdotti" class="btn btn-secondary btn-lg active" role="button" aria-pressed="true">Aggiungi Prodotto</a>
<c:if test="${messaggio != null}">
<div class="alert alert-success" role="alert">
  ${messaggio}
</div>
</c:if>
	<table class="table table-hover">
		<tr>
			<th>Prodotto</th>
			<th>Quantita</th>
			<th>Data</th>
			<th></th>
			<th></th>
		</tr>
		<c:forEach items="${movimenti}" var="mov">

			<tr>
				<td>${mov.idProdotto}</td>
				<td>${mov.quantita}</td>
				<td>${mov.data}</td>
				<td>
					<a href="deleteMagazzino?id=${mov.id}"><img class="" src="../magazzino/img/trash.png" alt="elimina"></a>
				</td>
				<td>
					<a href="updateMagazzino?id=${mov.id}"><img class="" src="../magazzino/img/pen.png" alt="modifica"></a>
				</td>				
			</tr>

		</c:forEach>

	</table>

<%@ include file="footer.jsp" %>