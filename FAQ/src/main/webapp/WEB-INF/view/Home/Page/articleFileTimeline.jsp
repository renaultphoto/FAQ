<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid"%>

<rapid:override name="description">
	<meta name="description" content="文章归档" />
</rapid:override>

<rapid:override name="keywords">
	<meta name="keywords" content="文章,归档" />
</rapid:override>

<rapid:override name="title">
	<title>文章归档--${options.optionSiteTitle}</title>
</rapid:override>

<rapid:override name="breadcrumb">
	<%--面包屑导航 start--%>
	<nav class="breadcrumb">
		<a class="crumbs" href="/"> <i class="fa fa-home"></i>首页
		</a> <i class="fa fa-angle-right"></i> 文章归档 <i class="fa fa-angle-right"></i>
		正文
	</nav>
	<%--面包屑导航 end--%>
</rapid:override>

<rapid:override name="left">
	<%--博客主体-左侧正文 start--%>
	<section id="primary" class="content-area">
		<main id="main" class="site-main" role="main">
		<ul class="layui-timeline"> 
	  <c:forEach items="${articleList}" var="a"> 
		  <li class="layui-timeline-item">
		  	  <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
			  <div class="layui-timeline-content layui-text">
			  <h3 class="layui-timeline-title"><fmt:formatDate value="${a.articleCustom.articlePostTime}" pattern="yyyy年MM月dd日" /></h3>
			  <p>
		        <a href="/article/${a.articleCustom.articleId}">${a.articleCustom.articleTitle}</a>
		      </p>
		      </div>
		  </li>
	</c:forEach>
</ul>
		</main>
	</section>
</rapid:override>

<%@ include file="../Public/framework.jsp"%>