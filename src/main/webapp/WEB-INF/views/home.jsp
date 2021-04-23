<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>

<body>
<div class="container">
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<h1>${data }</h1>

	<c:if test="${ not empty data }">
			<c:forEach items="${data}" var="item">
				<div>
					<a href='<s:url value="/detail/${item }"></s:url>'>${item }</a>
				</div>
			</c:forEach>
		</c:if>
		<hr />
		
		<div class="row">
			<div class="col-sm-4">
				<c:if test="${not empty fail }">
					<div class="alert alert-primary" role="alert">
						A simple primary alert with <a href="#" class="alert-link">${fail }</a>. Give it a click if you like.
					</div>
				</c:if>
				<form method="post">
					<input name="mail" type="email" placeholder="mail" class="form-control"/><br> 
					<input name="password" type="password"  placeholder="password" class="form-control" /> <br> 
					<input type="submit" value="Send" class="btn btn-success"/>
				</form>
			</div>
			<div class="col-sm-8"></div>
		</div>
</div>		
</body>

<script src="https://code.jquery.com/jquery-3.4.1.min.js" ></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
</html>
