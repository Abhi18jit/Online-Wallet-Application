package com.wallet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wallet.model.DTHCustomer;
import com.wallet.model.dao.AmountFetchDao;


@WebServlet("/SearchDthUser")
public class SearchDthUserServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int customer_id=Integer.parseInt(request.getParameter("customer_id"));
		String operator=request.getParameter("operator");
		String state=request.getParameter("state");
		
		DTHCustomer dc=new DTHCustomer();
		dc.setBoard(state);
		dc.setCustomer_id(customer_id);
		dc.setState(state);
		AmountFetchDao eco=new AmountFetchDao();
		int amt=eco.getAmount(dc.getCustomer_id());
		request.setAttribute("dc", dc);
		request.setAttribute("amt",amt);
		RequestDispatcher rd=request.getRequestDispatcher("dth_amt_page.jsp");
		rd.forward(request, response);
		
	}

}
