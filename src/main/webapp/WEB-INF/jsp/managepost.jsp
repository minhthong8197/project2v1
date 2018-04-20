<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="vi">

<head>
<meta charset="utf-8">

<title>ManagePost</title>

<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>

<body>
	<div class="container-fluid">

		<!-- Header bar -->
		<div class="row">
			<div class="container-fluid" id="header">
				<div class="row center-block">
					<div class="col-md-9 col-sm-9 col-xs-12">
						<img src="img/logo.jpg" class="img-responsive"
							alt="Responsive image" id="logo">
					</div>
					<div class="col-md-3 col-sm-3 col-xs-12 center-block"
						id="searchBox">
						<form class="form-inline" role="form">
							<input style="width: 100%" type="text" class="form-control"
								placeholder="Tìm kiếm"> <br /> <input
								style="width: 100%" type="submit"
								class="form-control btn-success" value="Tìm"> <a
								href="http://gtsd2018.hcmute.edu.vn">http://gtsd2018.hcmute.edu.vn</a>
						</form>
					</div>
				</div>
			</div>
			<!-- Menu bar -->
			<div class="container-fluid">
				<nav class="navbar navbar-inverse">
					<div class="container-fluid">
						<div class="navbar-header">
							<a class="navbar-brand" href="/">ICSSE</a>
						</div>
						<ul class="nav navbar-nav">
							<li class="active"><a href="/">Home</a></li>
							<li><a href="#"> <b>ABOUT</b>
							</a></li>
							<li><a href="#"> <b>KEYNOTE SPEAKER</b>
							</a></li>
							<li><a href="/listpost"> <b>PROGRAM</b>
							</a></li>
							<li><a href="#"> <b>GALLERY</b>
							</a></li>
							<li><a href="#"> <b>CONTACT</b>
							</a></li>
						</ul>
						<ul class="nav navbar-nav navbar-right">
							<li><a href="/managepost"> Manage</a></li>
							<li><a href="/newpost"> New post</a></li>
							<li><a href="/logout">Logout</a></li>
							<li><a href="/login"> <span
									class="glyphicon glyphicon-user"></span> Login
							</a></li>
						</ul>
					</div>
				</nav>
			</div>
			<br />
			<!-- End Header-->
		</div>


		<!-- Content -->
		<div class="row">
			<div class="container-fluid" id="content">
				<!-- Left Collum -->
				<div class="col-md-9 col-sm-10 col-xs-12" id="managerPost">
					<h1 id="post_title">POST MANAGER</h1>
					<div class="table-responsive">
						<table class="table table-bodered">
							<tr>
								<th><strong>TT</strong></th>
								<th><strong>Post name</strong></th>
								<th><strong>Category</strong></th>
								<th><strong>Content</strong></th>
								<th><strong>Edit</strong></th>
								<th><strong>Delete</strong></th>
							</tr>
							<c:forEach items="${posts}" var="post">
								<tr>
									<td>${post.id}</td>
									<td>${post.tittle}</td>
									<td>chức năng chưa hoàn thành</td>
									<td><a href="/loadpost?id=${post.id}">Xem nội dung</a></td>
									<td><a href="/editpost?id=${post.id}"
										class="btn btn-primary">Edit</a></td>
									<td><a class="btn btn-danger">Delete</a></td>
								</tr>
							</c:forEach>
						</table>
					</div>
				</div>

				<!-- Right Collum -->
				<div class="col-md-3 col-sm-2 col-xs-0" id="adv">
					<div class="container-fluid"
						style="background-color: cyan; padding: 5px; text-align: center;">
						<h4>
							<a href="/listpost">DANH SÁCH TIN TỨC</a>
						</h4>
					</div>
					<c:forEach end="20" begin="0" var="post" items="${posts}">
						<a href="/loadpost?id=${post.id}">${post.tittle}</a>
						<br>
					</c:forEach>
				</div>
			</div>
			<!-- End Content -->
		</div>


		<br />

		<!--Footer -->
		<div class="row">
			<div class="container-fluid footer" id="footer">
				<p>4th International Conference on Green Technology and
					Sustainable Development</p>
				<p>HCMC University of Technology and Education</p>
				<p>Add: No 1 Vo Van Ngan Street, Linh Chieu Ward, Thu Duc
					District, Ho Chi Minh City</p>
				<p>Tel: (+84.8) 37 221 223 - Ext: 8161 or 8443</p>
				<p>E-mail: gtsd2018@hcmute.edu.vn</p>
			</div>
		</div>
	</div>

</body>

</html>