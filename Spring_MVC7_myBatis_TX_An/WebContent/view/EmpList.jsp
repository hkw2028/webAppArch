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
	 $(".req").click(function(){
		 var snum=$(this).attr("id");
		 alert("snum:"+snum);
		 $.ajax({
			 url : "salarySearch.do",
			 type : "get",
			 data :{ "snum": snum},
			 dataType : "json",
			 error  : function(xhr, status,message){
				 alert("error:"+message);
			 },
			 success : function(jsonData){
				 $("#result").html("<b>"+jsonData.salary+"</b>");
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
	<tr><th> 직원 번호 </th><th> 직원 이름 </th></tr>
	<c:forEach items="${list}" var="emp">
		<tr>
			<td> <span class="req"  id="${emp.snum}">${emp.snum}</span></td>
			<td> ${emp.sname}</td>
		</tr>
	</c:forEach>
	</table>
	급여:<span id="result"></span>
	<p/>
</section>
<a href="index.html"> 메인 페이지</a>
</body>
</html>