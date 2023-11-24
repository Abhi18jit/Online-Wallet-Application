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
	String n=request.getParameter("operator");
	session.setAttribute("operator", n);
	
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
                    <%=n%> Plans
                </h2>
                <hr style="width:75%; margin-left:1.4rem;">
                <form action="MobileRecharge" class="reg-form" method="post">
                    
                    <table>
                    	<tr>
                    		<th style="text-align:left;">Benefits</th>
                    		<th style="text-align:left;">Amount</th>
                    			
                    		
                    	
                    	</tr>
                    	<tr>
                    		<td>Unlimited Calls + 1.5Gb/day Data, 30days</td>
                    		<td>299  <input style="height:auto;" type="radio" name="plans" value="299"></td>
                    			
                    		
                    	
                    	</tr>
                    	<tr>
                    		<td>Unlimited Calls + 1.5Gb/day Data, 60days</td>
                    		<td>449  <input style="height:auto;" type="radio" name="plans" value="449"></td>
                    			
                    		
                    	
                    	</tr>
                    	<tr>
                    		<td>Unlimited Calls + 1.5Gb/day Data, 90days</td>
                    		<td>699  <input style="height:auto;" type="radio" name="plans" value="699"></td>
                    			
                    		
                    	
                    	</tr>
                    	<tr>
                    		<td>Unlimited Calls + 2Gb Data, 30days</td>
                    		<td>149  <input style="height:auto;" type="radio" name="plans" value="149"></td>
                    			
                    		
                    	
                    	</tr>
                    	<tr>
                    		<td>Unlimited Calls + 1Gb/day Data, 30days</td>
                    		<td>179  <input style="height:auto;" type="radio" name="plans" value="179"></td>
                    			
                    		
                    	
                    	</tr>
                    	<tr>
                    		<td>50Gb data, No Voice Calls 30days</td>
                    		<td>279  <input style="height:auto;" type="radio" name="plans" value="2799"></td>
                    			
                    		
                    	
                    	</tr>
                    	<tr>
                    		<td>Unlimited Calls + 1Gb/day Data, 60days</td>
                    		<td>439  <input style="height:auto;" type="radio" name="plans" value="439"></td>
                    			
                    		
                    	
                    	</tr>
                    
                    
                    </table>
                    
                    
                    
                    

                    
                    
                    <input type="submit" id="reg-submit" value="Recharge">
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