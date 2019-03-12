<html>
	<body>
		<h2>Sebastian Silva :D</h2>
		<%@ page import="java.util.List" %> 
		<% 
			ArrayList<String> codigos = new ArrayList<>();
			ArrayList<String> datos = new ArrayList<>();
		   	String a,b,c,d,e,usu,f; %>
		<%  
			a=request.getParameter("2a");  
			b=request.getParameter("3a");
			c=request.getParameter("4a");
			d=request.getParameter("5a");
			e=request.getParameter("6a");
			f=request.getParameter("1a");

			if(f.equals("registro")){
				usu = " Nombre: "+b+" Semanas: "+c+" Presupuesto: "+d+" Plataforma: "+e;
				datos.add(usu);
				codigos.add(a);
			}else{
				for(int i=0;i<codigos.size();i++){
					if(a.equals(codigos.get(i))){
						out.println(datos.get(i));
					}
				}
			}
		 %> 
	</body>
</html>
