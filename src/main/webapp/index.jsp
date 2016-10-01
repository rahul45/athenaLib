<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>
<head>
<title>Welcome to Aethenaeum</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/stylesCommon.css">
<script type="text/javascript"	src="js/jquery.min-3.0.0.js"></script>
<script	src="js/bootstrap.min3.3.7.js"></script>
</head>
<body class="loginMain">
	<!-- <div class="header text-center">
		<h1 class="page-header">Welcome To Aethenaeum</h1>
	</div> -->
	<div class="col-sm-12 _ind_header_space"></div>
	<div class="col-sm-4"></div>
	<div class="container col-sm-4 logintab" align="center">
		<table class="table" border="0">
			<tr>
				<td colspan="2"></td>
			</tr>
			<tr><form action="" method="post">
				<td><label>UserId</label></td>
				<td><input type="text" name="userid"
					placeholder="Enter your userId.. " class="form-control" /></td>
			</tr>
			<tr>
				<td><label>Password</label></td>
				<td><input type="password" name="upass" class="form-control"
					placeholder="Enter your password.. " /></td>
			</tr>
			<tr>
				<td><label>User</label> <input type="radio" name="user" value="user" /></td>
				<td><label>Admin</label> <input type="radio" name="user" value="admin" /></td>
			</tr>
			<tr>
				<td colspan="">
					<input type="button" class="btn-info btn-md" value="SignIn"/>
				</td>
				</form>
				<td colspan="">
					<button class="btn-info btn-md">SignUp</button>
				</td>
				
			</tr>

		</table>
	</div>
	<div class="col-sm-4"></div>
</body>
</html>
