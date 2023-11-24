package com.wallet.model.dao;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;

import com.wallet.connection.DbConnection;
import com.wallet.model.AddWallet;
import com.wallet.model.DTHPayment;
import com.wallet.model.ElectricityPayment;
import com.wallet.model.MobileRecharge;
import com.wallet.model.SendMoney;

public class TransactionUpdateDao {
	
	public void updateTransaction(AddWallet add) {
		try {
			
			Connection con=null;
			PreparedStatement ps=null;
			con=DbConnection.getConnect();
			int balance=getBalance(add.getId());
			String s="Added Money to Wallet";
			LocalDate d=java.time.LocalDate.now();
			LocalTime t=java.time.LocalTime.now();
			String query="insert into transactions(cust_id,transaction_details,transaction_amount,t_date,t_time,balance)values(?,?,?,?,?,?);";
			ps=con.prepareStatement(query);
			ps.setInt(1, add.getId());
			ps.setString(2, s);
			ps.setInt(3,add.getAmount());
			ps.setDate(4, java.sql.Date.valueOf(d));
			ps.setTime(5, java.sql.Time.valueOf(t));
			ps.setInt(6, balance);
			ps.executeUpdate();
            
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void updateTransaction(SendMoney s) {
		try {
			
			Connection con=null;
			PreparedStatement ps=null;
			con=DbConnection.getConnect();
			int balance=getBalance(s.getId());
			String st="Send Money From Wallet";
			LocalDate d=java.time.LocalDate.now();
			LocalTime t=java.time.LocalTime.now();
			String query="insert into transactions(cust_id,transaction_details,transaction_amount,t_date,t_time,balance)values(?,?,?,?,?,?);";
			ps=con.prepareStatement(query);
			ps.setInt(1, s.getId());
			ps.setString(2, st);
			ps.setInt(3,s.getAmount());
			ps.setDate(4, java.sql.Date.valueOf(d));
			ps.setTime(5, java.sql.Time.valueOf(t));
			ps.setInt(6, balance);
			ps.executeUpdate();
            
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void updateTransaction(ElectricityPayment ep) {
		try {
			
			Connection con=null;
			PreparedStatement ps=null;
			con=DbConnection.getConnect();
			int balance=getBalance(ep.getId());
			String st="Electricity Bill Payment";
			LocalDate d=java.time.LocalDate.now();
			LocalTime t=java.time.LocalTime.now();
			String query="insert into transactions(cust_id,transaction_details,transaction_amount,t_date,t_time,balance)values(?,?,?,?,?,?);";
			ps=con.prepareStatement(query);
			ps.setInt(1, ep.getId());
			ps.setString(2, st);
			ps.setInt(3,ep.getAmount());
			ps.setDate(4, java.sql.Date.valueOf(d));
			ps.setTime(5, java.sql.Time.valueOf(t));
			ps.setInt(6, balance);
			ps.executeUpdate();
            
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void updateTransaction(DTHPayment ep) {
		try {
			
			Connection con=null;
			PreparedStatement ps=null;
			con=DbConnection.getConnect();
			int balance=getBalance(ep.getId());
			String st="DTH Paymnet";
			LocalDate d=java.time.LocalDate.now();
			LocalTime t=java.time.LocalTime.now();
			String query="insert into transactions(cust_id,transaction_details,transaction_amount,t_date,t_time,balance)values(?,?,?,?,?,?);";
			ps=con.prepareStatement(query);
			ps.setInt(1, ep.getId());
			ps.setString(2, st);
			ps.setInt(3,ep.getAmount());
			ps.setDate(4, java.sql.Date.valueOf(d));
			ps.setTime(5, java.sql.Time.valueOf(t));
			ps.setInt(6, balance);
			ps.executeUpdate();
            
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public int getBalance(int id) {
		Connection con=null;
		PreparedStatement ps=null;
		con=DbConnection.getConnect();
		String query="select wallet_balance from customer_details where cust_id=?";
		
			try {
				ps=con.prepareStatement(query);
				ps.setInt(1, id);
				ResultSet rs=ps.executeQuery();
				if(rs.next()) {
					return Integer.parseInt(rs.getString("wallet_balance"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return 0;
			
			
		
		
		
	}
	public void updateTransaction(MobileRecharge mr) {
		try {
			
			Connection con=null;
			PreparedStatement ps=null;
			con=DbConnection.getConnect();
			int balance=getBalance(mr.getId());
			String s="Mobile Recharge";
			LocalDate d=java.time.LocalDate.now();
			LocalTime t=java.time.LocalTime.now();
			String query="insert into transactions(cust_id,transaction_details,transaction_amount,t_date,t_time,balance)values(?,?,?,?,?,?);";
			ps=con.prepareStatement(query);
			ps.setInt(1, mr.getId());
			ps.setString(2, s+" "+mr.getOperator());
			ps.setInt(3,mr.getAmount());
			ps.setDate(4, java.sql.Date.valueOf(d));
			ps.setTime(5, java.sql.Time.valueOf(t));
			ps.setInt(6, balance);
			ps.executeUpdate();
            
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
