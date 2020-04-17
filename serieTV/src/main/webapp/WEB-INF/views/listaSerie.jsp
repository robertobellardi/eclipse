<%@ include file="header.jsp" %>
<div class="table-responsive">
    <table class="table table-hover">
        <thead>
            <tr>
                <th scope="col">Nome</th>
                <th scope="col">Genere</th>
                <th scope="col">Visto</th>
                <th scope="col">Azione</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${lista}" var="film">
                <tr>
                    <td scope="row">${film.getNome()}</td>
                    <td>${film.getGenere().getGenere()}</td>
                    <td>${film.getAttiva()}</td>
                    <td>
                        <a href="visualizzaSerie?id=${film.getId()}" class="btn btn-dark btn-dark active" role="button" aria-pressed="true">Visualizza
                            locandina
                        </a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
<%@ include file="footer.jsp" %>