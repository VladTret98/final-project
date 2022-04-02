<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
<style>
    <%@include file="css/mainpage/all.min.css"%>
    <%@include file="css/mainpage/sb-admin-2.min.css"%>
    <%@include file="css/mainpage/modal.css"%>
</style>
<title>Привет, ${daysInfo.getUser().getName()}</title>
</head>
<body id="page-top">
<c:set var="calories" value ="${daysInfo.getDayResult().getCalories() / daysInfo.getUser().getGoal().getCalories()}"></c:set>
<c:set var="proteins" value ="${daysInfo.getDayResult().getProteins() / daysInfo.getUser().getGoal().getProteins()}"></c:set>
<c:set var="fat" value ="${daysInfo.getDayResult().getFat() / daysInfo.getUser().getGoal().getFat()}"></c:set>
<c:set var="carbohydrates" value ="${daysInfo.getDayResult().getCarbohydrates() / daysInfo.getUser().getGoal().getCarbohydrates()}"></c:set>

<c:if test="${dayException != null}">
	<script type="text/javascript">
		alert("${dayException.message}");
	</script>
</c:if>
<!-- Page Wrapper -->
<div id="wrapper">
	<!-- Content Wrapper -->
	<div id="content-wrapper" class="d-flex flex-column">

		<!-- Main Content -->
		<div id="content">

			<!-- Topbar -->
			<nav
				class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

				<!-- Sidebar Toggle (Topbar) -->
				
					<form action="/adddish" method="get">
					<input type="submit" value="Добавить блюдо"/>
					</form>
				<!-- Topbar Navbar -->
				<ul class="navbar-nav ml-auto">
					<!-- Nav Item - Search Dropdown (Visible Only XS) -->
					<li class="nav-item dropdown no-arrow d-sm-none"></li>
					<div class="topbar-divider d-none d-sm-block"></div>
					<!-- Nav Item - User Information -->
					<li class="nav-item dropdown no-arrow"><a
						class="nav-link dropdown-toggle" href="#" id="userDropdown"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false"> <span
							class="mr-2 d-none d-lg-inline text-gray-600 small">${daysInfo.getUser().getName()}</span>
					</a> <!-- Dropdown - User Information -->
						<div
							class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
							aria-labelledby="userDropdown">
							<div class="dropdown-divider"></div>
							<form action="/logout" method="get" class="dropdown-item" data-toggle="modal"
								data-target="#logoutModal"> <i
								class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
								<input type="submit" value="Выйти"/>
							</form>
						</div></li>
				</ul>
			</nav>
			<!-- End of Topbar -->

			<!-- Begin Page Content -->
			<div class="container-fluid">
			<div>
				
				<nav aria-label="Статьи по Bootstrap 4">
  <ul class="pagination">
    <li class="page-item">
      <a class="page-link" href="/previous" aria-label="Предыдущая" action="/previous">
        <span aria-hidden="true">«</span>
      </a>
    </li>
    <li class="page-item disabled">
      <a class="page-link" href="#">
        <c:out value="${daysInfo.getDay().getFormattedDate()}"></c:out>
      </a>
    </li>
    <li class="page-item">
      <a class="page-link" href="/next" aria-label="Следующая" action="/next">
        <span aria-hidden="true">»</span>
      </a>
    </li>
  </ul>
</nav>


			</div>
			</div>
				<!-- Content Row -->
				<div class="row">

					<!-- Earnings (Monthly) Card Example -->
					<div class="col-xl-3 col-md-6 mb-4">
						<div class="card border-left-info shadow h-100 py-2">
							<div class="card-body">
								<div class="row no-gutters align-items-center">
									<div class="col mr-2">
										<div
											class="text-xs font-weight-bold text-info text-uppercase mb-1">Калории
										</div>
										<div class="row no-gutters align-items-center">
											<div class="col-auto">
												<div class="h5 mb-0 mr-3 font-weight-bold text-gray-800">
													<fmt:formatNumber value="${calories}" maxFractionDigits="1" />
												</div>
											</div>
											<div class="col">
												<div class="progress progress-sm mr-2">
													<div class="progress-bar bg-info" role="progressbar"
														style="width: ${calories}" aria-valuenow="50"
														aria-valuemin="0" aria-valuemax="100"></div>
												</div>
											</div>
										</div>
									</div>
									<div class="col-auto">
										<i class="fas fa-clipboard-list fa-2x text-gray-300"></i>
									</div>
								</div>
							</div>
						</div>
					</div>

					<!-- Earnings (Monthly) Card Example -->
					<div class="col-xl-3 col-md-6 mb-4">
						<div class="card border-left-info shadow h-100 py-2">
							<div class="card-body">
								<div class="row no-gutters align-items-center">
									<div class="col mr-2">
										<div
											class="text-xs font-weight-bold text-info text-uppercase mb-1">Белки
										</div>
										<div class="row no-gutters align-items-center">
											<div class="col-auto">
												<div class="h5 mb-0 mr-3 font-weight-bold text-gray-800">
													<fmt:formatNumber value="${proteins}" maxFractionDigits="1" />
												</div>
											</div>
											<div class="col">
												<div class="progress progress-sm mr-2">
													<div class="progress-bar bg-info" role="progressbar"
														style="width: ${proteins}" aria-valuenow="50"
														aria-valuemin="0" aria-valuemax="100"></div>
												</div>
											</div>
										</div>
									</div>
									<div class="col-auto">
										<i class="fas fa-clipboard-list fa-2x text-gray-300"></i>
									</div>
								</div>
							</div>
						</div>
					</div>

					<!-- Earnings (Monthly) Card Example -->
					<div class="col-xl-3 col-md-6 mb-4">
						<div class="card border-left-info shadow h-100 py-2">
							<div class="card-body">
								<div class="row no-gutters align-items-center">
									<div class="col mr-2">
										<div
											class="text-xs font-weight-bold text-info text-uppercase mb-1">Жиры
										</div>
										<div class="row no-gutters align-items-center">
											<div class="col-auto">
												<div class="h5 mb-0 mr-3 font-weight-bold text-gray-800">
													<fmt:formatNumber value="${fat}" maxFractionDigits="1" />
												</div>
											</div>
											<div class="col">
												<div class="progress progress-sm mr-2">
													<div class="progress-bar bg-info" role="progressbar"
														style="width: ${fat}" aria-valuenow="50" aria-valuemin="0"
														aria-valuemax="100"></div>
												</div>
											</div>
										</div>
									</div>
									<div class="col-auto">
										<i class="fas fa-clipboard-list fa-2x text-gray-300"></i>
									</div>
								</div>
							</div>
						</div>
					</div>

					<!-- Pending Requests Card Example -->
					<div class="col-xl-3 col-md-6 mb-4">
						<div class="card border-left-info shadow h-100 py-2">
							<div class="card-body">
								<div class="row no-gutters align-items-center">
									<div class="col mr-2">
										<div
											class="text-xs font-weight-bold text-info text-uppercase mb-1">Углеводы
										</div>
										<div class="row no-gutters align-items-center">
											<div class="col-auto">
												<div class="h5 mb-0 mr-3 font-weight-bold text-gray-800">
													<fmt:formatNumber value="${carbohydrates}"
														maxFractionDigits="1" />
												</div>
											</div>
											<div class="col">
												<div class="progress progress-sm mr-2">
													<div class="progress-bar bg-info" role="progressbar"
														style="width: ${carbohydrates}" aria-valuenow="50"
														aria-valuemin="0" aria-valuemax="100"></div>
												</div>
											</div>
										</div>
									</div>
									<div class="col-auto">
										<i class="fas fa-clipboard-list fa-2x text-gray-300"></i>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>

				<!-- Content Row -->


				<div class="card shadow mb-4">
					<div class="card-header py-3">
						<h6 class="m-0 font-weight-bold text-primary">Отчет за
							сегодня</h6>
					</div>
					<div class="card-body">
						<div class="table-responsive">
							<table class="table table-bordered" id="dataTable" width="100%"
								cellspacing="0">
								<thead>
									<tr>
										<th>Блюдо</th>
										<th>Калории</th>
										<th>Белки</th>
										<th>Жиры</th>
										<th>Углеводы</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${daysInfo.getDay().getDishes()}" var="dish">
										<tr>
											<td><c:out value="${dish.getName()}"></c:out></td>
											<td><c:out value="${dish.calculateFeatures().getCalories()}"></c:out></td>
											<td><c:out value="${dish.calculateFeatures().getProteins()}"></c:out></td>
											<td><c:out value="${dish.calculateFeatures().getFat()}"></c:out></td>
											<td><c:out value="${dish.calculateFeatures().getCarbohydrates()}"></c:out></td>
										</tr>
										<tr>
											<td colspan="5">
												<div class="card shadow mb-4">
													<!-- Card Header - Accordion -->
													<a href="#collapseCardExample"
														class="d-block card-header py-3" data-toggle="collapse"
														role="button" aria-expanded="true"
														aria-controls="collapseCardExample">
														<h6 class="m-0 font-weight-bold text-primary">Подробнее</h6>
													</a>
													<!-- Card Content - Collapse -->
													<div class="collapse show" id="collapseCardExample">
														<div class="card-body">
															<table class="table table-bordered" id="dataTable"
																width="100%" cellspacing="0">
																<thead>
																	<tr>
																		<th>Название</th>
																		<th>Масса</th>
																		<th>Калории</th>
																		<th>Белки</th>
																		<th>Жиры</th>
																		<th>Углеводы</th>
																	</tr>
																</thead>
																<tbody>
																	<c:forEach items="${dish.getIngredients()}"
																		var="ingredient">
																		<c:set var="caloriesI"
																			value="${ingredient.getWeight() * ingredient.getProduct().getCaloriesContent() / 100}"></c:set>
																		<c:set var="proteinsI"
																			value="${ingredient.getWeight() * ingredient.getProduct().getProteinsContent() / 100}"></c:set>
																		<c:set var="fatI"
																			value="${ingredient.getWeight() * ingredient.getProduct().getFatContent() / 100}"></c:set>
																		<c:set var="carbohydratesI"
																			value="${ingredient.getWeight() * ingredient.getProduct().getCarbohydratesContent() / 100}"></c:set>
																		<tr>
																			<td><c:out
																					value="${ingredient.getProduct().getName()}"></c:out></td>
																			<td><c:out value="${ingredient.getWeight()}"></c:out></td>
																			<td><c:out value="${caloriesI}"></c:out></td>

																			<td><c:out value="${proteinsI}"></c:out></td>
																			<td><c:out value="${fatI}"></c:out></td>
																			<td><c:out value="${carbohydratesI}"></c:out></td>
																		<tr />
																	</c:forEach>
																</tbody>
															</table>
														</div>
													</div>
												</div>
											</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
				</div>
				</div>
				</div>

				<!-- Bootstrap core JavaScript-->
				<script type="text/javascript">
					
				<%@include file="js/mainpage/jquery.min.js"%>
					
				<%@include file="js/mainpage/bootstrap.bundle.min.js"%>
					
				<%@include file="js/mainpage/jquery.easing.min.js"%>
					
				<%@include file="js/mainpage/sb-admin-2.min.js"%>
					
				<%@include file="js/mainpage/Chart.min.js"%>
					
				<%@include file="js/mainpage/chart-area-demo.js"%>
					
				<%@include file="js/mainpage/chart-pie-demo.js"%>
					
				<%@include file="js/mainpage/modal.js"%>
					
				</script>
				</body>
				</html>