<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!doctype html>

<html class="theme-next mist use-motion">
<head>
<!-- hexo-inject:begin -->
<!-- hexo-inject:end -->
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />

<meta http-equiv="Cache-Control" content="no-transform" />
<meta http-equiv="Cache-Control" content="no-siteapp" />


<link href="${pageContext.request.contextPath }/resources/test/test.css"
	rel="stylesheet" type="text/css" />
<link
	href="//fonts.googleapis.com/css?family=Lato:300,300italic,400,400italic,700,700italic&subset=latin,latin-ext"
	rel="stylesheet" type="text/css">
<link
	href="${pageContext.request.contextPath }/resources/test/test2.css"
	rel="stylesheet" type="text/css" />
<link
	href="${pageContext.request.contextPath }/resources/test/test3.css"
	rel="stylesheet" type="text/css" />

<meta name="keywords" content="Hexo, NexT" />
<link rel="alternate" href="/atom.xml" title="xxx"
	type="application/atom+xml" />
<link rel="shortcut icon" type="image/x-icon"
	href="/favicon.ico?v=5.1.3" />

<script type="text/javascript" id="hexo.configuration">
  var NexT = window.NexT || {};
  var CONFIG = {
    scheme: 'Mist',
    sidebar: {"position":"left","display":"post"},
    fancybox: true,
    motion: true,
    duoshuo: {
      userId: '6294135991397516000',
      author: 'xxx'
    }
  };
</script>

<link rel="canonical" href="http://www.shuang0420.com/" />
<title>关于我 | 博主</title>
<!-- hexo-inject:begin -->
<!-- hexo-inject:end -->
</head>

<body itemscope itemtype="//schema.org/WebPage" lang="en">



	<!-- hexo-inject:begin -->
	<!-- hexo-inject:end -->
	<div
		class="container one-collumn sidebar-position-left 
   page-home 
 ">
		<div class="headband"></div>

		<main id="main" class="main">
		<div class="main-inner">
			<div class="content-wrap">

				<div id="content" class="content">
					<div id="posts" class="posts-expand">


						<h1 id="About-Me">
							<a href="" class="headerlink" ></a>个人资料修改
							<br/><br/>
						</h1>
						<form action="${pageContext.request.contextPath }/user/updatePassword" method="post">
							<b>请输入旧密码：</b><input type="password" name="userPassword" id="passwordId"/><font id="error1" color="red" ></font><br/>
							<b>请输入新密码：</b><input type="password" name="userPasswordNew" id="passwordId2" /><font id="error2" color="red" ></font><br/>
							<b>请确认新密码：</b><input type="password" name="userPasswordNewConfirm" id="passwordId3"/><font id="error3" color="red" ></font><br/>
							<input type="submit" value="修改"/>
						</form>
						


					</div>

				</div>

	
</body>
<!-- jQuery -->
	<script src="${pageContext.request.contextPath }/resources/reg_login_resources/js/jquery.min.js"></script>
	<script type="text/javascript">
	$("#passwordId").blur(  //失去焦点事件
			function(){
				var userPassword=$("#passwordId").val();
				if(userPassword.length==0){
					$(":input[type=submit]").attr("disabled",true);
					$("#error1").text("原始密码不能为空!");
				}else{
					$(":input[type=submit]").attr("disabled",false);
					$("#error1").text("");
					//发送异步请求
					$.ajax({
						url:"${pageContext.request.contextPath }/user/isPasswordRight",
						data:"userPassword="+userPassword,
						async:true,//异步请求
						cache:false,
						type:"POST",
						//dataType:"json",  //返回的参数格式，转换为json
						success:function(isPasswordRight){
							if(!isPasswordRight){
								$(":input[type=submit]").attr("disabled",true);
								$("#error1").text("原始密码错误");
							}	
							else{
								$(":input[type=submit]").attr("disabled",false);
								$("#error1").text("打钩");
							}	
						}
					});
				}
					
			}
		);
	$("#passwordId2").blur(  //失去焦点事件
			function(){
				var userPassword2=$("#passwordId2").val();
				if(userPassword2.length==0){
					$(":input[type=submit]").attr("disabled",true);
					$("#error2").text("不能为空!");
				}else{
					$("#error2").text("打钩");
				}
			}
		);
	
	$("#passwordId3").blur(  //失去焦点事件
			function(){
				var userPassword2=$("#passwordId2").val();
				var userPassword3=$("#passwordId3").val();
				if(userPassword3.length==0){
					$(":input[type=submit]").attr("disabled",true);
					$("#error3").text("不能为空!");
				}else{
					if(userPassword2==userPassword3){
						$(":input[type=submit]").attr("disabled",false);
						$("#error2").text("打钩");
						
					}else{
						$("#error3").text("两次密码不一致!");
					}
					
				}
			}
		);
	</script>
</html>