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
		<h1>�� ��� ȭ��</h1>
	</header>
	<section>
		<form action="custSave.do" method="post" enctype="multipart/form-data">
			<table>
				<tr>
					<th>����ȣ</th>
					<td><input type="number" name="num" /></td>
				</tr>
				<tr>
					<th>���̸�</th>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<th>���ּ�</th>
					<td><input type="text" name="address" /></td>
				</tr>
				<tr>
					<th>����</th>
					<td><input type="file" class="file" name="imgFileName" /></td>
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