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
                        <a href="login.jsp">
                        <button>

                                login
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
            <div class="main-box">
                <h2 class="head-1">
                    Sign-Up
                </h2>
                <hr>
                <form action="RegForm" class="reg-form" method="post">
                    <label for="name">Name :</label>
                    <input type="text" name="cust_name" id="name" placeholder="Enter your Name">
                    <label for="age">Age :</label>
                    <input type="number" name="age" id="age" placeholder="Enter your Age">
                    <label for="phone">Phone Number :</label>
                    <input type="number" name="phone" id="phone" placeholder="Enter your Phone Number">
                    <label for="email">E-Mail :</label>
                    <input type="email" name="email" id="email" placeholder="Enter your E-Mail">
                    <label for="bank_acc">Account Number :</label>
                    <input type="number" name="account_no" id="bank_acc" placeholder="Enter your Account No">
                    <label for="bank_name">Name of Bank :</label>
                    <input type="text" name="bank_name" id="bank_name" placeholder="Enter your Bank Name">
                    <label for="opening_balance">Opening Balance :</label>
                    <input type="number" name="bank_balance" id="opening_balance" placeholder="Enter Bank Balance">
                    <label for="pass">Create a Password :</label>
                    <input type="password" name="password" id="pass" placeholder="Password">
                    <input type="submit" id="reg-submit" value="Sign Up">
                </form>
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
                    <img src="https://img.freepik.com/premium-vector/secure-payment-with-mobile-banking-application_258153-435.jpg" alt="">
                </div>
            </div>
            
        </div>

    </div>
</body>
</html>