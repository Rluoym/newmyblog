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



<link rel="canonical" href="http://www.shuang0420.com/categories/" />


<title>分类 | 博主</title>
<!-- hexo-inject:begin -->
<!-- hexo-inject:end -->
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
						<a href="${pageContext.request.contextPath }" class="brand"
							rel="start"> <span class="logo-line-before"><i></i></span> <span
							class="site-title">博主</span> <span class="logo-line-after"><i></i></span>
						</a>
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
						<li class="menu-item menu-item-home"><a
							href="${pageContext.request.contextPath }/UI/index" rel="section">  <br /> 首页
						</a></li>


						<li class="menu-item menu-item-categories"><a
							href="${pageContext.request.contextPath}/UI/category"
							rel="section"> 
								<br /> 分类
						</a></li>


						<li class="menu-item menu-item-works"><a href="${pageContext.request.contextPath}/UI/contact"
							rel="section"> 
								<br /> 联系方式
						</a></li>


						<li class="menu-item menu-item-about"><a
							href="${pageContext.request.contextPath}/UI/aboutme"
							rel="section"> 
								<br /> 关于我
						</a></li>


						<li class="menu-item menu-item-tags"><a
							href="${pageContext.request.contextPath}/jsp/blog/tags.jsp"
							rel="section"> 
								<br /> 标签
						</a></li>

						<li class="menu-item menu-item-search">
							<a href="javascript:;" class="popup-trigger"> 
							<br /> 搜索
						</a></li>

					</ul>

					<div class="site-search">

						<div class="popup">
							<span class="search-icon fa fa-search"></span> <input type="text"
								id="local-search-input" placeholder="search my blog...">
							<div id="local-search-result"></div>
							<span class="popup-btn-close">close</span>
						</div>

					</div>

				</nav>


			</div>
		</header>

		<main id="main" class="main">
		<div class="main-inner">
			<div class="content-wrap">

				<div id="content" class="content">


					<div id="posts" class="posts-expand">


						<div class="category-all-page">
							<div class="category-all-title">${totalCategories} categories in total</div>
							<div class="category-all">
								<ul class="category-list">
								<c:forEach items="${categoryList }" var="category">
									<li class="category-list-item">
										<c:if test="${category.blogCategoryMemo != '0'}">
											<a class="category-list-link" href="${pageContext.request.contextPath}/UI/blogsByCategory?categoryId=${category.blogCategoryId}">
										  		 ${category.blogCategoryName }</a>
										   	<span class="category-list-count">${category.blogCategoryMemo }</span>
										</c:if>
									    <c:if test="${category.blogCategoryMemo == '0'}">
											
										  		 ${category.blogCategoryName }
										   	<span class="category-list-count">${category.blogCategoryMemo }</span>
										</c:if>
									 </li>
								</c:forEach>
								</ul>
							</div>
						</div>

					</div>


				</div>





			</div>



			<div class="sidebar-toggle">
				<div class="sidebar-toggle-line-wrap">
					<span class="sidebar-toggle-line sidebar-toggle-line-first"></span>
					<span class="sidebar-toggle-line sidebar-toggle-line-middle"></span>
					<span class="sidebar-toggle-line sidebar-toggle-line-last"></span>
				</div>
			</div>

			<aside id="sidebar" class="sidebar">
				<div class="sidebar-inner">





					<section class="site-overview sidebar-panel  sidebar-panel-active ">
						<div class="site-author motion-element" itemprop="author"
								itemscope itemtype="//schema.org/Person">
								<img class="site-author-image" itemprop="image"
									src="${pageContext.request.contextPath }/resources/pic/5209-1.JPG" alt="" />
								<p class="site-author-name" itemprop="name">${userInfo.userNickname}</p>
								<p class="site-description motion-element"
									itemprop="description">${userInfo.userSignature }</p>
							</div>
						<nav class="site-state motion-element">
							<div class="site-state-item site-state-posts">
								<a href="${pageContext.request.contextPath }/UI/index"> <span class="site-state-item-count">${userInfo.userMemo}</span>
									<span class="site-state-item-name">posts</span>
								</a>
							</div>


							<div class="site-state-item site-state-categories">
								<a href="${pageContext.request.contextPath}/UI/category"> <span class="site-state-item-count">${userInfo.userAccount }</span>
									<span class="site-state-item-name">categories</span>
								</a>
							</div>

							<div class="site-state-item site-state-tags">
								<a href="/tags"> <span class="site-state-item-count">108</span>
									<span class="site-state-item-name">tags</span>
								</a>
							</div>

						</nav>



						<div class="feed-link motion-element">
							<a href="/atom.xml" rel="alternate"> <i class="fa fa-rss"></i>
								RSS
							</a>
						</div>


						<div class="links-of-author motion-element">


							<span class="links-of-author-item"> <a
								href="https://github.com/Shuang0420" target="_blank"
								title="GitHub"> <i class="fa fa-fw fa-github"></i> GitHub
							</a>
							</span> <span class="links-of-author-item"> <a
								href="http://www.linkedin.com/in/shuang-xu-7008b894?trk=nav_responsive_tab_profile_pic"
								target="_blank" title="LinkedIn"> <i
									class="fa fa-fw fa-linkedin"></i> LinkedIn
							</a>
							</span> <span class="links-of-author-item"> <a
								href="https://zhuanlan.zhihu.com/c_136690664" target="_blank"
								title="知乎"> <i class="fa fa-fw fa-globe"></i> 知乎
							</a>
							</span>


						</div>


						<div
							class="links-of-blogroll motion-element links-of-blogroll-inline">
							<div class="links-of-blogroll-title">
								<i class="fa  fa-fw fa-globe"></i> Links
							</div>
							<ul class="links-of-blogroll-list">

								<li class="links-of-blogroll-item"><a
									href="http://starllap.space" title="Star" target="_blank">Star</a>
								</li>

								<li class="links-of-blogroll-item"><a
									href="https://liam0205.me" title="Liam Huang" target="_blank">Liam
										Huang</a></li>

							</ul>
						</div>


					</section>



				</div>
			</aside>



		</div>
		</main>

		<footer id="footer" class="footer">
			<div class="footer-inner">
				<!-- Other code may be here -->
				<div class="copyright">

					&copy; 2016 - <span itemprop="copyrightYear">2017</span> 
				</div>

				<div class="powered-by">
					Powered by <a class="theme-link" href="https://hexo.io">Hexo</a>
				</div>

				<div class="theme-info">
					Theme - <a class="theme-link"
						href="https://github.com/iissnan/hexo-theme-next"> NexT.Mist </a>
				</div>


			</div>
		</footer>

		<div class="back-to-top">
			<i class="fa fa-arrow-up"></i>
		</div>
	</div>



	<script type="text/javascript">
  if (Object.prototype.toString.call(window.Promise) !== '[object Function]') {
    window.Promise = null;
  }
</script>


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

	<script type="text/javascript">
      var disqus_shortname = 'httpshuang0420githubio';
      var disqus_identifier = 'index.html';
      var disqus_title = "";
      var disqus_url = '';

      function run_disqus_script(disqus_script){
        var dsq = document.createElement('script');
        dsq.type = 'text/javascript';
        dsq.async = true;
        dsq.src = '//' + disqus_shortname + '.disqus.com/' + disqus_script;
        (document.getElementsByTagName('head')[0] || document.getElementsByTagName('body')[0]).appendChild(dsq);
      }

      run_disqus_script('count.js');
      
    </script>

	<script type="text/javascript">
    // Popup Window;
    var isfetched = false;
    // Search DB path;
    var search_path = "search.xml";
    if (search_path.length == 0) {
       search_path = "search.xml";
    }
    var path = "/" + search_path;
    // monitor main search box;

    function proceedsearch() {
      $("body").append('<div class="popoverlay">').css('overflow', 'hidden');
      $('.popup').toggle();

    }
    // search function;
    var searchFunc = function(path, search_id, content_id) {
    'use strict';
    $.ajax({
        url: path,
        dataType: "xml",
        async: true,
        success: function( xmlResponse ) {
            // get the contents from search data
            isfetched = true;
            $('.popup').detach().appendTo('.header-inner');
            var datas = $( "entry", xmlResponse ).map(function() {
                return {
                    title: $( "title", this ).text(),
                    content: $("content",this).text(),
                    url: $( "url" , this).text()
                };
            }).get();
            var $input = document.getElementById(search_id);
            var $resultContent = document.getElementById(content_id);
            $input.addEventListener('input', function(){
                var matchcounts = 0;
                var str='<ul class=\"search-result-list\">';
                var keywords = this.value.trim().toLowerCase().split(/[\s\-]+/);
                $resultContent.innerHTML = "";
                if (this.value.trim().length > 1) {
                // perform local searching
                datas.forEach(function(data) {
                    var isMatch = false;
                    var content_index = [];
                    var data_title = data.title.trim().toLowerCase();
                    var data_content = data.content.trim().replace(/<[^>]+>/g,"").toLowerCase();
                    var data_url = data.url;
                    var index_title = -1;
                    var index_content = -1;
                    var first_occur = -1;
                    // only match artiles with not empty titles and contents
                    if(data_title != '') {
                        keywords.forEach(function(keyword, i) {
                            index_title = data_title.indexOf(keyword);
                            index_content = data_content.indexOf(keyword);
                            if( index_title >= 0 || index_content >= 0 ){
                                isMatch = true;
								if (i == 0) {
                                    first_occur = index_content;
                                }
                            } 
							
                        });
                    }
                    // show search results
                    if (isMatch) {
                        matchcounts += 1;
                        str += "<li><a href='"+ data_url +"' class='search-result-title'>"+ data_title +"</a>";
                        var content = data.content.trim().replace(/<[^>]+>/g,"");
                        if (first_occur >= 0) {
                            // cut out 100 characters
                            var start = first_occur - 20;
                            var end = first_occur + 80;
                            if(start < 0){
                                start = 0;
                            }
                            if(start == 0){
                                end = 50;
                            }
                            if(end > content.length){
                                end = content.length;
                            }
                            var match_content = content.substring(start, end);
                            // highlight all keywords
                            keywords.forEach(function(keyword){
                                var regS = new RegExp(keyword, "gi");
                                match_content = match_content.replace(regS, "<b class=\"search-keyword\">"+keyword+"</b>");
                            });

                            str += "<p class=\"search-result\">" + match_content +"...</p>"
                        }
                        str += "</li>";
                    }
                })};
                str += "</ul>";
                if (matchcounts == 0) { str = '<div id="no-result"><i class="fa fa-frown-o fa-5x" /></div>' }
                if (keywords == "") { str = '<div id="no-result"><i class="fa fa-search fa-5x" /></div>' }
                $resultContent.innerHTML = str;
            });
            proceedsearch();
        }
    });}

    // handle and trigger popup window;
    $('.popup-trigger').click(function(e) {
      e.stopPropagation();
      if (isfetched == false) {
        searchFunc(path, 'local-search-input', 'local-search-result');
      } else {
        proceedsearch();
      };

    });

    $('.popup-btn-close').click(function(e){
      $('.popup').hide();
      $(".popoverlay").remove();
      $('body').css('overflow', '');
    });
    $('.popup').click(function(e){
      e.stopPropagation();
    });
  </script>

	<script>
(function(){
    var bp = document.createElement('script');
    var curProtocol = window.location.protocol.split(':')[0];
    if (curProtocol === 'https'){
   bp.src = 'https://zz.bdstatic.com/linksubmit/push.js';
  }
  else{
  bp.src = 'http://push.zhanzhang.baidu.com/push.js';
  }
    var s = document.getElementsByTagName("script")[0];
    s.parentNode.insertBefore(bp, s);
})();
</script>
	<!-- hexo-inject:begin -->
	<!-- Begin: Injected MathJax -->
	<script type="text/x-mathjax-config">
  MathJax.Hub.Config({"tex2jax":{"inlineMath":[["$","$"],["\\(","\\)"]],"skipTags":["script","noscript","style","textarea","pre","code"],"processEscapes":true},"TeX":{"equationNumbers":{"autoNumber":"AMS"}}});
</script>

	<script type="text/x-mathjax-config">
  MathJax.Hub.Queue(function() {
    var all = MathJax.Hub.getAllJax(), i;
    for(i=0; i < all.length; i += 1) {
      all[i].SourceElement().parentNode.className += ' has-jax';
    }
  });
</script>

	<script type="text/javascript"
		src="//cdn.mathjax.org/mathjax/latest/MathJax.js?config=TeX-AMS-MML_HTMLorMML">
</script>
	<!-- End: Injected MathJax -->
	<!-- hexo-inject:end -->

</body>
</html>
