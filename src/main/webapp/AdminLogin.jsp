<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">
</head>
<body>
	<jsp:include page="Header.jsp"></jsp:include>
	<main class="container-fluid">
		<div class="card bg-light">
			<article class="card-body mx-auto" style="max-width: 400px;">
				<h4 class="card-title mt-3 text-center">ADMIN LOGIN</h4>
				<p class="text-center" id="message"></p>
				<form onsubmit="adminLogin()" method="POST">
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <em class="fa fa-user"
								style="font-size: 24px"></em>
							</span>
						</div>
						<input name="adminId" id="adminId" class="form-control"
							placeholder="Enter User Name" autocomplete="off" type="text"
							required>
					</div>
					<!-- form-group end.// -->
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <em class="fa fa-lock"
								style="font-size: 24px"></em>
							</span>
						</div>
						<input name="password" id="password" class="form-control"
							placeholder="Enter Password" autocomplete="off" type="password"
							required>
					</div>
					<div class="form-group">
						<button type="submit" class="btn btn-primary btn-block">
							Log In</button>
					</div>
				</form>
			</article>
		</div>
	</main>
	<script src="assets/js/AdminLogin-component.js"></script>
</body>
</html>



