<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta charset="utf-8">
    <title>body</title>
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


<div class="row b-col-default-indent">
    <div class="col-md-12">
        <div class="b-categories-filter">
         <ul>
             <li>
					<a href="${pageContext.request.contextPath }/adminUI/blog" target="body">博文管理</a><br/><br/>
					<a href="${pageContext.request.contextPath }/adminUI/blogCategory" target="body">博文分类管理</a><br/><br/>
			</li>
   
  
</ul>
        </div>
    </div>
    <div class="col-md-12">
        <h4 class="f-primary-b b-h4-special  f-h4-special--gray f-h4-special">最热文章</h4>

        <div class="b-blog-short-post b-blog-short-post--img-hover-bordered b-blog-short-post--w-img f-blog-short-post--w-img row">
            <div class="b-blog-short-post b-blog-short-post--img-hover-bordered b-blog-short-post--w-img f-blog-short-post--w-img row">
    <div class="b-blog-short-post--popular col-md-12  col-xs-12 f-primary-b">
        <div class="b-blog-short-post__item_img">
            <a href="#"><img data-retina src="${pageContext.request.contextPath }/resources/main_resources/img/gallery/sm/gallery_1.jpg" alt=""/></a>
        </div>
        <div class="b-remaining">
            <div class="b-blog-short-post__item_text f-blog-short-post__item_text">
                <a href="#">Phasellus id mattis dolorunc et erat hendrerit, tincidunt</a>
            </div>
            <div class="b-blog-short-post__item_date f-blog-short-post__item_date f-primary-it">
                10, January, 2014
            </div>
        </div>
    </div>
    <div class="copyrights">Collect from <a href="http://www.cssmoban.com/"  title="网站模板">网站模板</a></div>
    <div class="b-blog-short-post--popular col-md-12  col-xs-12 f-primary-b">
        <div class="b-blog-short-post__item_img">
            <a href="#"><img data-retina src="${pageContext.request.contextPath }/resources/main_resources/img/gallery/sm/gallery_2.jpg" alt=""/></a>
        </div>
        <div class="b-remaining">
            <div class="b-blog-short-post__item_text f-blog-short-post__item_text">
                <a href="#">Vel eleifend id ullamcorper eu velit</a>
            </div>
            <div class="b-blog-short-post__item_date f-blog-short-post__item_date f-primary-it">
                14, January, 2014
            </div>
        </div>
    </div>
 
    <div class="b-blog-short-post--popular col-md-12  col-xs-12 f-primary-b">
        <div class="b-blog-short-post__item_img">
            <a href="#"><img data-retina src="${pageContext.request.contextPath }/resources/main_resources/img/gallery/sm/gallery_3.jpg" alt=""/></a>
        </div>
        <div class="b-remaining">
            <div class="b-blog-short-post__item_text f-blog-short-post__item_text">
                <a href="#">Fusce vitae dui sit amet lacus rutrum convallis</a>
            </div>
            <div class="b-blog-short-post__item_date f-blog-short-post__item_date f-primary-it">
                10, January, 2014
            </div>
        </div>
    </div>
  
</div>
        </div>
    </div>
    <div class="col-md-12">
        <h4 class="f-primary-b b-h4-special f-h4-special--gray f-h4-special">标签云</h4>
        <div>
    <a class="f-tag b-tag" href="#">Dress</a>
    <a class="f-tag b-tag" href="#">Mini</a>
    
    <a class="f-tag b-tag" href="#">literature</a>
    <a class="f-tag b-tag" href="#">Baroque</a>
    <a class="f-tag b-tag" href="#">Dress</a>
    <a class="f-tag b-tag" href="#">Mini</a>

    <a class="f-tag b-tag" href="#">literature</a>
    <a class="f-tag b-tag" href="#">Baroque</a>
</div>
    </div>
</div>



  <div id="menu"></div>
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
