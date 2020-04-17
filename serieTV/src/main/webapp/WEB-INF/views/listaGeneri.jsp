<%@ include file="header.jsp" %>
<div class="table-responsive">
    <table class="table table-hover">
        <thead>
            <tr>
                <th scope="col">Id</th>
                <th scope="col">Nome Genere</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${generi}" var="genere">
                <tr>
                    <td scope="row">${genere.getId()}</td>
                    <td>${genere.getGenere()}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
<%@ include file="footer.jsp" %>