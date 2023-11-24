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
	<%response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Expires", "0"); %>
	<div class="out-box">
        <div class="container">
            <div class="header">
                <div class="header-box-1">
                    <h2>
                        PayTm
                    </h2>
                </div>
                <div class="buttons">
                <%
                
                if(session.getAttribute("name")!=null){%>
                <div class="header-box-2">
                <a href="#" class="reg-submit">
            	<button style="font-size:0.9rem">Profile</button>
            	</a>
                </div>
            	<div class="header-box-2">
            	
                        <a href="LogOut" >
                        <button>
                                logOut

                            </button>
                        </a>
                        
                    </div>
            <%	
            }else{
            %>
                

                    <div class="header-box-2">
                        <a href="login.jsp">
                        <button>
                                login

                            </button>
                        </a>
                    </div>
                    <div class="header-box-3">
                        <a href="reg.jsp">
                        <button>

                                SignUp
                            </button>
                        </a>
                    </div>
                    <%} %>
                </div>
            </div>
            <div class="main-box back-1 ">
            <div class="user_details" style="text-align:center; font-size:1.5rem">
            <%if(session.getAttribute("name")!=null){%>
            	Welcome ${name}
            <%	
            }
            %>
            </div>
                <div class="sub-title">
                    <h1>
                        Wallet
                    </h1>
                    <hr>
                </div>
                <div class="operations">
                    <div class="small-box"><a href="Wallet_balance.jsp"><img src="images/wallet.png" alt=""> </a><p><a href="Wallet_balance.jsp" class="link-1">Wallet Balance</a></p></div>
                    <div class="small-box"><a href="addWallet.jsp"><img src="images/add.png" alt=""> </a><p><a href="addWallet.jsp" class="link-1">Add to Wallet</a></p></div>
                    <div class="small-box"><a href="#"><img src="images/history.png" alt=""> </a><p><a href="#" class="link-1">Transaction History</a></p></div>
                    <div class="small-box"><a href="send_money.jsp"><img src="images/send.png" alt=""> </a><p><a href="send_money.jsp" class="link-1">Send Money</a></p></div>
                </div>
                
            </div>
            <div class="main-box">
                <div class="sub-title">
                    <h1>
                        Payments
                    </h1>
                    <hr>
                </div>
                <div class="operations">
                    <div class="small-box"><a href="electricityPayment.jsp"><img src="images/electricity.png" alt=""></a> <p><a href="electricityPayment.jsp" class="link-1">Electricity<br>Payment</a></p></div>
                    <div class="small-box"><a href="mobile_recharge.jsp"><img src="images/recharge.png" alt=""></a> <p><a href="mobile_recharge.jsp" class="link-1">Mobile<br>Recharge</a></p></div>
                    <div class="small-box"><a href="DTHPayment.jsp"><img src="images/DTH.png" alt=""></a> <p><a href="DTHPayment.jsp" class="link-1">DTH</a></p></div>
                    <div class="small-box"><img src="images/gas.png" alt=""> <p><a href="#" class="link-1">Gas<br>Booking</a></p></div>
                </div>
            </div>
            <div class="main-box">
                <div class="sub-title">
                    <h1>
                        Bank
                    </h1>
                    <hr>
                </div>
                <div class="operations">
                    <div class="small-box"><img src="images/add_bank.png" alt=""> <p><a href="#" class="link-1">Add A/C</a></p></div>
                    <div class="small-box"><img src="images/check_balance.png" alt=""> <p><a href="#" class="link-1">Balance</a></p></div>
                    <div class="small-box"><img src="images/view.png" alt=""> <p><a href="#" class="link-1">Active A/C</a></p></div>
                    <div class="small-box"><img src="images/remove.png" alt=""> <p><a href="#" class="link-1">Remove A/C</a></p></div>
                </div>
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