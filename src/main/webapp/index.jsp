<html>
	<body>
		<h2>Sebastian Silva :D</h2>
		<form action="index.jsp" method="post">
			nombre:<input type="text" name="1a">
			apellido:<input type="text" name="2a">
			<input type="submit" name="3a" value="Unir">
		</form>
		<%! String a, b, c; %>
		<%  a=request.getParameter("1a");    
			b=request.getParameter("2a"); 
			c=a+" "+b;
			out.print(c);
		 %> 
	</body>
</html>
