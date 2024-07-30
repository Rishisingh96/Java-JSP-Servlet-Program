
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Rishi Fitness</title>
	<!-- <link rel="stylesheet" href="css/style.css"> -->
	
</head>
<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Gloock&display=swap" rel="stylesheet">
	<link rel="stylesheet" href="css/style.css">
	
<style>
    /* CSS Reset */
    body {
        font-family: 'Gloock', serif;
        color: #ffd2d2;
        margin: -25px;
        padding: 0px;
        background-image: url('Image/Do.jpg');
        background-size: 600px, 200px;
    }

    .left {
        display: inline-block;
        /* border: 2px solid red; */
        position: absolute;
        left: 60px;
        top: 20px;
    }

    .left img {
        width: 81px;
        filter: invert(100%);
    }

    .left div {
        line-height: 19px;
        font-size: 26px;
        text-align: center;
    }

    .mid {
        display: block;
        width: 48%;
        margin: -19px auto;
        /* border: 2px solid yellow; */
    }

    .right {
        position: absolute;
        right: 34px;
        top: 20px;
        display: inline-block;
        /*   border: 2px solid green;  */
    }

    .navbar {
        display: inline-block;
    }

    .navbar li {
        display: inline-block;
        font-size: 22px;
    }

    .navbar li a {
        display: inline-block;

        color: rgb(249, 247, 247);
        text-decoration: none;
        padding: 34px 23px;
    }

    .navbar li a:hover,
    .navbar li a.active {
        text-decoration: underline;
        color: grey;
    }

    .btn {
        margin: 2px 12px;
        background-color: rgb(1, 1, 1);
        color: white;
        padding: 3px 2px;
        border-radius: 13px;
        font-size: 20px;
        cursor: pointer;

    }
	
	.Gender{
		display: block;
        width: 508px;
        padding: 1px;
        border: 2px solid rgb(28 88 249);
        margin: 11px auto;
        font-size: 23px;
        border-radius: 8px;
	}
    .btn:hover {
        background-color: rgb(246, 237, 237);
    }

    .container {
        border: 2px solid rgb(30, 84, 245);
        margin: 74px;
        padding: 52px;
        width: 497px;
        border-radius: 29px;
    }

    .form-group input {
        text-align: center;
        display: block;
        width: 508px;
        padding: 1px;
        border: 2px solid rgb(28 88 249);
        margin: 11px auto;
        font-size: 25px;
        border-radius: 8px;
    }

    .container h1 {
        text-align: center;
        color: aliceblue;
    }

    .container button {
        display: block;
        width: 74%;
        margin: 20px auto;
    }
</style>
<body>
		<header class="header">

        <!-- left box for logo -->
        <div class="left">
            <img src="Image/dm.png" alt="">
            <div>Rishi Fitness</div>
        </div>

        <!-- Mid box for navbhar -->
        <div class="mid">
            <ul class="navbar">
                <li><a href="#" class="active">Home</a></li>
                <li><a href="#">About Us</a></li>
                <li><a href="#">Fitness Calculator</a></li>
                <li><a href="signup.jsp">Contact Us</a></li>
            </ul>
        </div>

        <!-- Right box for buttons -->
        <div class="right">
            <button class="btn"> Call Us Now </button>
            <button class="btn"> Email Us</button>
        </div>
    </header>
    <div class="container">
        <h1>Join the best gym of Delhi now</h1>
   <!--     <form action="noaction.php">			-->
		 <form action = "GymRegisterForm" method = "post">	
            <div class="form-group">
                <input type="text" name="user_name" placeholder="Enter your name">
            </div>
            <div class="form-group">
                <input type="text" name="user_age" placeholder="Enter you age">
            </div>
            <div class="form-group">
                <input type="text" name="user_weight" placeholder="Enter you weight">
            </div>
            <div class="form-group">
                <input type="text" name="user_locality" placeholder="Enter you Locality">
            </div>
            <div class="form-group">
                <input type="email" name="user_email" placeholder="Enter you Email Id ">
            </div>
            <div class="form-group">
                <input type="text" name="user_phoneN" placeholder="Enter you Phone Number">
            </div>
            <div class="Gender">
            	Male : <input type="radio" name="user_gender"> Female: <input type="radio" name="user_gender" value="Female">
            	Other: <input type="radio" name="user_gender"> 
       		</div>
       		<div>
       		<button class="btn">Submit</button>  
       		</div>
        </form>
    </div>
</body>
</html>