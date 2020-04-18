<%@ include file="header.jsp" %>
<div class="table-responsive">
    <table class="table table-hover">
        <thead>
            <tr>
                <th scope="col">Impegno</th>
                <th scope="col">Data</th>
                <th scope="col">Ora di inizio</th>
                <th scope="col">Ora di fine</th>
                <th scope="col">Nome</th>
                <th scope="col">Cognome</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${appuntamenti}" var="appuntamento">
                <tr>
                    <td scope="row">${appuntamento.getArgomento()}</td>
                    <td>${appuntamento.getData()}</td>
                    <td>${appuntamento.getOraInizio()}</td>
                    <td>${appuntamento.getOraFine()}</td>
                    <td>${appuntamento.getUtente().getNome()}</td>
                    <td>${appuntamento.getUtente().getCognome()}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

<c:if test="${messaggio != null}">
    <div class="alert ${alert}" role="alert">
        ${messaggio}
    </div>
</c:if>

<form method="post" action="inserisciAppuntamento">
    <h1 class="text-center">Inserisci un nuovo appuntamento</h1>
    <div class="form-row">
        <div class="form-group col-md-6">
            <label for="argomento">Argomento appuntamento</label>
            <input type="text" class="form-control" id="argomento" placeholder="Inserisci l'argomento dell'appuntamento"
                name="argomento">
        </div>
        <div class="form-group col-md-6">
            <label for="data">Inserisci la data</label>
            <input type="date" class="form-control" id="data" placeholder="Inserisci la data" name="data">
        </div>
    </div>
    <div class="form-row">
        <div class="form-group col-md-6">
            <label for="oraInizio">Inserisci l'orario di inizio</label>
            <input type="time" class="form-control" id="oraInizio" placeholder="Inserisci l'orario di inizio"
                name="oraInizio">
        </div>
        <div class="form-group col-md-6">
            <label for="oraFine">Inserisci l'orario di fine</label>
            <input type="time" class="form-control" id="oraFine" placeholder="Inserisci l'orario di fine"
                name="oraFine">
        </div>
    </div>
    <c:if test="${utente != null}">
        <div class="form-group col-md-4">
            <label for="utente">State</label>
            <select id="utente" class="form-control" name="utente">
                <option value="${utente.getId()}" selected>${utente.getNome()} - ${utente.getCognome()}</option>
            </select>
        </div>
    </c:if>
    <button type="submit" class="btn btn-dark">Inserisci appuntamento</button>
</form>


<%@ include file="footer.jsp" %>