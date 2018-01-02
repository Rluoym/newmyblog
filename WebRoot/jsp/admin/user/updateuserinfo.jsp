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
						<form action="${pageContext.request.contextPath }/user/updateUserInfo" method="post">
							<b>昵称：</b><input name="userNickname" value="${userInfo.userNickname }" /><br/>
							<b>签名：</b><input name="userSignature" value="${userInfo.userSignature }" /><br/>
							<b>个人简介：</b><textarea name="userIntroduce" rows="5%" cols="90%">${userInfo.userIntroduce } </textarea>
							<input type="submit" value="修改"/>
						</form>
						


					</div>

				</div>

	
</body>
</html>