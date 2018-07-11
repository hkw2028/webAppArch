<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<header>
	<h1> 직원 목록 </h1>
</header>
<section>
	<table>
	<tr><th>직원이름 </th><th> 급여 </th></tr>
	<c:forEach items="${list}" var="emp">
		<tr>
			<td><a href="view.do?snum=${emp.snum}"> ${emp.sname}</a></td>
			<td> ${emp.salary}</td>
		</tr>
	</c:forEach>
	</table>
</section>
<a href="index.html"> 메인 페이지</a>
</body>
</html>