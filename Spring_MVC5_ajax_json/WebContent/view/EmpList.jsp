<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
<script type="text/javascript">
$(function(){
	 $(".pic").mouseover(function(){
		 var snum=$(this).attr("id");
		 $.ajax({
			 url : "empSearch.do",
			 type : "get",
			 data :{ snum: snum},
			 dataType : "json",
			 error  : function(xhr, status,message){
				 alert("error:"+message);
			 },
			 success : function(jsonData){
				 $("#result").html(
				  "<img src='img/"+jsonData.img+"' />");
			 }
		 });
	 });
});

</script>
</head>
<body>
<header>
	<h1> ���� ��� </h1>
</header>
<section>
	<table>
	<tr><th> ���� �̸� </th><th> �޿� </th></tr>
	<c:forEach items="${list}" var="emp">
		<tr>
			<td><span id="${emp.snum}" class="pic"> ${emp.sname}</span></td>
			<td> ${emp.salary}</td>
		</tr>
	</c:forEach>
	</table>

</section>
<div id="result"></div>
<a href="index.html"> ���� ������</a>
</body>
</html>