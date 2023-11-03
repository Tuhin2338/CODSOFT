<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home/Student Management System</title>
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
<div class="container mt-5">
	<div class="row">
		<div class="com-md-12">
			<div class="card">
				<div class="card-header">
					<div class="card-body">
						<div class="text-center"><h1>Student Details</h1></div>
						
				<c:if test="${not empty msg }">
							<h5 class="text-success">${msg }</h5>
							<c:remove var="msg" />
						</c:if>
						<table class="table table-dark table-striped">
						  <thead>
						    <tr>
						      <th scope="col">Id</th>
						      <th scope="col">Full Name</th>
						      <th scope="col">Email</th>
						      <th scope="col">Department</th>
						      <th scope="col">Address</th>
						      <th scope="col">Action</th>
						    </tr>
						  </thead>
						  <tbody>
						    <c:forEach items="${stdlist }" var="std">
						    <tr>
						      <th scope="row">${std.id }</th>
						      <td>${std.fullname}</td>
						      <td>${std.email}</td>
						      <td>${std.department}</td>
						      <td>${std.address}</td>
						      <td><a href="edit_std/${std.id}" class="btn btn-sm btn-primary">Edit</a>
						      <a href="delete_std/${std.id}" class="btn btn-sm btn-danger">Delete</a></td>
						      </tr>
						     </c:forEach>
					
						  </tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>