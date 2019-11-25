<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mastermind</title>
</head>
<body>

<h1> Mastermind Display</h1>

	<form action="makeGuess.jsp" >	
		<table id="Gameboard" border="1" bgcolor="beige" >
					<!--<p><c:out value="${errMsg}"/></p> -->
					<c:forEach
					items="${errors}" var="error">
					${error}<br>
					</c:forEach>
			<tbody>
				<tr>
					<th>Space A</th>
					<th>Space B</th>
					<th>Space C</th>
					<th>Space D</th>

					<th colspan="1">Pegs</th>
				</tr>
					<c:forEach items = "${gameBoardList}" var = "gameBoardList"> 
						<tr>
							<td>${gameBoardList.elementA}</td> 
							<td>${gameBoardList.elementB}</td>
							<td>${gameBoardList.elementC}</td>
							<td>${gameBoardList.elementD}</td>
							<td>${placeholder.peg}</td>
							<td>${placeholder.peg}</td>
							<td>${placeholder.peg}</td>
							<td>${placeholder.peg}</td>
	
						</tr>																		
					</c:forEach>
					<tr>
					<td><input class="guessBtn" value="Make new guess" type="submit"></td>
					</tr>
			</tbody>
		</table>
	</form>	
</body>
</html>