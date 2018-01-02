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

<link rel="canonical" href="http://www.shuang0420.com/categories/" />


<title>分类 | 博主</title>
<!-- hexo-inject:begin -->
<!-- hexo-inject:end -->
<script type="text/javascript">
function deleteCategories(){
	alert('xxxx');
	//提交form
	document.deleteCategoriesOrUpdateOrAddCategoryForm.action="${pageContext.request.contextPath }/category/deleteCategories";
	document.deleteCategoriesOrUpdateOrAddCategoryForm.submit();
}

function updateDiag(oldCategoryName,categoryId)
{
    var str=prompt("原分类名:"+oldCategoryName);
    if(str)
    {
        var newCategoryName=str;
        document.deleteCategoriesOrUpdateOrAddCategoryForm.action="${pageContext.request.contextPath }/category/updateCategory?blogCategoryId="+categoryId+"&&blogCategoryName="+newCategoryName;
        document.deleteCategoriesOrUpdateOrAddCategoryForm.submit();
    }
}

function addDiag(oldCategoryName,categoryId)
{
    var categoryName=prompt("请输入分类名:");
    if(categoryName)
    {
        document.deleteCategoriesOrUpdateOrAddCategoryForm.action="${pageContext.request.contextPath }/category/addCategory?blogCategoryName="+categoryName;
        document.deleteCategoriesOrUpdateOrAddCategoryForm.submit();
    }else{
    	alert("名称不能为空");
    }
}
</script>
</head>

<body itemscope itemtype="//schema.org/WebPage" lang="en">

	<!-- hexo-inject:begin -->
	<!-- hexo-inject:end -->
	<div class="container one-collumn sidebar-position-left  ">
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
						<li class="menu-item menu-item-home"></li>
						<li class="menu-item menu-item-categories"></li>
						<li class="menu-item menu-item-works"></li>
						<li class="menu-item menu-item-about"></li>
						<li class="menu-item menu-item-tags"></li>
						<li class="menu-item menu-item-search"></li>

					</ul>
				</nav>
			</div>
		</header>

		<main id="main" class="main">
		<div class="main-inner">
			<div class="content-wrap">

				<div id="content" class="content">

				<form action="" name="deleteCategoriesOrUpdateOrAddCategoryForm" method="post">
					<div id="posts" class="posts-expand">


						<div class="category-all-page">
							<div class="category-all-title">
								${totalCategories} categories in total 
								&nbsp;|&nbsp;<input type="button" onclick="addDiag()" value="添加分类"/>
								&nbsp;|&nbsp;<input type="button" onclick="deleteCategories()" value="批量删除分类"/>
							</div>
							<div class="category-all">
								<ul class="category-list">
								<c:forEach items="${categoryList }" var="category">
									<li class="category-list-item">
										<c:if test="${category.blogCategoryMemo != '0'}">
											<input type="checkbox" name="categoryIds" value="${category.blogCategoryId }"/><a class="category-list-link" href="${pageContext.request.contextPath}/adminUI/blogsByCategory?categoryId=${category.blogCategoryId}">
										  		 ${category.blogCategoryName }</a>
										   	<span class="category-list-count">${category.blogCategoryMemo }</span> <a href="${pageContext.request.contextPath}/category/deleteCategory?blogCategoryId=${category.blogCategoryId }">删除</a>&nbsp;|&nbsp;<input type="button" onclick="updateDiag('${category.blogCategoryName }','${category.blogCategoryId }')" value="修改"/>
										</c:if>
									    <c:if test="${category.blogCategoryMemo == '0'}">
											
										  		<input type="checkbox" name="categoryIds" value="${category.blogCategoryId }"/> ${category.blogCategoryName }
										   	<span class="category-list-count">${category.blogCategoryMemo }</span>  <a href="${pageContext.request.contextPath}/category/deleteCategory?blogCategoryId=${category.blogCategoryId }">删除</a>&nbsp;|&nbsp;<input type="button" onclick="updateDiag('${category.blogCategoryName }','${category.blogCategoryId }')" value="修改"/>
										</c:if>
									 </li>
								</c:forEach>
								</ul>
							</div>
						</div>
					</div>
				</form>
				</div>
			</div>
		</div>
		</main>

		


</body>
</html>
