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
            <c:forEach items="${pokemons}" var="poke">
                <tr>
                    <td scope="row">${poke.getNome()}</td>
                    <td>
                        <ul>
                            <c:forEach items="${poke.getListaMosse()}" var="mossa">
                                <li>Nome:   ${mossa.getNome()}</li>
                                <li>Tipo:   ${mossa.getTipo()}</li>
                            </c:forEach>
                        </ul>
                    </td>
                    <td>${poke.getTipo1()}</td>
                    <td>${poke.getTipo2()}</td>
                    <td>${poke.getTotale()}</td>
                    <td>${poke.getSalute()}</td>
                    <td>${poke.getAttacco()}</td>
                    <td>${poke.getDifesa()}</td>
                    <td>${poke.getAttaccoSpeciale()}</td>
                    <td>${poke.getDifesaSpeciale()}</td>
                    <td>${poke.getVelocita()}</td>
                    <td><img src=${poke.getImg()}></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

<%@ include file="footer.jsp" %>