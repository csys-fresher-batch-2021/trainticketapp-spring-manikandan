<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Register User</title>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">
</head>
<body>
	<jsp:include page="Header.jsp"></jsp:include>
	<main class="container-fluid">
		<div class="card bg-light">
			<article class="card-body mx-auto" style="max-width: 410px;">
				<h4 class="card-title mt-3 text-center">Create Account</h4>
				<p class="text-center">Get started with our Train Ticket App</p>
				<p class="text-center" id="message"></p>
				<form method="post" onsubmit="registerUser()">
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <em class="fa fa-user"
								style="font-size: 24px"></em>
							</span>
						</div>
						<input name="firstName" id="firstName" class="form-control"
							placeholder="First Name" type="text" autocomplete="off" required>
						<input name="lastName" id="lastName" class="form-control"
							placeholder="Last Name" type="text" autocomplete="off" required>
					</div>
					<!-- form-group// -->
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <em class="fa fa-envelope"
								style="font-size: 24px"></em>
							</span>
						</div>
						<input name="email" id="email" class="form-control"
							placeholder="Enter Email Address" type="email" autocomplete="off"
							required>
					</div>
					<!-- form-group// -->
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <em class="fa fa-phone"
								style="font-size: 24px"></em>
							</span> <input class="input-group-text" value="+91" type="text"
								style="width: 55px;" readonly>
						</div>
						<input name="mobileNumber" id="mobileNumber" class="form-control"
							placeholder="Mobile Number" type="number" autocomplete="off"
							required>
					</div>
					<!-- form-group// -->
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <em class="fa fa-user"
								style="font-size: 24px"></em>
							</span>
						</div>
						<input name="userName" id="userName" class="form-control"
							placeholder="Enter User Name" type="text" autocomplete="off"
							required>
					</div>
					<div>
						<ul>
							<li>User Name must contains At least one Upper,Lower letters
								and one Number.</li>
							<li>Length of User Name should be > 6 Characters.</li>
						</ul>

					</div>
					<!-- form-group end.// -->
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <em class="fa fa-lock"
								style="font-size: 24px"></em>
							</span>
						</div>
						<input name="newPassword" id="newPassword" class="form-control"
							placeholder="New Password" type="password" autocomplete="off"
							required>
					</div>
					<div>
						<ul>
							<li>Password must contains At least one Upper,Lower letters,
								one Symbol and one Number.</li>
							<li>Length of Password should be > 8 Characters.</li>
						</ul>
					</div>
					<div class="form-group input-group">
						<input type="checkbox" required>By Creating Account you
						accept our Terms Of Use
					</div>
					<div class="form-group">
						<button type="submit" class="btn btn-primary btn-block">
							Create Account</button>
					</div>
					<p class="text-center">
						Have an account? <a href="UserLogin.jsp">Log In</a>
					</p>
				</form>
			</article>
		</div>
	</main>
	<script src="assets/js/RegisterUser-component.js"></script>
</body>
</html>