<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<title>Добро пожаловать</title>
<meta charset="utf-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<style type="text/css">
body {
	background-image:
		url(http://www.joburgchiropractor.co.za/images/background.jpg);
}
</style>
</head>
<body>
	<div class="container" style="margin-top: 5%;">
		<div class="row">
			<div class="col-sm-4"></div>
			<div class="col-md-4">

				<h1 class="text-center text-success">Добро пожаловать</h1>
				<br />

				<div class="col-sm-12">

					<ul class="nav nav-pills">

						<li class="" style="width: 50%"><a
							class="btn btn-lg btn-default" data-toggle="tab" href="#home">Вход</a></li>

						<li class=" " style="width: 48%"><a
							class=" btn btn-lg btn-default" data-toggle="tab" href="#menu1">Регистрация</a></li>

					</ul>

					<br />
					<div class="tab-content">
						<div id="home" class="tab-pane fade in active">

							<form action="/login" method="post">
								<div class="form-group">
									<label for="userLogin">Логин</label> <input type="text"
										class="form-control" id="email" name="userLogin">
								</div>

								<div class="form-group">
									<label for="password">Пароль</label> <input type="password"
										class="form-control" id="email" name="password">
								</div>

								<button type="submit" class="btn btn-default btn-lg">Войти</button>
								<button type="submit" class=" pull-right btn-link">
									<a href="www.google.com">Забыли пароль?</a>
								</button>

							</form>
							<br /> <a href="#" class="pull-right btn btn-block btn-danger">
								Уже зарегистрированы ?</a>



				<!-- 		</div>

						<div id="menu1" class="tab-pane fade">

							<form action="/registration" method="post">

								<div class="form-group">
									<label for="UserLogin">Придумайте логин:</label> <input
										type="text" class="form-control" id="email" name="userLogin">
								</div>

								<div class="form-group">
									<label for="weight">Ваш нынешний вес, кг:</label> <input
										type="text" class="form-control" id="weight" name="weight">
								</div>

								<div class="form-group">
									<label for="pwd">Пароль</label> <input type="password"
										class="form-control" id="pwd">
								</div>

								<div class="form-group">
									<label for="goal" style="font-size: 18">Ваша цель:</label>
									<div>
										<label for="1">Хочу похудеть</label> <input type="radio"
											class="form-control" id="1" name="goal" value="1"
											style="width: 1em; height: 1em;"> <label for="2">Хочу
											поддерживать форму</label> <input type="radio" class="form-control"
											id="2" name="goal" value="2" style="width: 1em; height: 1em;">
										<label for="3">Хочу набрать вес</label> <input type="radio"
											class="form-control" id="3" name="goal" value="3"
											style="width: 1em; height: 1em;">

									</div>
								</div>

								<div class="form-group">
									<label for="activity" style="font-size: 18">Какой у вас
										образ жизни:</label>
									<div>
										<label for="1">Малоподвижный</label> <input type="radio"
											class="form-control" id="1" name="activity" value="1"
											style="width: 1em; height: 1em;"> <label for="2">Активный</label>
										<input type="radio" class="form-control" id="2"
											name="activity" value="2" style="width: 1em; height: 1em;">
										<label for="3">Сильно активный</label> <input type="radio"
											class="form-control" id="3" name="activity" value="3"
											style="width: 1em; height: 1em;">
									</div>

								</div>

								<button type="submit" class="btn btn-default">Войти</button>

								<button type="submit" class=" pull-right btn-link">
									<a href="www.google.com">Forget password</a>
								</button>

							</form>
							
							
							 -->
							
							
							
							 
							
							
							
							<div id="menu1" class="tab-pane fade">

							<form action="/registration" method="post">

								<div class="form-group">
									<label for="userLogin">Придумайте логин:</label> <input
										type="text" class="form-control" id="userLogin" name="login">
								</div>

								<div class="form-group">
									<label for="weight">Ваш нынешний вес, кг:</label> <input
										type="text" class="form-control" id="weight" name="weight">
								</div>

								<div class="form-group">
									<label for="password">Пароль</label> <input type="password"
										class="form-control" id="password" name="password">
								</div>

					<!-- 			<div class="form-group">
									<label for="goal" style="font-size: 18">Ваша цель:</label>
									<div>
										<label for="1">Хочу похудеть</label> <input type="radio"
											class="form-control" id="1" name="goal" value="1"
											style="width: 1em; height: 1em;"> <label for="2">Хочу
											поддерживать форму</label> <input type="radio" class="form-control"
											id="2" name="goal" value="2" style="width: 1em; height: 1em;">
										<label for="3">Хочу набрать вес</label> <input type="radio"
											class="form-control" id="3" name="goal" value="3"
											style="width: 1em; height: 1em;">

									</div>
								</div>

								<div class="form-group">
									<label for="activity" style="font-size: 18">Какой у вас
										образ жизни:</label>
									<div>
										<label for="1">Малоподвижный</label> <input type="radio"
											class="form-control" id="1" name="activity" value="1"
											style="width: 1em; height: 1em;"> <label for="2">Активный</label>
										<input type="radio" class="form-control" id="2"
											name="activity" value="2" style="width: 1em; height: 1em;">
										<label for="3">Сильно активный</label> <input type="radio"
											class="form-control" id="3" name="activity" value="3"
											style="width: 1em; height: 1em;">
									</div>    -->s

								</div>

								<button type="submit" class="btn btn-default">Войти</button>

								<button type="submit" class=" pull-right btn-link">
									<a href="www.google.com">Forget password</a>
								</button>

							</form>   
							
							
							
							
					
					
					
							
							
							<br /> <a href="#" class="pull-right btn btn-block btn-success">
								Already Register ? </a>






						</div>
					</div>
				</div>
			</div>
		</div>


		<%--	<form action="/login" method="post">
		<label for="login">Логин</label> <input type="text" id="login"
			name="userLogin"><br>
		<br> <label for="password">Пароль</label> <input type="password"
			id="password" name="password"><br>
		<br> <input type="submit" value="Войти">
	</form> --%>
</body>
</html>
