<%
	String nomeEmpresa = (String)request.getAttribute("empresa");
%>


<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		Empresa <%= nomeEmpresa %> cadastrada!
	</body>
</html>