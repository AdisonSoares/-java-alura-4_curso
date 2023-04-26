<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<%@ page import = "java.util.List, br.com.alura.gerenciador.servlet.Empresa" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<ul>
			<c:foreach items="${empresas}" var="empresa">
				<li> ${empresa.nome} ${empresa.dataAbertura} - 
					<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
				</li>
			</c:foreach>
		</ul>
		
	</body>
</html>