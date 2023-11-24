package com.wallet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wallet.connection.DbConnection;
import java.sql.*;


@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("email");
		String pass=request.getParameter("pass");
		System.out.println(uname+pass);
		Connection con=DbConnection.getConnect();
		try {
			PreparedStatement ps=con.prepareStatement("select * from customer_details where email=? && password=?");
			ps.setString(1, uname);
			ps.setString(2, pass);
			ResultSet rs=ps.executeQuery();
			if(!rs.next()) {
				out.println("<html><script> alert(Invalid Username or password)</script></html>");
				response.sendRedirect("login.jsp");
				
			}else {
				HttpSession session=request.getSession();
				System.out.print(rs.getString("cust_name"));
				session.setAttribute("name", rs.getString("cust_name"));
				session.setAttribute("id", rs.getString("cust_id"));
				response.sendRedirect("home.jsp");
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
