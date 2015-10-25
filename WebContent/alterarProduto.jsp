<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href= "Assets/css/bootstrap.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterar Produto</title>
</head>
<body>
	<h1> Alterar produto </h1>
	<form name="formAlteracao" method="post" action="UpdateProduct">
		<p>Nome: <input type="text" name="name" size="30" value="${produto.name}"></p>
		<p>Valor: R$ <input type="text" name="value" size="7" value="${produto.value}"></p>
		<p>Descrição <input type="text" name="description" size="100" value="${produto.description}"></p>
		<p>Data de fabricação <input type="text" name="manufacturingDate" size="15" value="${data}"> (dd/mm/aaa)</p> 
		<p><input type="submit" value="Alterar"/>
	</form>
</body>
</html>