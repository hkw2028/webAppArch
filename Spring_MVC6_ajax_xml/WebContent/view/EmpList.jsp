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
	 $.get("empList2.do", function(xmlData){
		 //alert(xmlData);
	 });
	 $(".pic").mouseover(function(){
		 var snum=$(this).attr("id");
		 $.ajax({
			 url : "empSearch.do",
			 type : "get",
			 data :{ snum: snum},
			 dataType : "xml",
			 error  : function(xhr, status,message){
				 alert("error:"+message);
			 },
			 success : function(xmlData){
				 var name=$("img", xmlData).text();
				 $("#result").html(
				  "<img src='img/"+name+"' />");
			 }
		 });
	 });
});

</script>
</head>
<body>
<header>
	<h1> 직원 목록 </h1>
</header>
<section>
	<table>
	<tr><th> 직원 이름 </th><th> 급여 </th></tr>
	<c:forEach items="${list}" var="emp">
		<tr>
			<td><span id="${emp.snum}" class="pic"> ${emp.sname}</span></td>
			<td> ${emp.salary}</td>
		</tr>
	</c:forEach>
	</table>

</section>
<div id="result"></div>
<a href="index.html"> 메인 페이지</a>
</body>
</html>