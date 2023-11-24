package com.wallet.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wallet.model.SendMoney;
import com.wallet.model.dao.SendMoneyDao;
import com.wallet.model.dao.TransactionUpdateDao;


@WebServlet("/SendMoney")
public class SendMoneyServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int amount=Integer.parseInt(request.getParameter("amount"));
		int account_no=Integer.parseInt(request.getParameter("b_account_no"));
		String bank_name=request.getParameter("b_bank_name");
		HttpSession session=request.getSession();
		String i=""+session.getAttribute("id");
		int id=Integer.parseInt(i);
		
		SendMoney s=new SendMoney();
		s.setAccount_no(account_no);
		s.setAmount(amount);
		s.setBank_name(bank_name);
		s.setId(id);
		
		SendMoneyDao smd=new SendMoneyDao();
		smd.sendMoneyUpdate(s);
		TransactionUpdateDao tud=new TransactionUpdateDao();
		tud.updateTransaction(s);
		response.sendRedirect("Wallet_balance.jsp");
		
	}

}
