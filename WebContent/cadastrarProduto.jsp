<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastrar Produto</title>
</head>
<body>

<h1> Cadastrar produto </h1>
	<form name="formCadastro" method="post" action="RegisterProduct">
		<p>Nome: <input type="text" name="name" size="30"></p>
		<p>Valor: R$ <input type="text" name="value" size="7"></p>
		<p>Descrição <input type="text" name="description" size="100"></p>
		<p>Data de fabricação <input type="text" name="manufacturingDate" size="15"> (dd/mm/aaa)</p> 
		<p><input type="submit" value="Cadastrar"/>
	</form>
</body>
</html>