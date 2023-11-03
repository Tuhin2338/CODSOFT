<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddStudent/Student Management System</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Student Management System</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="home">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="addstudent">Add a Student</a>
        </li>
       </ul>
    </div>
  </div>
</nav>

<div class="container">
	<div class="row">
		<div class="col-md-6 offset-md-3">
			<div class="card">
				<div class="card-header text-center">
					<h3>Add a Student</h3>
				
				<c:if test="${not empty msg }">
							<h5 class="text-success">${msg }</h5>
							<c:remove var="msg" />
						</c:if>
				</div>
				<div class="card-body">
					<form action="createstd" method="post">
						<div class="mb-3">
							<label>Enter Full Name</label>
							<input type="text" name="fullname" class="form-control">
						</div>
						<div class="mb-3">
							<label>Enter Email</label>
							<input type="email" name="email" class="form-control">
						</div>
						<div class="mb-3">
							<label>Enter Address</label>
							<input type="text" name="address" class="form-control">
						</div>
						<div class="mb-3">
							<label>Enter Department</label>
							<input type="text" name="department" class="form-control">
						</div>
						<div class="mb-3">
							<label>Enter Password</label>
							<input type="password" name="password" class="form-control">
						</div>
						<button class="btn btn-primary">Reset</button>
						<button class="btn btn-primary">Submit</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>



</body>
</html>