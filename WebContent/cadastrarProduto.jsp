<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">




<html>
<title>Cadastrar Produto</title>
<link href= "Assets/css/bootstrap.css" rel="stylesheet">
<script type="text/javascript" src="Assets/js/bootstrap.js" ></script>
<style type="text/css">
      .navbar-brand-centered {
        position: absolute;
        left: 50%;
        display: block;
        width: 259px;
        height: 100px;
        text-align: center;
        background-color: #eee;
    }
    .navbar-default {
      height:100px
    }
    .navbar>.container .navbar-brand-centered,
    .navbar>.container-fluid .navbar-brand-centered {
        margin-left: -100px;
    }
    .col-sm-2 {
      border: 1px solid;
      height: 300px;
      width: 170px;
      color: gray;
      background-color: black;
      margin: 0 10px 0 10px;
    }
</style>

<!-- BARRA DE MENUS - INICIO -->
<nav class="navbar navbar-default" role="navigation">
  <div class="container">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-brand-centered">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand-centered" href="/"><span style="font-size: 2em"><img src="Assets/images/logo_site.png"></span></a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="navbar-brand-centered">
      <ul class="nav navbar-nav">
        <li><a href="cadastrarProduto.jsp">Cadastrar Produto</a></li>
        <li><a href="ListProduct">Listar produtos</a></li>
        <li class="dropdown">
          <a id="dLabel" data-target="#" href="http://example.com" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
            Ambientes
            <span class="caret"></span>
          </a>
          <ul class="dropdown-menu" aria-labelledby="dLabel">
            <p><a href="index.html">Banheiro</a></p>
            <p><a href="index.html">Cozinha</a></p>
            <p><a href="index.html">Escritório</a></p>
            <p><a href="index.html">Quarto</a></p>
            <p><a href="index.html">Sala</a></p>
            <p><a href="index.html">Cozinha</a></p>
          </ul>
        </li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#">Link</a></li>
        <li><a href="#">Link</a></li>
        <li><a href="#">Link</a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
<!-- BARRA DE MENUS - FIM -->

<div class="container">
  <h1>
    <center>Cadastrar produto</center>
  </h1>
  <br>
  <center><form name="formCadastro" method="post" action="RegisterProduct" style="width: 500px">
    <div class="form-group">
      <select class="form-control" name="size">
        <option value="">Escolha um tipo de produto</option>
        <option value="appliance">Eletrodoméstico</option>
        <option value="furniture">Móvel</option>
      </select>
    </div>
    <div class="input-group">
      <span class="input-group-addon" id="basic-addon1">Nome</span>
      <input type="text" class="form-control" placeholder="Digite o nome do produto a ser cadastrado" aria-describedby="basic-addon1" name="name" value="${produto}">
    </div>
    <br>
    <div class="input-group">
      <span class="input-group-addon">Valor (R$)</span>
      <input type="text" class="form-control" placeholder="Digite o valor do produto a ser cadastrado" aria-label="Amount (to the nearest dollar)" name="value" value="${produto}">
      <span class="input-group-addon">ex: 250.50</span>
    </div>
    <br>
    <div class="input-group">
      <span class="input-group-addon" id="basic-addon1">Descrição</span>
      <input type="text" class="form-control" placeholder="Digite a descrição do produto a ser cadastrado" aria-describedby="basic-addon1" name="description" value="${produto}">
    </div>
    <br>
    <div class="input-group">
      <span class="input-group-addon">Data de fabricação</span>
      <input type="text" class="form-control" placeholder="Digite a data de fabricação do produto a ser cadastrado" aria-label="Amount (to the nearest dollar)" name="value" value="${produto}">
      <span class="input-group-addon">(dd/mm/aaa)</span>
    </div>
    <br>
    <div class="input-group">
      <span class="input-group-addon" id="basic-addon1">Cor</span>
      <input type="text" class="form-control" placeholder="Digite a cor do produto a ser cadastrado" aria-describedby="basic-addon1" name="color" value="${produto}">
    </div>
    <br>
    <div class="input-group">
      <span class="input-group-addon" id="basic-addon1">Marca</span>
      <input type="text" class="form-control" placeholder="Digite a marca do produto a ser cadastrado" aria-describedby="basic-addon1" name="brand" value="${produto}">
    </div>
    <br>
    <div class="input-group" style="width: 250px">
	    <div class="input-group">
	    <span class="input-group-addon" id="basic-addon1">Altura</span>
	    <input type="text" class="form-control" placeholder="Ex: 1.20" aria-describedby="basic-addon1" name="height" value="${produto}">
	    <span class="input-group-addon">m</span>
	    </div>
	    <br>
	    <div class="input-group">
	      <span class="input-group-addon" id="basic-addon1">Largura</span>
	      <input type="text" class="form-control" placeholder="Ex: 2.20" aria-describedby="basic-addon1" name="width" value="${produto}">
	      <span class="input-group-addon">m</span>
	    </div>
	    <br>
	    <div class="input-group">
	      <span class="input-group-addon" id="basic-addon1">Profundidade</span>
	      <input type="text" class="form-control" placeholder="Ex: 1.00" aria-describedby="basic-addon1" name="depth" value="${produto}">
	      <span class="input-group-addon">m</span>
	    </div>
    </div>
    <br>
    <center>
      <input type="submit" class="btn btn-primary" value="Cadastrar"/>
      <!-- Button trigger modal -->
      <button type="button" class="btn btn-default" data-toggle="modal" data-target="#myModal">
        Cancelar
      </button>
    </center>
    <!-- Modal -->
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <h4 class="modal-title" id="myModalLabel">Modal title</h4>
          </div>
          <div class="modal-body">
            Deseja realmente cancelar? Todas as alterações serão perdidas.
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default">Sim</button>
            <button type="button" class="btn btn-primary" data-dismiss="modal">Não</button>
          </div>
        </div>
      </div>
    </div>
  </form></center>
</div>
<br>
<div class="panel-footer footer" id="footer">
  <span>
    <center>Todos os direitos Reservados</center>
  </span>
</div>
<script src="Assets/js/jquery.min.js"></script>
<script src="Assets/js/bootstrap.min.js"></script>
</p>
</html>
