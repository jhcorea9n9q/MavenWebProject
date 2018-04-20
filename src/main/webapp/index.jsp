<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
		<meta charset="UTF-8">
		<title>Servlet</title>
</head>
		
<body>

		<h2 style="test-align: center;"> World에 Hello 하십시오. </h2>
		<a href="Calc"> [Calculator로 이동] </a>
		
		<form action="Calc">
		
				<select name="key">
						<option value="add">덧셈</option>
						<option value="subtract">뺄셈</option>
						<option value="multiply">곱셈</option>
						<option value="divide">나눗셈</option>
				</select>
				
				<input type="number" name="a" placeholder="첫 번째 숫자를 입력해라">
				<input type="number" name="b" placeholder="두 번째 숫자를 입력해라">
				<input type="submit" value="계 산">
				
		</form>
		
</body>

</html>