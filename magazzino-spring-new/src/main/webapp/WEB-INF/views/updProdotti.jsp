<%@ include file="header.jsp"%>

<h1>Aggiorna prodotto</h1>
<c:if test="${messaggio != null}">
<div class="alert alert-success" role="alert">
  ${messaggio}
</div>
</c:if>

<form method="post" action="modificaProdotto">

	<div class="form-group row">
		<div class="col-sm-1">
			<input class="form-control" type="text" id="id"
				name="id" value="${prodotto.id}" readonly="readonly">
		</div>
		<label for="descrizione" class="col-sm-2 col-form-label">descrizione</label>
		<div class="col-sm-4">
			<input class="form-control" type="text" id="descrizione"
				name="descrizione" value="${prodotto.descrizione}">
		</div>
		<label for="prezzo" class="col-sm-1 col-form-label">prezzo</label>
		<div class="col-sm-2">
			<input class="form-control" type="text" id="prezzo" name="prezzo" value="${prodotto.prezzo}">
		</div>
		<div class="col-sm-2">
			<button type="submit" class="btn btn-primary mb-2">modifica</button>
		</div>
	</div>



</form>


<%@ include file="footer.jsp"%>