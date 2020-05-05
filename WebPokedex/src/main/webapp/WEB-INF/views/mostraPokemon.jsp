<%@ include file="header.jsp" %>

<div class="table-responsive">
    <table class="table table-hover">
        <thead>
            <tr>
                <th scope="col">Nome</th>
                <th scope="col">Mosse</th>
                <th scope="col">Tipo1</th>
                <th scope="col">Tipo2</th>
                <th scope="col">Totale</th>
                <th scope="col">Salute</th>
                <th scope="col">Attacco</th>
                <th scope="col">Difesa</th>
                <th scope="col">Attacco speciale</th>
                <th scope="col">Difesa speciale</th>
                <th scope="col">Velocità</th>
                <th scope="col">Immagine</th>
            </tr>
        </thead>
        <tbody>
            <c:if test="${pokemon!=null}">
                <tr>
                    <td scope="row">${poke.getNome()}</td>
                    <td>
                        <ul>
                            <c:forEach items="${pokemon.getListaMosse()}" var="mossa">
                                <li>Nome:   ${mossa.getNome()}</li>
                                <li>Tipo:   ${mossa.getTipo()}</li>
                            </c:forEach>
                        </ul>
                    </td>
                    <td>${pokemon.getTipo1()}</td>
                    <td>${pokemon.getTipo2()}</td>
                    <td>${pokemon.getTotale()}</td>
                    <td>${pokemon.getSalute()}</td>
                    <td>${pokemon.getAttacco()}</td>
                    <td>${pokemon.getDifesa()}</td>
                    <td>${pokemon.getAttaccoSpeciale()}</td>
                    <td>${pokemon.getDifesaSpeciale()}</td>
                    <td>${pokemon.getVelocita()}</td>
                    <td><img src=${poke.getImg()}></td>
                </tr>
            </c:if>
        </tbody>
    </table>
</div>

<%@ include file="footer.jsp" %>