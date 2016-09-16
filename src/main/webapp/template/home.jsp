<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="athena">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="../css/stylesCommon.css">
<link rel="stylesheet" type="text/css" href="../css/default.css" />
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script type="text/javascript" src="../js/angular.min.js"></script>
<script type="text/javascript" src="../js/angular-route.min.js"></script>
<script type="text/javascript" src="../js/app.js"></script>
<script type="text/javascript" src="../js/jquery.min-3.0.0.js"></script>
<script src="../js/bootstrap.min3.3.7.js"></script>
</head>
<body>
	<div class="container" ng-controller="mainController">
		<div ng-include="'header.html'"></div>
		<div ng-include="'addNew.jsp'" ng-hide="isRegisteration"></div>

		<div class="container" ng-hide="isHome">
			<div class="col-sm-12 text-center"></div>
			<div class="col-sm-3">
				<div class="square text-center" ng-click="gotoAddNew()">
					<div class="content">Add New Student</div>
				</div>
			</div>
			&nbsp;
			<div class="col-sm-3 text-center">
				<div class="square" ng-click="gotoSearch()">
					<div class="content">Search Details</div>
				</div>
			</div>
			&nbsp;
			<div class="col-sm-3 text-center">
				<div class="square" ng-click="gotoAllList()">
					<div class="content">Get All Student List</div>
				</div>
			</div>
			&nbsp;
			<div class="col-sm-3 text-center">
				<div class="square" ng-click="gotoPendingFee()">
					<div class="content text-center">Pending Fee List</div>
				</div>
			</div>
			<div class="col-sm-12 text-center">
				<br>
			</div>
			&nbsp;
			<div class="col-sm-3 text-center">
				<div class="square" ng-click="gotoUpdate()">
					<div class="content">Comming Soon</div>
				</div>
			</div>
			&nbsp;
			<div class="col-sm-3 text-center">
				<div class="square">
					<div class="content">Comming</div>
				</div>
			</div>
			&nbsp;
			<div class="col-sm-3 text-center">
				<div class="square">
					<div class="content">Comming</div>
				</div>
			</div>
		</div>
		<div ng-include="'pendingFee.jsp'" ng-hide="isPendingFee"></div>
		<div ng-include="'listAllStudent.jsp'" ng-hide="isAllList"></div>
		<div ng-include="'searchStudent.jsp'" ng-hide="isSearch"></div>
		<div ng-include="'updateStudent.jsp'" ng-hide="isUpdate"></div>
	</div>
</body>
</html>