<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js">
<!--<![endif]-->
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>管理登录</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="Free HTML5 Template by FreeHTML5.co" />
<meta name="keywords"
	content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />


<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
<link rel="shortcut icon" href="favicon.ico">

<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300'
	rel='stylesheet' type='text/css'>

<link1 rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/reg_login_resources/css/bootstrap.min.css">
<link1 rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/reg_login_resources/css/animate.css">
<link1 rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/reg_login_resources/css/style.css">


<!-- Modernizr JS -->
<script
	src="${pageContext.request.contextPath }/resources/reg_login_resources/js/modernizr-2.6.2.min.js"></script>
<!-- FOR IE9 below -->
<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->

</head>
<body class="style-2">

	<div class="container">
		<div class="row">
			<div class="col-md-12 text-center">
				<ul class="menu">
					<li>管理登录</li>

				</ul>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4">


				<!-- Start Sign In Form -->
				<form name="loginAction" action="" class="fh5co-form animate-box"
					data-animate-effect="fadeInLeft" method="post">
					<h2>
						登录<font color="red">${loginError}</font>
					</h2>
					<div class="form-group">
						<label for="username" class="sr-only">用户名</label> <input
							type="text" class="form-control" id="username" placeholder="请输账号"
							autocomplete="off" name="userAccount">
					</div>
					<div class="form-group">
						<label for="password" class="sr-only">密码</label> <input
							type="password" class="form-control" id="password"
							placeholder="请输入密码" autocomplete="off" name="userPassword">
					</div>
					<div class="form-group">
						<label for="remember"><input type="checkbox" id="remember">
							记住密码</label>
					</div>

					<div class="form-group">
						<input type="button" value="登录" class="btn btn-primary"
							onclick=check()>
					</div>
				</form>
				<!-- END Sign In Form -->

			</div>
		</div>
		<div class="row" style="padding-top: 60px; clear: both;">
			<div class="col-md-12 text-center">
				<p>
					<small>&copy; All Rights Reserved. </small>
				</p>
			</div>
		</div>
	</div>

	<!-- jQuery -->
	<script
		src="${pageContext.request.contextPath }/resources/reg_login_resources/js/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script
		src="${pageContext.request.contextPath }/resources/reg_login_resources/js/bootstrap.min.js"></script>
	<!-- Placeholder -->
	<script
		src="${pageContext.request.contextPath }/resources/reg_login_resources/js/jquery.placeholder.min.js"></script>
	<!-- Waypoints -->
	<script
		src="${pageContext.request.contextPath }/resources/reg_login_resources/js/jquery.waypoints.min.js"></script>
	<!-- Main JS -->
	<script
		src="${pageContext.request.contextPath }/resources/reg_login_resources/js/main.js"></script>
	<script type="text/javascript">

//表单校验
	function check(){
		var userAccount=document.getElementById('username');
		var userPassword=document.getElementById('password');

		if(userAccount.value.length==0) {
			alert('账号不能为空!');
			return false;
		}else if(userPassword.value.length==0 ){
			alert('密码不能为空!');
			return false;
		}else{
			document.loginAction.action="${pageContext.request.contextPath }/user/login";
			document.loginAction.submit();
			return true;
		}
	}
	

</script>
</body>

</html>

