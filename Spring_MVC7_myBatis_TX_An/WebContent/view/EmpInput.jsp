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
		<h1>���� ��� ȭ��</h1>
	</header>
	<section>
		<form action="empSave.do" method="post">
			<table>
				<tr>
					<th>������ȣ</th>
					<td><input type="number" name="snum" /></td>
				</tr>
				<tr>
					<th>�����̸�</th>
					<td><input type="text" name="sname" /></td>
				</tr>
				<tr>
					<th>�����޿�</th>
					<td><input type="number" name="salary" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="���" />
					<input type="reset" value="���" /></td>
				</tr>
			</table>
		</form>
	</section>
</body>
</html>