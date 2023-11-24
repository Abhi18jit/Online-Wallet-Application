package com.wallet.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wallet.model.DTHPayment;
import com.wallet.model.dao.DTHBillDao;
import com.wallet.model.dao.TransactionUpdateDao;


@WebServlet("/DTHRecharge")
public class DTHRechargeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int customer_id=Integer.parseInt(request.getParameter("customer_id"));
		String board=request.getParameter("board");
		String state=request.getParameter("state");
		int amount =Integer.parseInt(request.getParameter("amount"));
		HttpSession session=request.getSession();
		String i=""+session.getAttribute("id");
		int id=Integer.parseInt(i);
		
		DTHPayment dp=new DTHPayment();
		dp.setAmount(amount);
		dp.setBoard(board);
		dp.setCustomer_id(customer_id);
		dp.setId(id);
		dp.setState(state);
		DTHBillDao dbd=new DTHBillDao();
		dbd.DTHBillUpdate(dp);
		TransactionUpdateDao tud=new TransactionUpdateDao();
		tud.updateTransaction(dp);
		response.sendRedirect("Wallet_balance.jsp");
	}
}
