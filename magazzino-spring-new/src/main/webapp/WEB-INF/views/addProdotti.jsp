<%@ include file="header.jsp"%>


<c:if test="${messaggio != null}">
<div class="alert alert-success" role="alert">
  ${messaggio}
</div>
</c:if>

<form method="post" action="aggiungiProdotto">

	<div class="form-group row">
		<label for="descrizione" class="col-sm-2 col-form-label">descrizione</label>
		<div class="col-sm-4">
			<input class="form-control" type="text" id="descrizione"
				name="descrizione">
		</div>
		<label for="prezzo" class="col-sm-2 col-form-label">prezzo</label>
		<div class="col-sm-2">
			<input class="form-control" type="text" id="prezzo" name="prezzo">
		</div>
		<div class="col-sm-2">
			<button type="submit" class="btn btn-primary mb-2">aggiungi</button>
		</div>
	</div>



</form>


<%@ include file="footer.jsp"%>