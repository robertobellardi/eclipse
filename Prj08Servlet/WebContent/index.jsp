<!DOCTYPE html>
<%@page import="model.Figura"%>
<%@page import="java.util.ArrayList"%>
<%@page import="geometria.Punto"%>
<%@page import="geometria.*"%>
<html>
<head>
    <title>Primo sito</title>
    <meta charset="utf-8">
    <meta name="description" content="il mio sito">
    <meta name="keywords" content="HTML, CSS, JQUERY , BOOSTRAP , JavaScript">
    <meta name="author" content="Roberto Bellardi Gioli">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <link href='http://fonts.googleapis.com/css?family=Lato:900' rel='stylesheet' type='text/css'>
    
    <style> .form-group,.form-check,#invia{
            width: 500px!important;
            margin: 25px auto!important;
        }
    </style>
    
</head>
<body>

<% 
	if(request.getParameter("forma")!=null){		
		ArrayList<Figura> casa;
		
		if(session.getAttribute("casa") != null){
			casa=(ArrayList<Figura>)session.getAttribute("casa");
		}
		else{
			casa=new ArrayList<Figura>();
			session.setAttribute("casa",casa);
		}		
		
		String forma=request.getParameter("forma");		
		
		if(forma.equals("q")){
			Quadrato q=new Quadrato(
					new Punto(Integer.parseInt(request.getParameter("punto1a")),Integer.parseInt(request.getParameter("punto1b"))),
					new Punto(Integer.parseInt(request.getParameter("punto2a")),Integer.parseInt(request.getParameter("punto2b"))),
					new Punto(Integer.parseInt(request.getParameter("punto3a")),Integer.parseInt(request.getParameter("punto3b"))),
					new Punto(Integer.parseInt(request.getParameter("punto4a")),Integer.parseInt(request.getParameter("punto4b"))));
			q.setNomeCamera("quadrato");
			casa.add(q);
			//session.setAttribute("casa",casa);
		}else if(forma.equals("t")){
			Triangolo t=new Triangolo(
					new Punto(Integer.parseInt(request.getParameter("punto1a")),Integer.parseInt(request.getParameter("punto1b"))),
					new Punto(Integer.parseInt(request.getParameter("punto2a")),Integer.parseInt(request.getParameter("punto2b"))),
					new Punto(Integer.parseInt(request.getParameter("punto3a")),Integer.parseInt(request.getParameter("punto3b"))));
			t.setNomeCamera("triangolo");
			casa.add(t);
			//session.setAttribute("casa",casa);
		}else {
			Rettangolo r=new Rettangolo(
					new Punto(Integer.parseInt(request.getParameter("punto1a")),Integer.parseInt(request.getParameter("punto1b"))),
					new Punto(Integer.parseInt(request.getParameter("punto2a")),Integer.parseInt(request.getParameter("punto2b"))),
					new Punto(Integer.parseInt(request.getParameter("punto3a")),Integer.parseInt(request.getParameter("punto3b"))),
					new Punto(Integer.parseInt(request.getParameter("punto4a")),Integer.parseInt(request.getParameter("punto4b"))));
			r.setNomeCamera("rettangolo");
			casa.add(r);
			//session.setAttribute("casa",casa);
		}
		
		double metratura=0;
		
		for(int i=0;i<casa.size();i++){
			metratura+=casa.get(i).getArea();
%>
			<h1><%=casa.get(i)%></h1>
			<h1><%=casa.get(i).getArea()%></h1>
			<h1><%=casa.get(i).getPerimetro()%></h1>
<%
		}
%>
		<h1>L'area totale è ---> <%=metratura%></h1>
	
<%	
	}
%>

	<form method="post" action="">        
        <div class="form-check">
          <input class="form-check-input" type="radio" name="forma" id="triangolo" value="t" checked>
          <label class="form-check-label" for="triangolo">
            Triangolo
          </label>
        </div>
        <div class="form-check">
          <input class="form-check-input" type="radio" name="forma" id="rettangolo" value="r">
          <label class="form-check-label" for="rettangolo">
            Rettangolo
          </label>
        </div>
        <div class="form-check disabled">
          <input class="form-check-input" type="radio" name="forma" id="quadrato" value="q">
          <label class="form-check-label" for="quadrato">
            Quadrato
          </label>
        </div>        
        
        <div class="form-group">
            <label for="punto1">Primo punto</label>
            <input type="text" class="form-control" name="punto1a" placeholder="inserisci a">
            <input type="text" class="form-control" name="punto1b" placeholder="inserisci b">
        </div>

        <div class="form-group">
            <label for="punto2">Secondo punto</label>
            <input type="text" class="form-control" name="punto2a" placeholder="inserisci a">
            <input type="text" class="form-control" name="punto2b" placeholder="inserisci b">
        </div>

        <div class="form-group">
            <label for="punto3">Terzo punto</label>
            <input type="text" class="form-control" name="punto3a" placeholder="inserisci a">
            <input type="text" class="form-control" name="punto3b" placeholder="inserisci b">
        </div>
        
        <div class="form-group">
            <label for="punto4">Quarto punto</label>
            <input type="text" class="form-control" name="punto4a" placeholder="inserisci a">
            <input type="text" class="form-control" name="punto4b" placeholder="inserisci b">
      </div>
      <button id="invia" type="submit" class="btn btn-primary">Submit</button>
    </form> 
</body>
</html>