<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.wallet.model.ElectricityConsumer" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="CSS/style.css">
<link rel="stylesheet" href="CSS/style2.css">
</head>
<body>
	<%
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Expires", "0");
	if(session.getAttribute("name")==null){
		response.sendRedirect("login.jsp");
	}
	ElectricityConsumer ec=new ElectricityConsumer();
	ec=(ElectricityConsumer)request.getAttribute("ec");
	
	%>
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
                        <a href="LogOut">
                        <button>

                                LogOut
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
                    Electricity Payment
                </h2>
                <hr style="width:75%; margin-left:1.4rem;">
                <form action="ElectricityBill" class="reg-form" method="post">
                    
                    <label for="e_board">Electricity Board Name :</label>
                    <input type="text" name="e_board" id="e_board" value="<%=ec.getBoard() %>" readonly="readonly">
                    <label for="state">State :</label>
                    <input type="text" name="state" id="state" value="<%=ec.getState() %>" readonly="readonly">
                    <label for="consumer_id">Consumer Id :</label>
                    <input type="number" name="cons_id" id="consumer_id" value="<%=ec.getConsumer_id()%>" readonly="readonly">
                    
                    
                    
                    <label for="amount">Amount:</label>
                    <input type="number" name="amount" id="amount" value="<%=(int)request.getAttribute("amt") %>">
                    
                    
                    <input type="submit" id="reg-submit" value="Pay">
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