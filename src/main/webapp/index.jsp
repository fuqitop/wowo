<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${stus}" var="stu">
	姓名${stu.name}年龄${stu.age}生日${stu.bri}体重${stu.weight} <br/>
</c:forEach>
<hr/>
<form method="post" action="c">
	年龄:<input type="text" name="age"/><br/>
	姓名：<input type="text" name="name"/><br/>
	生日:<input type="text" name="bri"/><br/>
	<input type="submit" value="提交"/>
</form>
</body>
</html>