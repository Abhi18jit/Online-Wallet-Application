<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*" %>
    <%@page import="com.wallet.connection.DbConnection" %>
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
            <div class="main-box login-main" >
            <%

            ResultSet rs;
			Connection con=DbConnection.getConnect();
			String query = "select cust_name,email,wallet_balance from customer_details where cust_id="+(session.getAttribute("id"))+"";
            Statement st = con.createStatement();

            rs = st.executeQuery(query);

            while (rs.next()) {
            %>
            <h1 style="font-size:1.2 rem;">Wallet Balance</h1>
            <div class="s-box">
            	<p class="b-details"> Name:<%=rs.getString("cust_name") %>	</p>
            	<p class="b-details"> E-mail:<%=rs.getString("email") %> </p>
            	<p class="b-details"> Balance:<%=rs.getString("wallet_balance") %> </p>
            	
            	<%} %>
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
                    <img src="https://img.freepik.com/premium-vector/secure-payment-with-mobile-banking-application_258153-435.jpg"
                        alt="">
                </div>
            </div>

            

        </div>

    </div>
</body>
</html>
