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
		<h1>고객 등록 화면</h1>
	</header>
	<section>
		<form action="custSave.do" method="post" enctype="multipart/form-data">
			<table>
				<tr>
					<th>고객번호</th>
					<td><input type="number" name="num" /></td>
				</tr>
				<tr>
					<th>고객이름</th>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<th>고객주소</th>
					<td><input type="text" name="address" /></td>
				</tr>
				<tr>
					<th>사진</th>
					<td><input type="file" class="file" name="imgFileName" /></td>
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