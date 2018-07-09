<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>응답 페이지</h1>
<% for(int i = 0 ; i < 10; i++){ %>
	<%=request.getAttribute("msg")%>
<%} %>
<br>
${msg}
<a href="index.html">메인 페이지</a>
</body>
</html>