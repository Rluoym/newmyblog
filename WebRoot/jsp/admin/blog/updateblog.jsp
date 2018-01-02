<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
request.setCharacterEncoding("UTF-8");
String htmlData = request.getParameter("content1") != null ? request.getParameter("content1") : "";
%>
<!doctype html>
<html>
<head>
	<meta charset="utf-8" />
	<title>KindEditor JSP</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/kindeditor/themes/default/default.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/kindeditor/plugins/code/prettify.css" />
	<script charset="utf-8" src="${pageContext.request.contextPath }/resources/kindeditor/kindeditor-all-min.js"></script>
	<script charset="utf-8" src="${pageContext.request.contextPath }/resources/kindeditor/lang/zh-CN.js"></script>
	<script charset="utf-8" src="${pageContext.request.contextPath }/resources/kindeditor/plugins/code/prettify.js"></script>
	<script>
		KindEditor.ready(function(K) {
			var editor1 = K.create('textarea[name="content1"]', {
				cssPath : '${pageContext.request.contextPath }/resources/kindeditor/plugins/code/prettify.css',
				uploadJson : '${pageContext.request.contextPath }/jsp/kindeditor/upload_json.jsp',
				fileManagerJson : '${pageContext.request.contextPath }/jsp/kindeditor/file_manager_json.jsp',
				allowFileManager : true,
				afterCreate : function() {
					var self = this;
					K.ctrl(document, 13, function() {
						self.sync();
						document.forms['example'].submit();
					});
					K.ctrl(self.edit.doc, 13, function() {
						self.sync();
						document.forms['example'].submit();
					});
				}
			});
			prettyPrint();
		});
	</script>
</head>
<body>
<hr/><br/><br/>
	<%=htmlData%>
	<form name="example" method="post" action="${pageContext.request.contextPath}/blog/updateBlog">
		<input name="blogId" value="${blogDetail.blogId }" type="hidden" />
		<input name="blogCreatetime" value="${blogDetail.blogCreatetime }" type="hidden" />
		<input name="blogMemo" value="" type="hidden" />
		博文标题:<input type="text" value="${blogDetail.blogTitle}" name="blogTitle"/>
		 所属分类:<select name="blogCategoryId">
		 		<c:forEach items="${categoryList }" var="category">
		 			<c:choose>
		 				<c:when test="${category.blogCategoryId == blogDetail.blogCategoryId}">
		 					<option value="${category.blogCategoryId }" selected="selected">${category.blogCategoryName }</option>
		 				</c:when>
		 				<c:otherwise>
		 					<option value="${category.blogCategoryId }">${category.blogCategoryName }</option>
		 				</c:otherwise>
		 			</c:choose>
		 			
		 		</c:forEach>
		 	   </select>
		
	<br/><font size="1">发表时间:${blogDetail.blogMemo}&nbsp;|&nbsp;修改时间:</font><br/><br/>
		<textarea name="content1" cols="100" rows="8" style="width:700px;height:200px;visibility:hidden;"><%=htmlspecialchars(htmlData)%>${blogDetail.blogContent}</textarea>
		<br />
		<input type="submit" name="button" value="修改" /> (提交快捷键: Ctrl + Enter)
	</form>
</body>
</html>
<%!
private String htmlspecialchars(String str) {
	str = str.replaceAll("&", "&amp;");
	str = str.replaceAll("<", "&lt;");
	str = str.replaceAll(">", "&gt;");
	str = str.replaceAll("\"", "&quot;");
	return str;
}
%>