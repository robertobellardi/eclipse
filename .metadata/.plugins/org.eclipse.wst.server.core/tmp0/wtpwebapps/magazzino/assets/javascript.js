window.onload = function() {
	$("#carica").click(aggiungiProdotto);
	$("#scarica").click(rimuoviProdotto);
	$("#magazzino").click(scaricaMagazzino);
	$("#report").click(scaricaRapporto);
}

function aggiungiProdotto() {
	$("#center").remove();
	$("body").append($("<div id='center'></div>"))

	var form = $("<form class='formProdotto'></form>");

	var divNome = $("<div class='form-group'>"
			+ "<label for='nome'>Inserisci il nome</label>"
			+ "<input type='text' class='form-control' id='nome' placeholder='Nome prodotto'>"
			+ "</div>");

	var divPrezzo = $("<div class='form-group'>"
			+ "<label for='prezzo'>Inserisci il prezzo</label>"
			+ "<input type='number' class='form-control' id='prezzo' placeholder='Prezzo prodotto'>"
			+ "</div>");

	var divQuantita = $("<div class='form-group'>"
			+ "<label for='quantita'>Inserisci la quantita</label>"
			+ "<input type='number' class='form-control' id='quantita' placeholder='Quantità prodotto'>"
			+ "</div>");

	var bottone = $("<button id='inviaProdotto' type='button' class='btn btn-dark'>Inserisci</button>");

	form.append(divNome);
	form.append(divPrezzo);
	form.append(divQuantita);
	form.append(bottone);
	$("#center").append(form);
	$("#inviaProdotto").click(inviaProdotto);
}

function inviaProdotto() {
	var nome = $("#nome").val();
	var prezzo = $("#prezzo").val();
	var quantita = $("#quantita").val();

	console.log(nome + "-" + prezzo + "-" + quantita);

	var ajax = $.post("inserisciProdotto", {
		"descrizione" : nome,
		"prezzo" : prezzo,
		"quantita" : quantita
	}, function(ajaxObj, status) {
		console.log("status richiesta login: " + status);
	}).fail(function(ajaxO, ajaxStatus, ajaxObj) {
		console.log("Errore richiesta login");
	}).done(function(ajaxO, ajaxStatus, ajaxObj) {
		if (ajaxO["inserimento"]) {
			$("#nome").val("");
			$("#prezzo").val("");
			$("#quantita").val("");
		}
	});
}

function rimuoviProdotto() {
	$("#center").remove();

	var ajax = $.post("scaricaProdotti", {}, function(ajaxObj, status) {
		console.log("status richiesta login: " + status);
	}).fail(function(ajaxO, ajaxStatus, ajaxObj) {
		console.log("Errore richiesta login");
	}).done(function(ajaxO, ajaxStatus, ajaxObj) {
		if (!ajaxO["risposta"])
			caricaProdotti(ajaxO);
	});
}

function caricaProdotti(prodotti) {
	$("body").append($("<div id='center'></div>"));

	var form = ("<div class='input-group mb-3'>"
			+ "<select id='selezionato' class='custom-select'>"
			+ "<option selected>Scegli quale prodotto eliminare ...</option>");

	for (x in prodotti) {
		form += "<option id='"+x+"' value='" + x + "'>" + prodotti[x]["descrizione"]
				+ "</option>";
	}
	form += "</select>"
			+ "<div class='input-group-append'>"
			+ "<button id='eliminaProdotto' class='btn btn-outline-dark' type='button'>Elimina</button></div>"
			+ "</div>";
	$("#center").append(form);

	$("#eliminaProdotto").click(eliminaProdotto);
}

function eliminaProdotto() {
	var id = $("#selezionato").val();

	var ajax = $.post("eliminaProdotto", {
		"id" : id
	}, function(ajaxObj, status) {
		console.log("status richiesta login: " + status);
	}).fail(function(ajaxO, ajaxStatus, ajaxObj) {
		console.log("Errore richiesta login");
	}).done(function(ajaxO, ajaxStatus, ajaxObj) {
		if (ajaxO["eliminazione"])
			$("#"+id).remove();
	});
}

function scaricaMagazzino() {
	var ajax = $.post("scaricaMagazzino", {}, function(ajaxObj, status) {
		console.log("status richiesta login: " + status);
	}).fail(function(ajaxO, ajaxStatus, ajaxObj) {
		console.log("Errore richiesta login");
	}).done(function(ajaxO, ajaxStatus, ajaxObj) {
		if (!ajaxO["risposta"])
			creaMagazzino(ajaxO);
	});
}

function scaricaRapporto() {
	var ajax = $.post("scaricaRapporto", {}, function(ajaxObj, status) {
		console.log("status richiesta login: " + status);
	}).fail(function(ajaxO, ajaxStatus, ajaxObj) {
		console.log("Errore richiesta login");
	}).done(function(ajaxO, ajaxStatus, ajaxObj) {
		if (!ajaxO["risposta"])
			creaRapporto(ajaxO);
	});
}

function creaMagazzino(magazzino) {
	$("#center").remove();
	$("body").append($("<div id='center'></div>"));

	var tabella = $("<table id='tabellaMagazzino' class='table table-dark'>"
			+ "<thead>" + "<tr>" + "<th scope='col'>Prodotto</th>"
			+ "<th scope='col'>Prezzo</th>" + "<th scope='col'>Quantità</th>"
			+ "</thead>" + "<tbody></tbody>))");

	$("#center").append(tabella);

	for (x in magazzino) {
		var prodotto = $("<tr>" + "<th scope='row'>"
				+ magazzino[x]["descrizione"] + "</th>" + "<td>"
				+ magazzino[x]["prezzo"] + "</td>" + "<td>"
				+ magazzino[x]["quantita"] + "</td></tr>");
		$("#tabellaMagazzino").append(prodotto);
	}
}

function creaRapporto(rapporto) {
	$("#center").remove();
	$("body").append($("<div id='center'></div>"));

	var tabella = $("<table id='tabellaMagazzino' class='table table-dark'>"
			+ "<thead>" + "<tr>" + "<th scope='col'>Prodotto</th>"
			+ "<th scope='col'>Transazione</th>"
			+ "<th scope='col'>Quantità</th>" + "</thead>"
			+ "<tbody></tbody>))");

	$("#center").append(tabella);

	var operazione;

	for (x in rapporto) {
		if (rapporto[x]["tipo"] == "+")
			operazione = "acquisto";
		else
			operazione = "vendita";

		var prodotto = $("<tr>" + "<th scope='row'>"
				+ rapporto[x]["descrizione"] + "</th>" + "<td>" + operazione
				+ "</td>" + "<td>" + rapporto[x]["quantita"] + "</td></tr>");
		$("#tabellaMagazzino").append(prodotto);
	}
}