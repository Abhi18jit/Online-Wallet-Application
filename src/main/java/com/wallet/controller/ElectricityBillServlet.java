package com.wallet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wallet.model.ElectricityPayment;
import com.wallet.model.dao.ElectricityBillDao;
import com.wallet.model.dao.TransactionUpdateDao;


@WebServlet("/ElectricityBill")
public class ElectricityBillServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int consumer_id=Integer.parseInt(request.getParameter("cons_id"));
		String board=request.getParameter("board");
		String state=request.getParameter("state");
		int amount =Integer.parseInt(request.getParameter("amount"));
		HttpSession session=request.getSession();
		String i=""+session.getAttribute("id");
		int id=Integer.parseInt(i);
		
		ElectricityPayment ep=new ElectricityPayment();
		ep.setBoard(board);
		ep.setConsumer_id(consumer_id);
		ep.setState(state);
		ep.setAmount(amount);
		ep.setId(id);
		
		ElectricityBillDao ebo=new ElectricityBillDao();
		ebo.electricityBillUpdate(ep);
		
		TransactionUpdateDao tud=new TransactionUpdateDao();
		tud.updateTransaction(ep);
		response.sendRedirect("Wallet_balance.jsp");
		
		
	}

}
