package com.wallet.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wallet.model.AddWallet;
import com.wallet.model.dao.AddWalletDao;
import com.wallet.model.dao.TransactionUpdateDao;

 
@WebServlet("/AddWallet")
public class AddWalletSevlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int account_no=Integer.parseInt(request.getParameter("account_no"));
		String bank_name=request.getParameter("bank_name");
		int amount=Integer.parseInt(request.getParameter("amount"));
		HttpSession session=request.getSession();
		String i=""+session.getAttribute("id");
		int id=Integer.parseInt(i);
		
		AddWallet add=new AddWallet();
		add.setAccount_no(account_no);
		add.setAmount(amount);
		add.setBank_name(bank_name);
		add.setId(id);
		AddWalletDao awd=new AddWalletDao();
		awd.updateWallet(add);
		TransactionUpdateDao tud=new TransactionUpdateDao();
		tud.updateTransaction(add);
		response.sendRedirect("Wallet_balance.jsp");
		
	}
}
