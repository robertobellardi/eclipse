<%@ include file="header.jsp" %>

<c:if test="${messaggio != null}">
<div class="alert alert-success" role="alert">
  ${messaggio}
</div>
</c:if>

	<form method="post" action="aggiungiMagazzino">

	<div class="form-group row">
		
		<label for="idProdotto" class="col-sm-1 col-form-label">Prodotto</label>
		<div class="col-sm-4">
<!-- 			<input class="form-control" type="text" id="idProdotto"
				name="idProdotto"> -->
				
			<select class="form-control" name="idProdotto">
				
				<c:forEach items="${prodotti}" var="prodotto">
				<option value="${prodotto.getId()}">${prodotto.getDescrizione()}</option>
				</c:forEach>
			
			</select>
				
		</div>
		
		<label for="quantita" class="col-sm-1 col-form-label">quantità</label>
		<div class="col-sm-1">
			<input class="form-control" type="number" id="quantita"
				name="quantita">
		</div>
		
		<label for="data" class="col-sm-1 col-form-label">data</label>
		<div class="col-sm-2">
			<input class="form-control" type="date" id="data" name="data">
		</div>
		
		<div class="col-sm-2">
			<button type="submit" class="btn btn-primary mb-2">aggiungi</button>
		</div>
	</div>

	</form>

<%@ include file="footer.jsp" %>