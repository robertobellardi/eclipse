<form action="addApplicazione" method="post">
  <div class="form-group">
    <label for="app">Inserisci il nome dell'applicazione</label>
    <input id="app" type="text" class="form-control" name="nomeApp" placeholder="inserisci nome app">
  </div>
  <button type="submit" class="btn btn-primary">Crea applicazione</button>
</form>

<form action="addUrl" method="post">  
  <div class="form-group">
    <label for="url">Inserisci l'url</label>
    <input id="url" type="text" class="form-control" name="nomeUrl" placeholder="Inserisci l'url">
  </div>
  <button type="submit" class="btn btn-primary">Crea link</button>
</form>

<form action="addTesto" method="post">  
  <div class="form-group">
    <label for="testo">Inserisci il testo</label>
    <input id="testo" type="text" class="form-control" name="nomeTesto" placeholder="Inserisci il testo">
  </div>
  <button type="submit" class="btn btn-primary">Crea testo</button>
</form>
<hr>
<form action="Stampa" method="post">  
  <button type="submit" class="btn btn-primary">Stampa la lista di elementi pubblicabili</button>
</form>

