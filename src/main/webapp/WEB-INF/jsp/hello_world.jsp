<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 06/05/2024
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!DOCTYPE html>
<!-- Created By CodingNepal - www.codingnepalweb.com -->
<html lang="en" dir="ltr">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Website Layout | CodingLab</title>
    <style>
        <%@include file="/css/style.css"%>
    </style>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css" />
</head>

<body>
<nav>
    <div class="menu">
        <div class="logo">
            <a href="#">Managae</a>
        </div>
        <ul>
            <li><a href="/">Home</a></li>
            <li><a href="show">List Student</a></li>
            <li><a href="add">Add</a></li>
            <li><a href="#">Feedback</a></li>
        </ul>
    </div>
</nav>
<div class="img"></div>
<div class="center">
    <div class="title">Welcome to your system of management</div>
    <div class="sub_title">Manage your students here</div>
    <div class="btns">
        <button>List of Student</button>
    </div>
</div>
<section class="about-us m-3">
    <h1 class="text-center">About Us
        <hr>
    </h1>
    <div class="row align-items-center justify-content-center">
        <div class="col-lg-6">
            <img src="https://images.pexels.com/photos/261102/pexels-photo-261102.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2"
                 alt="Hotel Image" class="img-fluid">
        </div>
        <div class="col-lg-6">
            <h2 class="aboutus">About Us</h2>

            <p>Welcome to our hotel, located in the heart of the city. We pride ourselves on providing you with an
                exceptional experience with our attentive service and quality facilities.</p>
            <p>Our establishment has been designed to offer you the comfort and luxury you need for an unforgettable
                vacation. Whether you are on a business trip or on vacation, we are here to make your stay
                memorable.</p>
            <a href="#" class="btn btn-primary">Learn more</a>
        </div>
    </div>

</section>

<footer class="footer">
    <div class="container">
        <div class="row">
            <div class="col-md-4">
                <h4>About Us</h4>
                <p>Our Management Site offers an exceptional experience with attentive service and quality
                    facilities.</p>
            </div>
            <div class="col-md-4">
                <h4>Quick links</h4>
                <ul class="list-unstyled">
                    <li><a href="/">Home</a></li>
                    <li><a href="show">List Student</a></li>
                    <li><a href="add">Add</a></li>
                    <li><a href="#">Feedback</a></li>
                </ul>
            </div>
            <div class="col-md-4">
                <h4>Contact us</h4>
                <ul class="list-unstyled">
                    <li><i class="fas fa-map-marker-alt"></i> Address: 456 Casablanca Street, Rabat, Morocco</li>
                    <li><i class="fas fa-phone"></i> Phone: +212 (555) 987-6543</li>
                    <li><i class="fas fa-envelope"></i> info@managergroups.com</li>
                </ul>
            </div>
        </div>
    </div>
    <div class="copyright">
        <div class="container">
            <p>&copy; 2024 Student Management Example. All rights reserved.</p>
        </div>
    </div>
</footer>
</body>

</html>
