<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!doctype html>

<html>
<head>

<title>测试页</title>

</head>

<body  lang="en">
${category.blogCategoryName}

<c:forEach items="${blogList}" var="blog">
		标题：${blog.blogTitle }
		发布时间:${blog.blogCreatetime }
		内容:${blog.blogContent }
	</c:forEach>
	
	
<c:forEach items="${contactList}" var="contact">
		联系类型：${contact.userContactTypeName }
		联系方式:${contact.userContact }
		
	</c:forEach>
</body>
</html>