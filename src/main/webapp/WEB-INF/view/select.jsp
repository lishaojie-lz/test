<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>查询</title>
<link href="/resource/bootstrap.css" rel="stylesheet">
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
</head>
<body>
<script type="text/javascript">
	function sel(pageNum) {
		$("form").serialize();
		$("form").submit();
	}
</script>
	<form>
		<input type="text" name="name" value="${movie.name }">
		<input type="text" name="author" value="${movie.author }">
		<button onclick="sel">查询</button>
	</form>
	<table class="table">
		<tr>
			<td>影片名</td>
			<td>导演</td>
			<td>票价</td>
			<td>上映时间</td>
			<td>时长</td>
			<td>类型</td>
			<td>年代</td>
			<td>区域</td>
			<td>状态</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${page }" var="movie" varStatus="count">
			<tr>
				<td>${page.name }</td>
				<td>${page.author}</td>
				<td>${page.price }</td>
				<td>${page.datetime }</td>
				<td>${page.times }</td>
				<td>${page.type }</td>
				<td>${page.years }</td>
				<td>${page.area }</td>
				<td>${page.status }</td>
				<td>
					<button>详情</button>
					<button>编辑</button>
					<button onclick="sta()">${page.status==1？上架:下架 }</button>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>