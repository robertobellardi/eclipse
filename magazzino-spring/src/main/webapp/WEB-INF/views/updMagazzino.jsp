<%@ include file="header.jsp" %>

<h1>Aggiorna magazzino</h1>
<div class="alert alert-success" role="alert">
  ${messaggio}
</div>

	<form method="post" action="modificaMagazzino">

	<div class="form-group row">
		<div class="col-sm-1">
			<input class="form-control" type="text" id="id"
				name="id" value="${magazzino.id}" readonly="readonly">
		</div>
		<label for="idProdotto" class="col-sm-1 col-form-label">Prodotto</label>
		<div class="col-sm-3">
			<input class="form-control" type="text" id="idProdotto"
				name="idProdotto" value="${magazzino.idProdotto}">
		</div>
		
		<label for="quantita" class="col-sm-1 col-form-label">quantità</label>
		<div class="col-sm-1">
			<input class="form-control" type="number" id="quantita"
				name="quantita" value="${magazzino.quantita}">
		</div>
		
		<label for="data" class="col-sm-1 col-form-label">data</label>
		<div class="col-sm-2">
			<input class="form-control" type="date" id="data" name="data"  value="${magazzino.data}">
		</div>
		
		<div class="col-sm-2">
			<button type="submit" class="btn btn-primary mb-2">modifica</button>
		</div>
	</div>

	</form>

<%@ include file="footer.jsp" %>