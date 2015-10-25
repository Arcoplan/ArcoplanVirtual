<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Produtos</title>
</head>
<body>
	<table>
		<tr>
			<th>Nome</th>
			<th>Valor</th>
			<th>Descrição</th>
			<th>Data de Fabricação</th>
			<th></th>
		</tr>
		<c:forEach var="produto" items="${produtos}">
			<tr>
				<td><c:out value="${produto.name}"  /></td>
				<td>${produto.value}</td>
				<td>${produto.description}</td>
				<td>${produto.manufacturingDate}</td>
				<td><a href="DeleteProduct?ID=${produto.ID}">Deletar</a></td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>