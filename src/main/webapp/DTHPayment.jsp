<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
                    DTH Recharge
                </h2>
                <hr style="width:75%; margin-left:1.4rem;">
                <form action="SearchDthUser" class="reg-form" method="post">
                    
                    
                    
                    <label for="operator">Operator Name :</label>
                    <select id="operator" name="operator" style="height:1.4rem">
                    	<option value="Tata Play"> Tata Play</option>
                    	<option value="Airtel Digital TV">Airtel Digital TV</option>
                    	<option value="Dish TV">Dish TV</option>
                    	<option value="d2h Videocon"> d2h Videocon</option>
                    
                    </select>
                    <label for="state">State :</label>
                    <select id="state" name="state" style="height:1.4rem">
                    	<option value="West Bengal"> West Bengal</option>
                    	<option value="Bihar"> Bihar</option>
                    	<option value="Madhya Pradesh">Madhya Pradesh</option>
                    	<option value="Uttar Pradesh">Uttar Pradesh</option>
                    
                    </select>
                    
                    <label for="customer_id">Customer Id :</label>
                    <input type="number" name="customer_id" id="customer_id" placeholder="Enter Customer Id">
                    
                    
                    <input type="submit" id="reg-submit" value="Search">
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