package com.wallet.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wallet.model.RegFormData;
import com.wallet.model.dao.RegFormDataDao;


@WebServlet("/RegForm")
public class RegFormServlet extends HttpServlet {
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String cust_name=request.getParameter("cust_name");
		int age=Integer.parseInt(request.getParameter("age"));
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		int account_no=Integer.parseInt(request.getParameter("account_no"));
		String bank_name=request.getParameter("bank_name");
		int bank_balance=Integer.parseInt(request.getParameter("bank_balance"));
		String password=request.getParameter("password");
		
		RegFormData r=new RegFormData();
		r.setCust_name(cust_name);
		r.setAge(age);
		r.setPhone(phone);
		r.setEmail(email);
		r.setAccount_no(account_no);
		r.setAccount_no(account_no);
		r.setBank_name(bank_name);
		r.setBank_balance(bank_balance);
		r.setPassword(password);
		
		RegFormDataDao rDao=new RegFormDataDao();
		rDao.insertRegData(r);
		response.sendRedirect("login.jsp");
	}

}
