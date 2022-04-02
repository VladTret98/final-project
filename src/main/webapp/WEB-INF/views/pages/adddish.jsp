<%@page import="by.tretiak.demo.model.food.Ingredient"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Добавление блюда</title>
</head>
<body>
	<div id="modal_open" class="my_modal">
		<div class="my_modal-dialog">
			<div class="my_modal-content">
				<div class="my_modal-header">
				</div>
				<div class="my_modal-body">
				<form action="/adddish" method="post">
				<label for="dishName" value="Введите название блюда"/>
				<input type="text" name="dishName">
					<table id='tabl' border='1' align='left'>
						<thead>
							<th>Название</th>
							<th>Масса</th>
							<th>Калорий/100г</th>
							<th>Белков/100г</th>
							<th>Жиров/100г</th>
							<th>Углеводов/100г</th>
						</thead>
						<tr>
							<td><input type='text' name='ingredientName'></td>
							<td><input type="number" name='weight'></td>
							<td><input type="number" name='caloriesContent'></td>
							<td><input type="number" name='proteinsContent'></td>
							<td><input type="number" name='fatContent'></td>
							<td><input type="number" name='carbohydratesContent'></td>
						</tr>
					</table>
					</form>
					<input type='button' value='Ещё' onClick='add();'>
					<input type="submit" value="Добавить" title="Добавить"/>
				</div>
			</div>
		</div>
	</div>
	
	<script type="text/javascript">
	function add() {
		var nodet = document.createElement('tr');
		var nameNode = document.createElement('td');
		var weightNode = document.createElement('td');
		var caloriesNode = document.createElement('td');
		var proteinsNode = document.createElement('td');
		var fatNode = document.createElement('td');
		var carbohydratesNode = document.createElement('td');
		nameNode.innerHTML = "<input type='text' name='ingredientName'>";
		weightNode.innerHTML = "<input type='number' name='weight'>";
		caloriesNode.innerHTML = "<input type='number' name='caloriesContent'>";
		proteinsNode.innerHTML = "<input type='number' name='proteinsContent'>";
		fatNode.innerHTML = "<input type='number' name='fatContent'>";
		carbohydratesNode.innerHTML = "<input type='number' name='carbohydratesContent'>";
		document.getElementById('tabl').appendChild(nodet);
		nodet.appendChild(nameNode);
		nodet.appendChild(weightNode);
		nodet.appendChild(caloriesNode);
		nodet.appendChild(proteinsNode);
		nodet.appendChild(fatNode);
		nodet.appendChild(carbohydratesNode);
		}
	</script>
	
</body>
</html>