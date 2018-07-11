<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<header>
		<h1>직원 등록 화면</h1>
	</header>
	<section>
		<form action="empSave.do" method="post">
			<table>
				<tr>
					<th>직원번호</th>
					<td><input type="number" name="snum" /></td>
				</tr>
				<tr>
					<th>직원이름</th>
					<td><input type="text" name="sname" /></td>
				</tr>
				<tr>
					<th>직원급여</th>
					<td><input type="number" name="salary" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="등록" />
					<input type="reset" value="취소" /></td>
				</tr>
			</table>
		</form>
	</section>
</body>
</html>