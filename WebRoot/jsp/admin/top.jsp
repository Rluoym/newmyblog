<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
    <meta charset="utf-8">
    <title>top</title>
    <link rel="shortcut icon" href="favicon.ico">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">



<!-- Bootstrap css -->
<link type="text/css" rel='stylesheet' href="${pageContext.request.contextPath }/resources/main_resources/css/bootstrap.min.css">

<!-- End Bootstrap css -->


<!-- Fancybox -->
<link type="text/css" rel='stylesheet' href="${pageContext.request.contextPath }/resources/main_resources/js/fancybox/jquery.fancybox.css">
<!-- End Fancybox -->

<link type="text/css" rel='stylesheet' href="fonts/fonts.css">
<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&amp;subset=latin,cyrillic-ext' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>

<link type="text/css" data-themecolor="default" rel='stylesheet' href="${pageContext.request.contextPath }/resources/main_resources/css/main-default.css">


<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
</head>
  
  <body>

<div style="font-size: 10pt; line-height: 10px;">

<%-- 根据用户是否登录，显示不同的链接 --%>
<c:choose>
	<c:when test="${empty sessionScope.userInfo }">
		  <a href="${pageContext.request.contextPath }/adminUI/admin" target="_parent">登录</a> |&nbsp; 
	</c:when>
	 
	<c:otherwise>
		
		<nav class="b-top-nav f-top-nav b-right j-top-nav">
			   <ul class="b-top-nav__1level_wrap">  
			    
			     <li class="b-top-nav__1level f-top-nav__1level f-primary-b">
			        <a href="#"><i class=""></i>   
			        	当前用户：${userInfo.userNickname }
					<span class="b-ico-dropdown"><i class="fa fa-arrow-circle-down"></i></span></a>
					</li>
			    <li class="b-top-nav__1level f-top-nav__1level ${isActivePersonalInfo} f-primary-b">
			        <a href="${pageContext.request.contextPath }/adminUI/updateUserInfo" target="body"><i class=""></i>修改个人资料 <span class="b-ico-dropdown"><i class="fa fa-arrow-circle-down"></i></span></a>
			        
			    </li>
			    <li class="b-top-nav__1level f-top-nav__1level ${isActivePersonalInfo} f-primary-b">
			        <a href="${pageContext.request.contextPath }/adminUI/updateUserContact" target="body"><i class=""></i>修改联系方式 <span class="b-ico-dropdown"><i class="fa fa-arrow-circle-down"></i></span></a>
			        
			    </li>
					<li class="b-top-nav__1level f-top-nav__1level f-primary-b">
			        
			        	<a class="logoutA" href="${pageContext.request.contextPath }/adminUI/updateUserPassword" target="body">修改密码</a>
					<span class="b-ico-dropdown"><i class="fa fa-arrow-circle-down"></i></span>
					</li>
					<li class="b-top-nav__1level f-top-nav__1level f-primary-b">
			        
			        	<a class="logoutA" href="${pageContext.request.contextPath }/adminUI/logout" target="_parent">注销</a>
					<span class="b-ico-dropdown"><i class="fa fa-arrow-circle-down"></i></span>
					</li>
				</ul>
		</nav>
	</c:otherwise>
</c:choose>
<a href="${pageContext.request.contextPath }/UI/index/" target="_parent">博客首页</a>	


</div>

<script src="${pageContext.request.contextPath }/resources/main_resources/js/jquery/jquery-1.11.1.min.js"></script>
<!-- bootstrap -->
<script src="${pageContext.request.contextPath }/resources/main_resources/js/bootstrap.min.js"></script>
<!-- end bootstrap -->


<!-- Modules -->
<script src="${pageContext.request.contextPath }/resources/main_resources/js/modules/color-themes.js"></script>
<!-- End Modules -->
<!-- Google services -->
<script type="text/javascript" src="https://www.google.com/jsapi?autoload={'modules':[{'name':'visualization','version':'1','packages':['corechart']}]}"></script>

<!-- end Google services -->
<!-- Fancybox -->
<script src="${pageContext.request.contextPath }/resources/main_resources/js/fancybox/jquery.fancybox.pack.js"></script>
<script src="${pageContext.request.contextPath }/resources/main_resources/js/fancybox/jquery.mousewheel.pack.js"></script>
<script src="${pageContext.request.contextPath }/resources/main_resources/js/fancybox/jquery.fancybox.custom.js"></script>
<!-- End Fancybox -->

<script src="${pageContext.request.contextPath }/resources/main_resources/js/cookie.js"></script>



  </body>
</html>
