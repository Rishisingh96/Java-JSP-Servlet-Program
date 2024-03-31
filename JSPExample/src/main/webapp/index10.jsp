<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>First JSP</h1>

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
	<%!
		int a = 10;
		String name = "Rishi";
		
		/* int square()
		{
			return a*a;
		} */
		
	%>
	<%
	out.println("a : "+a);
	out.println("Name :"+name);
//	out.println(square());

	int b = 20;
	
	if(b<100){
		out.println("\nb is smaller than 100");
	}
	else
	{
		out.println("b is greater than 100");
		
	}
	
	for(int  i = 1; i<=5; i++){
		out.println(i);
	}
	%>
	
	<%=a %>
	<%= name %>
	
	
	<%!
		int x = 50;
		int y = 10;
		String nam = "techsoft india";
		
		public int doSum(){
			return x+y;
		}
		public String reverse(){
			StringBuffer br = new StringBuffer(name);
			return br.reverse().toString();
		}
	%>
	<%
		out.println(x);
		out.println("<br>");
		out.println(y);
		out.println("<br>");
		out.println("Sum is "+ doSum());
		out.println("<br>");
		out.println(reverse());
	%>
	
</body>
</html>