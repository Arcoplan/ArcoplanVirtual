<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href= "Assets/css/bootstrap.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastrar Produto</title>
</head>
<body>

<h1> Cadastrar produto </h1>
	<form name="formCadastro" method="post" action="RegisterProduct">
		<p>Nome: <input type="text" name="name" size="30" value="${produto}"></p>
		<p>Valor: R$ <input type="text" name="value" size="7" value="${produto}"></p>
		<p>Descrição <input type="text" name="description" size="100" value="${produto}"></p>
		<p>Data de fabricação <input type="text" name="manufacturingDate" size="15" value="${produto}"> (dd/mm/aaa)</p>
		<p><input type="submit" value="Cadastrar"/>
	</form>
</body>
</html>