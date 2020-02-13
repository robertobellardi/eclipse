var id;

window.onload = function () {
    $("#buttonLogin").click(checkLogin);
    $("#buttonRegister").click(getRegister);
}


function checkLogin(){
	var mail=$("#mail").val();
	var password=$("#password").val();
	
	console.log(mail +" --- "+password);
	
	var ajax = $.post("richiestaLogin",{"mail":mail,"password":password},function (ajaxObj, status) {
		console.log("status richiesta login: " + status);
	}).fail(function (ajaxO, ajaxStatus, ajaxObj) {
		console.log("Errore richiesta login");
	}).done(function (ajaxO, ajaxStatus, ajaxObj) {
		if(ajaxO["login"]){
			id=ajaxO["id"];
			$("#areaLogin").remove();
			$("body").append(ajaxO["html"]);
			agganciaFunzioni();
		}
		else{
			agganciaErroreLogin("formLogin",ajaxO["errore"]);
		}
	});	
}

function getRegister(){
	
	var div=$("<div class='form-group'></div>");
	var label=$("<label for='re-password'>Reinserisci la password</label>");
	var input=$("<input type='text' class='form-control' id='re-password' placeholder='Re inserisci la password'></input>");
	
	div.append(label);
	div.append(input);
	
	$("#buttonLogin").before(div);

}

function agganciaFunzioni(){
	$("#inserisci").click(controllaInserimento);
    scaricaCalendario();
    
    $("#downImpegno").click(ordinaDownImpegno);
    $("#upImpegno").click(ordinaUpImpegno);
    
    $("#downLuogo").click(ordinaDownLuogo);
    $("#upLuogo").click(ordinaUpLuogo);
    
    $("#downPriorita").click(ordinaDownPriorita);
    $("#upPriorita").click(ordinaUpPriorita);
    
    $("#downOrario").click(ordinaDownOrario);
    $("#upOrario").click(ordinaUpOrario);
}

function controllaInserimento(){	
	pulisciErroreCampi();
	pulisciErrore();
	
	var impegno=$("#impegno").val();
	var luogo=$("#luogo").val();
	var priorita=$("#priorita").val();
	var orario=$("#orario").val();
		
	if(impegno == "")
		erroreCampi("#impegno");
	if(luogo == "")
		erroreCampi("#luogo");
	
	if(impegno != "" && luogo!= "" && checkDate(orario))
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
	var str="<tr id='"+risp["id"]+"'><th scope='row' class='impegno'>"+
	risp["impegno"]+"</th><td class='luogo'>"+
	risp["luogo"]+"</td><td class='priorita'>"+
	risp["priorita"]+"</td><td class='orario'>"+
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
				
		var str="";
		for(x in risp){
			str+="<tr id='"+risp[x]["id"]+"'><th scope='row' class='impegno'>"+
			risp[x]["impegno"]+"</th><td class='luogo'>"+
			risp[x]["luogo"]+"</td><td class='priorita'>"+
			risp[x]["priorita"]+"</td><td class='orario'>"+
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

function checkDate(dateTime){
	
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
	
	if (anno && mese && giorno && ore && minuti)
		return true
	else
		return false;
	
}

function ordinaTabella(index,crescente){
	var tabella=$("#tablebody tr");
	var n=tabella.length;

	for(var j=0; j<n;j++){
		for(var i=0; i<n-1;i++){
			var figlio=tabella.eq(i);
			
			if(crescente){		
				if(figlio.children().eq(index).text().localeCompare(tabella.eq(i+1).children().eq(index).text()) < 0 ){
					figlio.before(tabella.eq(i+1));
				}
			}
			else{
				if(figlio.children().eq(index).text().localeCompare(tabella.eq(i+1).children().eq(index).text()) > 0 ){
					figlio.before(tabella.eq(i+1));
				}
			}
		}
	}
}


function ordinaDownImpegno(){
	ordinaTabella(0,false);
}
		

function ordinaUpImpegno(){
	ordinaTabella(0,true);
}

function ordinaDownLuogo(){	
	ordinaTabella(1,false);
}

function ordinaUpLuogo(){
	ordinaTabella(1,true);
}

function ordinaDownPriorita(){
	ordinaTabella(2,false);
}

function ordinaUpPriorita(){
	ordinaTabella(2,true);
}

function ordinaDownOrario(){
	ordinaTabella(3,false);
}

function ordinaUpOrario(){
	ordinaTabella(3,true);
}

function agganciaErroreLogin(id,errore){
	$(".erroreLogin").remove();
	$("#"+id).append("<h1 class='erroreLogin'>"+errore+"</h1>");
}

function agganciaErroreImpegno(){
	$("#titolo").after("<h1 class='errore'>Errore eliminazione</h1>");
}

function erroreInserimento(){
	$("#inserimentoAgenda").after("<h1 class='errore'>Data non valida</h1>");
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