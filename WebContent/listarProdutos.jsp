<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
		<c:ForEach var="produto" items="produtos">
			<tr>
				<td>${prududuto.getName()}</td>
				<td>${prududuto.getValue()}</td>
				<td>${prududuto.getDescription}</td>
				<td>${prududuto.getManufacturingDate()}</td>
				<td></td>
			</tr>
		</c:ForEach>
	</table>
	
</body>
</html>