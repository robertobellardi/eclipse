<%@ include file="header.jsp" %>

<div class="card" style="width: 18rem;">
    <c:if test="${film != null}">
        <img src='${film.getImg()}' class="card-img-top" alt='${film.getNome()}'>
        <div class="card-body">
            <h5 class="card-title">${film.getNome()}</h5>
            <p class="card-text">${film.getGenere().getGenere()}</p>
            <p class="card-text">${film.getAttiva()}</p>
        </div>
    </c:if>
</div>

<%@ include file="footer.jsp" %>