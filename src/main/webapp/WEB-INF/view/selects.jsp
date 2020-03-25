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
	function fenye(pageNum) {
		$("[name=pageNum]").val(pageNum);
		$("form").serialize();
		$("form").submit();
	}
	function choose(thiz) {
		var num = $("[name=check]").val();
		
	}
	function del() {
		
		var ids = $("name=check").map(function(){
			return this.value;
		}).get().join();
		
		
		
		$.post("del",{ids:id},function(page){
			if(page>0){
				alert("删除成功！")
				location.href="selects";
			}else{
				alert("删除失败！")
			}
		},"json")
	}
	function sel() {
		location.href="select";
	}
</script>
	<form>
		<input type="hidden" name="pageNum">
	</form>
	<button onclick="sel()">查询影片</button>
	<button>添加影片</button>
	<button onclick="del()">删除影片</button>
	<table class="table">
		<tr>
			<td><input type="checkbox" onclick="choose(this)"></td>
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
				<td><input type="checkbox" name="check" value="${page.id }"></td>
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
			<tr>
				<td>
					<button onclick="fenye(1)">首页</button>
					<button onclick="fenye(${page.prePage==0?1:page.prePage})">上一页</button>
					<button onclick="fenye(${page.nextPage==0?page.pages:page.nextPage})">下一页</button>
					<button onclick="fenye(${page.pages})">尾页</button>
				</td>
			</tr>
	</table>
</body>
</html>