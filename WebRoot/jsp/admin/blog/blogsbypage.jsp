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



<script type="text/javascript" id="hexo.configuration">
  var NexT = window.NexT || {};
  var CONFIG = {
    scheme: 'Mist',
    sidebar: {"position":"left","display":"post"},
    fancybox: true,
    motion: true
  };
</script>

<script type="text/javascript">
function deleteBlogsByIds(){
	alert('xxxx');
	//提交form
	document.deleteBlogsByBlogIds.action="${pageContext.request.contextPath }/blog/deleteBlogsByIds";
	document.deleteBlogsByBlogIds.submit();
}

</script>
<title>首页</title>
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

		<header id="header" class="header" itemscope
			itemtype="//schema.org/WPHeader">
			<div class="header-inner">
				<div class="site-meta ">


					<div class="custom-logo-site-title">
						
					</div>
				</div>

				<div class="site-nav-toggle">
					<button>
						<span class="btn-bar"></span> <span class="btn-bar"></span> <span
							class="btn-bar"></span>
					</button>
				</div>

				<nav class="site-nav">
					<ul id="menu" class="menu">
						<li class="menu-item menu-item-home"><a href="${pageContext.request.contextPath }/adminUI/addBlog">添加博文</a></li>
						<li class="menu-item menu-item-works"><input type="button" onclick="deleteBlogsByIds()" value="批量删除博文"/></li>

					</ul>
				</nav>
			</div>
		</header>

		<main id="main" class="main">
		<div class="main-inner">
			<div class="content-wrap">

				<div id="content" class="content">
				<form action="${pageContext.request.contextPath }/blog/deleteBlogsByIds" method="post" name="deleteBlogsByBlogIds">
					<section id="posts" class="posts-expand">

				<c:forEach items="${blogListByCreatetime}" var="blogAndCategoryView">
						<article class="post post-type-normal " itemscope
							itemtype="//schema.org/Article">
							<header class="post-header">
							
								<h1 class="post-title" itemprop="name headline"><input type="checkbox" name="blogIds" value="${blogAndCategoryView.blogId}"/>
									<a class="post-title-link" href="${pageContext.request.contextPath }/adminUI/updateBlog?blogId=${blogAndCategoryView.blogId}"
										itemprop="url"> ${blogAndCategoryView.blogTitle } </a>


								</h1>
							

								<div class="post-meta">
									<span class="post-time"> <span
										class="post-meta-item-icon"> <i
											class="fa fa-calendar-o"></i>
									</span> <span class="post-meta-item-text">Posted on</span> <time
											itemprop="dateCreated" datetime="2017-11-11T19:55:12+08:00"
											content="2017-11-11"> ${blogAndCategoryView.blogMemo } </time>
									</span> <span class="post-category"> &nbsp; | &nbsp; <span
										class="post-meta-item-icon"> <i class="fa fa-folder-o"></i>
									</span> <span class="post-meta-item-text">In</span> <span
										itemprop="about" itemscope itemtype="https://schema.org/Thing">
											<a href="${pageContext.request.contextPath }/UI/blogsByCategory?categoryId=${blogAndCategoryView.blogCategoryId}" itemprop="url" rel="index">
												<span itemprop="name">${blogAndCategoryView.blogCategoryName }</span>
										</a>
									</span> &nbsp;|  &nbsp;<a href="${pageContext.request.contextPath }/adminUI/updateBlog?blogId=${blogAndCategoryView.blogId}"
										rel="contents">修改 </a>
										&nbsp;|  &nbsp;<a href="${pageContext.request.contextPath }/blog/deleteBlogById?blogId=${blogAndCategoryView.blogId}"
										rel="contents">删除 </a>

								</div>
							</header>

							<div class="post-body" itemprop="articleBody">

								<p>
									${blogAndCategoryView.blogContent }<br>
								<div class="post-more-link text-center">
									<a class="btn" href="${pageContext.request.contextPath }/adminUI/updateBlog?blogId=${blogAndCategoryView.blogId}"
										rel="contents"> Read more &raquo; </a>
										
									
								</div>


							</div>

							<div></div>

							<div></div>

							<footer class="post-footer">


								<div class="post-eof"></div>

							</footer>
						</article>
					</c:forEach>
					</section>
			</form>

				<nav class="pagination">
					<c:if test="${currentPage !=1 }">
					 	<a class="extend prev" rel="prev" href="${pageContext.request.contextPath }/adminUI/page?currentPage=${currentPage -1}"> <i >&laquo;</i></a>
					</c:if>
					<c:forEach begin="1" end="${totalPage}" varStatus="perPage">
						<c:choose>
							<c:when test="${currentPage == perPage.count }"> <%--当前页 --%>
								<span class="page-number current">${currentPage }</span>  
							</c:when>
							<c:otherwise>
								<a class="page-number" href="${pageContext.request.contextPath }/adminUI/page?currentPage=${perPage.count}">${perPage.count}</a> 
								<!--  <span class="space">&hellip;</span>  -->     <%--页数过多的话 使用省略号--%>
								<!--  <a class="page-number" href="/page/15/">15</a> -->
							</c:otherwise>
						</c:choose>
					</c:forEach>
					<c:if test="${currentPage !=totalPage }">
						<a class="extend next" rel="next" href="${pageContext.request.contextPath }/adminUI/page?currentPage=${currentPage +1}"> <i >&raquo;</i></a>
					</c:if>
				</nav>

	<script type="text/javascript"
		src="${pageContext.request.contextPath }/resources/test/test.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/resources/test/test2.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/resources/test/test3.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/resources/test/test4.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/resources/test/test5.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/resources/test/test6.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/resources/test/test7.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/resources/test/test8.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/resources/test/test9.js"></script>

</body>
</html>