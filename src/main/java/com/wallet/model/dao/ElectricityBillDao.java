package com.wallet.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.wallet.connection.DbConnection;
import com.wallet.model.ElectricityPayment;

public class ElectricityBillDao {
	public void electricityBillUpdate(ElectricityPayment e) {
		try {
			
			Connection con=null;
			PreparedStatement ps=null;
			con=DbConnection.getConnect();
			String query="update customer_details set wallet_balance=wallet_balance-? where cust_id=?";
			ps=con.prepareStatement(query);
			ps.setInt(1, e.getAmount());
			ps.setInt(2,e.getId());
			ps.executeUpdate();
            
			
		}catch(Exception ep){
			ep.printStackTrace();
		}
	}
}
