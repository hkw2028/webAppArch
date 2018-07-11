<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<header>
	<h1> 고객 목록 </h1>
</header>
<section>
	<table>
	<tr><th>고객이름 </th><th> 주소 </th></tr>
	<c:forEach items="${list}" var="vo">
		<tr>
			<td><a href="custView.do?num=${vo.num}"> ${vo.name}</a></td>
			<td> ${vo.address}</td>
		</tr>
	</c:forEach>
	</table>
</section>
<a href="index.html"> 메인 페이지</a>
</body>
</html>