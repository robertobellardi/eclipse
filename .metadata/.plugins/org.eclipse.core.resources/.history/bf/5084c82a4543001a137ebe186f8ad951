window.onload = function () {
    $("#inserisci").click(controllaInserimento);
    scaricaCalendario();
}

function controllaInserimento(){	
	pulisciErroreCampi();
	pulisciErrore();
	
	var impegno=$("#impegno").val();
	var luogo=$("#luogo").val();
	var priorita=$("#priorita").val();
	var orario=$("#orario").val();
	
	//orario=getDateTime(orario);
			
	
	if(impegno == "")
		erroreCampi("#impegno");
	if(luogo == "")
		erroreCampi("#luogo");
	
	if(impegno != "" && luogo!= "" )
		sendDate(impegno,luogo,priorita,orario);
}

function sendDate(impegno,luogo,priorita,orario){
    var ajax = $.post("inserisciImpegno",{"impegno":impegno,"luogo":luogo,"priorita":priorita,"orario":orario,},function (ajaxObj, status) {
		console.log("status richiesta inserimento impegno: " + status);
	}).fail(function (ajaxO, ajaxStatus, ajaxObj) {
		console.log("Errore richiesta inserimento impegno");
	}).done(function (ajaxO, ajaxStatus, ajaxObj) {

    	if(ajaxO["inserimento"])
    		inserimentoAvvenuto(ajaxO);
    	else
    		erroreInserimento();
	});
}

function inserimentoAvvenuto(risp){	
	var str="<tr id='"+risp["id"]+"'><th scope='row'>"+
	risp["impegno"]+"</th><td>"+
	risp["luogo"]+"</td><td>"+
	risp["priorita"]+"</td><td>"+
	risp["orario"]+"</td><td>"+
	"<img class='icona' src='assets/clearIcon.png' alt='clearIcon.png'></td></tr>";
	
    $("#tablebody").append(str);
    agganciaFunzioneElimina($("#tablebody:last-child .icona"));    
}

function scaricaCalendario(){
    var ajax = $.post("scaricaCalendario",{},function (ajaxObj, status) {
		console.log("status richiesta scaricamento calendario: " + status);
	}).fail(function (ajaxO, ajaxStatus, ajaxObj) {
		console.log("Errore richiesta scaricamento calendario");
	}).done(function (ajaxO, ajaxStatus, ajaxObj) {
		var risp=ajaxO;
		
		console.log(risp);
		
		var str="";
		for(x in risp){
			str+="<tr id='"+risp[x]["id"]+"'><th scope='row'>"+
			risp[x]["impegno"]+"</th><td>"+
			risp[x]["luogo"]+"</td><td>"+
			risp[x]["priorita"]+"</td><td>"+
			risp[x]["orario"]+"</td><td>"+
			"<img class='icona' src='assets/clearIcon.png' alt='clearIcon.png'></td></tr>";
		}
		$("#tablebody").append(str);
		agganciaFunzioneElimina(".icona");
	});
}

function agganciaFunzioneElimina(tag){
	$(tag).click(eliminaImpegno);
}

function eliminaImpegno(){
	var id=$(this).parent().parent().attr("id");
	console.log("L'id è ---> "+id);
	pulisciErrore();
	
	var ajax = $.post("eliminaImpegno",{"id":id},function (ajaxObj, status) {
		console.log("status richiesta eliminazione impegno: " + status);
	}).fail(function (ajaxO, ajaxStatus, ajaxObj) {
		console.log("Errore richiesta eliminazione impegno");
	}).done(function (ajaxO, ajaxStatus, ajaxObj) {
	
		if(ajaxO["elimina"])
			rimuoviImpegno(id);
		else
			agganciaErroreImpegno();
	});	
}

function rimuoviImpegno(id){
	console.log(id);
	var ident=id.replace(" ","S");
	ident=id.replace("/","B");
	ident=id.replace(":","P");
	
	console.log("Rimuovo/"+ident+"/");
	console.log($("#"+ident));
	$("#"+ident).remove();
}

function getDateTime(dateTime){
	
	var anno=dateTime[0]+dateTime[1]+dateTime[2]+dateTime[3];
	console.log(anno);
	var mese=dateTime[5]+dateTime[6];
	console.log(mese);
	var giorno=dateTime[8]+dateTime[9];
	console.log(giorno);
	var ore=dateTime[11]+dateTime[12];
	console.log(ore);
	var minuti=dateTime[14]+dateTime[15];
	console.log(minuti);
	return anno+mese+giorno+ore+minuti;
	
}


function agganciaErroreImpegno(){
	$("#titolo").after("<h1 class='errore'>Errore eliminazione</h1>");
}


function erroreInserimento(){
	$("#inserimentoAgenda").after("<h1 class='errore'>Data già occupata</h1>");
}
function pulisciErrore(){
	$(".errore").remove();
}

function erroreCampi(id){
	$(id).after("<h1 class='erroreCampo'>Campo non valido</h1>");
}
function pulisciErroreCampi(){
	$(".erroreCampo").remove();
}