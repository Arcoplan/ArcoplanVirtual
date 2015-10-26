<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link href= "Assets/css/bootstrap.css" rel="stylesheet">
<script src="Assets/js/bootstrap.min.js" ></script>
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
        <li><a href="RegisterProduct">Cadastrar Produto</a></li>
        <li><a href="ListProduct">Listar produtos</a></li>
        <li><a href="#">Link</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#">Link</a></li>
        <li><a href="#">Link</a></li>
        <li><a href="#">Link</a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>

<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
    <li data-target="#myCarousel" data-slide-to="3"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div class="item active">
      <center><img src="Assets/images/quartos-e-suites_4_reg.png" alt="Chania"></center>
    </div>
    <div class="item">
      <img src="Assets/images/cozinhas-maravilhosas_2_reg.png" alt="Chania">
    </div>
    <div class="item">
      <img src="Assets/images/banheiro_2_reg.png" alt="Flower">
    </div>
    <div class="item">
      <img src="Assets/images/salas-e-home-theater_10_reg.png" alt="Flower">
    </div>
    <div class="item">
      <img src="Assets/images/salas-e-home-theater_20_reg.png" alt="Flower">
    </div>
    <div class="item">
      <img src="Assets/images/salas-e-home-theater_23_reg.png" alt="Flower">
    </div>
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
<p>
<center>
  <h1>///////////////////////////////////////////////// Ambientes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\</h1>
</center>

<center>
  <div class="row container">
    <div class="col-sm-2">
      <h2>Banheiro</h2>
      <h3></h3>
    </div>
    <div class="col-sm-2">
      <h2>Cozinha</h2>
      <h3></h3>
    </div>
    <div class="col-sm-2">
      <h2>Escritório</h2>
    </div>
    <div class="col-sm-2">
      <h2>Quarto</h2>
      <h3></h3>
    </div>
    <div class="col-sm-2">
      <h2>Sala</h2>
      <h3></h3>
    </div>
    <div class="col-sm-2">
      <h2>Cozinha</h2>
      <h3></h3>
    </div>
  </div>
</center>
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