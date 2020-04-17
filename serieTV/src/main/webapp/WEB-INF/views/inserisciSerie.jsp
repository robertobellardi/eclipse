<%@ include file="header.jsp" %>
<form class="form-serieTV" method="post" action="aggiungiSerie">
  <div class="form-group">
    <div class="form-group col-md-6">
      <label for="nome">Inserisci titolo</label>
      <input type="text" class="form-control" id="nome" placeholder="Inserisci titolo del film" name="nome">
    </div>
  </div>
  <div class="form-group">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" id="attiva" name="attiva">
      <label class="form-check-label" for="attiva">
        Seleziona se la stai guardando
      </label>
    </div>
  </div>
  <div class="form-group">
    <div class="form-group col-md-4">
      <label for="genere">Genere</label>
      <select id="genere" name="genere" class="form-control">
        <option selected>Scegli un genere</option>
        <c:forEach items="${generi}" var="genere">
          <option value=${genere.getId()}>${genere.getGenere()}</option>   
            </c:forEach>        
      </select>
    </div>
  </div>
  <div class="form-group">
    <div class="form-group col-md-6">
      <label for="img">Inserisci percorso immagine</label>
      <input type="text" class="form-control" id="img" placeholder="Inserisci percorso dell' immagine del film" name="img">
    </div>
  </div>
  
  <button type="submit" class="btn btn-primary">Inserisci</button>
</form>
<%@ include file="footer.jsp" %>