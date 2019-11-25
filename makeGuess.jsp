<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Guess</title>
</head>
<body>
<h1> Make my Guess: </h1>

<form action="addGuess" method="get">	
	
	 How many times can I guess? (Init method)	<!-- This value needs to get passed to servlet -->
	<select name="numOfGuesses">
    	<option value="8">8</option>
    	<option value="10">10</option>
    	<option value="12">12</option>
  	</select>
  	<br>
	<p> Number of guesses left:</p>
	<input type="text" name="numOfGuesses" value ="${numOfGuess.left}" readonly />
	<br><br>
	
		<table id="Guessboard" border="1" bgcolor="beige" >
			<tbody>
				<tr><th>Space A</th>
				<td><select name="elementA">
    			<option value="G">G</option>
    			<option value="P">P</option>
    			<option value="R">R</option>
    			<option value="Y">Y</option>
  				</select>	
				</td>
				
				<th>Space B</th>
				<td><select name="elementB">
    			<option value="G">G</option>
    			<option value="P">P</option>
    			<option value="R">R</option>
    			<option value="Y">Y</option>
  				</select>	
				</td>
				
				<th>Space C</th>
				<td><select name="elementC">
    			<option value="G">G</option>
    			<option value="P">P</option>
    			<option value="R">R</option>
    			<option value="Y">Y</option>
  				</select>	
				</td>
				
				<th>Space D</th>
				<td><select name="elementD">
    			<option value="G">G</option>
    			<option value="P">P</option>
    			<option value="R">R</option>
    			<option value="Y">Y</option>
  				</select>	
				</td>
				</tr>
				
					<tr>
					<td><input class="guessBtn" value="Make guess" type="submit"></td>
					</tr>
			</tbody>
		</table>
	</form>	
</body>
</html>