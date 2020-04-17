<%@ include file="header.jsp" %>

<c:if test="${messaggio != null}">
    <div class="alert alert-danger" role="alert">
        ${messaggio}
    </div>
</c:if>

<form method="post" action="checkLogin">
    <div class="form-row">
        <div class="form-group col-md-6">
            <label for="nome">Nome</label>
            <input type="text" class="form-control" id="nome" placeholder="Inserisci il nome" name="nome">
        </div>
        <div class="form-group col-md-6">
            <label for="cognome">Cognome</label>
            <input type="text" class="form-control" id="cognome" placeholder="Inserisci il cognome" name="cognome">
        </div>
    </div>
    <div class="form-group">
        <label for="password">Password</label>
        <input type="password" class="form-control" id="password" placeholder="Inserisci la password" name="password">
    </div>
    <button type="submit" class="btn btn-dark">Log in</button>
</form>


<%@ include file="footer.jsp" %>