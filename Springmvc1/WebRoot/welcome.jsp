<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	欢迎大家收看我的视频!提高班 李守宏
	<br/>
	<h>传递数据</h><!--
	${result }
	--><div>
		<c:forEach items="${map }" var="m">
		
		${m.key } -----> ${m.value }
		
		</c:forEach>
	</div>
	
</body>
</html>