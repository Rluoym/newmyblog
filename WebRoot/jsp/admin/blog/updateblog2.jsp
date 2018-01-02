<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!doctype html>


<html class="theme-next mist use-motion">
<head>
  <!-- hexo-inject:begin --><!-- hexo-inject:end --><meta charset="UTF-8"/>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1"/>



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

  <title> 博文详细信息 | 博主 </title><!-- hexo-inject:begin --><!-- hexo-inject:end -->
</head>

<body itemscope itemtype="//schema.org/WebPage" lang="en">

  



  <!-- hexo-inject:begin --><!-- hexo-inject:end --><div class="container one-collumn sidebar-position-left page-post-detail ">
    <div class="headband"></div>

    <header id="header" class="header" itemscope itemtype="//schema.org/WPHeader">
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
            

  <div id="posts" class="posts-expand">
    
<form action="" method="post" >
  <article class="post post-type-normal " itemscope itemtype="//schema.org/Article">

    
      <header class="post-header">

        
          <h1 class="post-title" itemprop="name headline"><input type="text" value="${blogDetail.blogTitle}" name="blogTitle"/> </h1>
        

        <div class="post-meta">
          <span class="post-time">
            <span class="post-meta-item-icon">
              <i class="fa fa-calendar-o"></i>
            </span>
            <span class="post-meta-item-text">Posted on</span>
            <time itemprop="dateCreated" datetime="2017-11-11T19:55:12+08:00" content="2017-11-11">
              ${blogDetail.blogMemo}
            </time>
          </span>

          
            <span class="post-category" >
              &nbsp; | &nbsp;
              <span class="post-meta-item-icon">
                <i class="fa fa-folder-o"></i>
              </span>
              <span class="post-meta-item-text">In</span>
              
                <span itemprop="about" itemscope itemtype="https://schema.org/Thing">
                    <span itemprop="name">${blogDetail.blogCategoryName}</span>
                </span>
              
            </span>
              &nbsp; | &nbsp;
              <span class="page-pv">阅读
              <span class="busuanzi-value" id="busuanzi_value_page_pv" ></span>
              </span>
          
        </div>
        
      </header>
    


    <div class="post-body" itemprop="articleBody">

<p><textarea rows="10" cols="100">${blogDetail.blogContent}</textarea></p> </div></article>
<input type="submit" value="修改"/>
 </form>
<p><strong>公众号：</strong> xxxx<br><strong>知乎专栏：</strong> <a href="" target="_blank" rel="external">空白</a></p>

      
    </div>

    <div>
      
        
<div id="wechat_subscriber" style="display: block; padding: 10px 0; margin: 20px auto; width: 100%; text-align: center">
    <img id="wechat_subscriber_qcode" src="/uploads/wechat.jpg" alt="徐阿衡 wechat" style="width: 200px; max-width: 100%;"/>
    <div>欢迎关注：空白的微信公众号</div>
</div>


      
    </div>

    <div>
      
        
  <div style="padding: 10px 0; margin: 20px auto; width: 90%; text-align: center;">
    <div>客官，打个赏呗~</div>
    <button id="rewardButton" disable="enable" onclick="var qr = document.getElementById('QR'); if (qr.style.display === 'none') {qr.style.display='block';} else {qr.style.display='none'}">
      <span>赏</span>
    </button>
    <div id="QR" style="display: none;">
      
        <div id="wechat" style="display: inline-block">
          <img id="wechat_qr" src="http://7xu83c.com1.z0.glb.clouddn.com/1.pic.jpg" alt="徐阿衡 WeChat Pay"/>
          <p>微信打赏</p>
        </div>
      
      
    </div>
  </div>


      
    </div>


  </article>

    <div class="post-spread">
      
    </div>
  </div>


          </div>
          
  <div class="comments" id="comments">
    
      <div id="disqus_thread">
        <noscript>
          Please enable JavaScript to view the
          <a href="//disqus.com/?ref_noscript">comments powered by Disqus.</a>
        </noscript>
      </div>
     
  </div>


        </div>
       
      </div>
    </main>


    <div class="back-to-top">
      <i class="fa fa-arrow-up"></i>
    </div>
  </div>

  
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

  <script type="text/javascript" src="${pageContext.request.contextPath }/resources/test/scrollspy.js?v=5.1.3"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath }/resources/test/post-details.js?v=5.1.3"></script>



</body>
</html>
