<%@page import="controller.OrdinatorePrezzo"%>
<%@page import="java.util.Comparator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Collections"%>
<%@page import="model.Prodotto"%>
<%@page import="controller.Prodotti"%>

<% 
	String titolo = (request.getAttribute("pagina") != null)?
		(String)request.getAttribute("pagina"):
		"home"; 
		
	if(request.getAttribute("prodotti")!=null){
		List<Prodotto> prodotti = (ArrayList<Prodotto>)request.getAttribute("prodotti");
%>

<h1> <%=titolo%> </h1>
<table>

<%/*
	if(titolo.equals("salati")){
		
		Collections.sort(prodotti,new Comparator(){
			public int compare(Object a,Object b){
				Prodotto p1=(Prodotto)a;
				Prodotto p2=(Prodotto)b;
				double res=p1.getPrezzo()-p2.getPrezzo();
				if(res>0)
					return 1;
				else if(res<0)
					return -1;
				else
					return 0;
			}
		});	
		
		Collections.sort(prodotti,(a,b) -> {
			Prodotto p1=(Prodotto)a;
			Prodotto p2=(Prodotto)b;
			double res=p1.getPrezzo()-p2.getPrezzo();
			if(res>0)
				return 1;
			else if(res<0)
				return -1;
			else
				return 0;
		});
		
		Collections.sort(prodotti,new OrdinatorePrezzo());
		
	}
	else
		Collections.sort(prodotti);		*/
	//if(prodotti!=null){		
		for(Prodotto prodotto: prodotti){
%>
			<tr>
				<td><%=prodotto.toString() %></td>
			</tr>
<% 
		}
	//}

%>
</table>
<%} %>
	
