<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="CSS/style.css">
</head>
<body>
	<div class="out-box">
        <div class="container">
            <div class="header">
                <div class="header-box-1">
                    <h2>
                        PayTm
                    </h2>
                </div>
                <div class="buttons">

                    <div class="header-box-2">
                        <a href="reg.jsp">
                        <button>

                                SignUp
                            </button>
                        </a>
                    </div>
                    <div class="header-box-3">
                        <a href="home.jsp">
                        <button>

                                Home
                            </button>
                        </a>
                    </div>
                </div>
            </div>
            <div class="main-box login-main" >
                <fieldset class="form-box">
                    <legend class="head-1">Log-In</legend>
                    <form action="Login" class="reg-form log-form" method="post">
                        <input type="email" name="email" class="login-input" placeholder="Enter Your E-mail">
                        <input type="password" name="pass" class="login-input" placeholder="Enter Password">
                        <h4 style="text-align: center;">Not a User? <a href="reg.jsp" class="link"> SignUp </a>here</h4>
                        <input type="submit" id="reg-submit" value="Log In" class="login-input login-submit">
                    </form>
                </fieldset>
            </div>

            <div class="bottom-box">
                <div class="left">
                    <ul>

                        <li>Home</li>
                        <li>About</li>

                        <li>Contact</li>
                        <li>Help</li>

                    </ul>


                </div>
                <div class="right">
                    <img src="https://img.freepik.com/premium-vector/secure-payment-with-mobile-banking-application_258153-435.jpg"
                        alt="">
                </div>
            </div>

        </div>

    </div>
</body>
</html>