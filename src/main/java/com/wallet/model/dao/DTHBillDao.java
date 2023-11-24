package com.wallet.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.wallet.connection.DbConnection;
import com.wallet.model.DTHPayment;

public class DTHBillDao {
	public void DTHBillUpdate(DTHPayment dp) {
		try {
			
			Connection con=null;
			PreparedStatement ps=null;
			con=DbConnection.getConnect();
			String query="update customer_details set wallet_balance=wallet_balance-? where cust_id=?";
			ps=con.prepareStatement(query);
			ps.setInt(1, dp.getAmount());
			ps.setInt(2,dp.getId());
			ps.executeUpdate();
            
			
		}catch(Exception ep){
			ep.printStackTrace();
		}
	}
}
