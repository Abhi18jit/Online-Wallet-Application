package com.wallet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wallet.model.ElectricityConsumer;
import com.wallet.model.dao.AmountFetchDao;


@WebServlet("/SearchElectricity")
public class SearchElectricityUserServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int consumer_id=Integer.parseInt(request.getParameter("cons_id"));
		String board=request.getParameter("board");
		String state=request.getParameter("state");
		
		ElectricityConsumer ec=new ElectricityConsumer();
		ec.setBoard(board);
		ec.setConsumer_id(consumer_id);
		ec.setState(state);
		
		AmountFetchDao eco=new AmountFetchDao();
		int amt=eco.getAmount(ec.getConsumer_id());
		request.setAttribute("ec", ec);
		request.setAttribute("amt",amt);
		RequestDispatcher rd=request.getRequestDispatcher("elect_amt_page.jsp");
		rd.forward(request, response);
	}

}
