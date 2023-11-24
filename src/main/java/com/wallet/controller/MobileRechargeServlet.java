package com.wallet.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wallet.model.MobileRecharge;
import com.wallet.model.dao.MobileRechargeDao;
import com.wallet.model.dao.TransactionUpdateDao;


@WebServlet("/MobileRecharge")
public class MobileRechargeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int amount=Integer.parseInt(request.getParameter("plans"));
		HttpSession session=request.getSession();
		String operator=""+session.getAttribute("operator");
		int id=Integer.parseInt(""+session.getAttribute("id"));
		MobileRecharge mr=new MobileRecharge();
		mr.setAmount(amount);
		mr.setOperator(operator);
		mr.setId(id);
		MobileRechargeDao mrd=new MobileRechargeDao();
		mrd.MobileRechargeUpdate(mr);
		TransactionUpdateDao tdo=new TransactionUpdateDao(); 
		tdo.updateTransaction(mr);
		response.sendRedirect("Wallet_balance.jsp");
		
		
	}

}
