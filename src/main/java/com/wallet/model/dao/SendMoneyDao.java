package com.wallet.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.wallet.connection.DbConnection;
import com.wallet.model.SendMoney;

public class SendMoneyDao {
	public void sendMoneyUpdate(SendMoney s) {
		try {
			
			Connection con=null;
			PreparedStatement ps=null;
			con=DbConnection.getConnect();
			String query="update customer_details set wallet_balance=wallet_balance-? where cust_id=?";
			ps=con.prepareStatement(query);
			ps.setInt(1, s.getAmount());
			ps.setInt(2,s.getId());
			ps.executeUpdate();
            
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
