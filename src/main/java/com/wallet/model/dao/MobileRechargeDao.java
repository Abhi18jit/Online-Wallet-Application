package com.wallet.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.wallet.connection.DbConnection;
import com.wallet.model.MobileRecharge;

public class MobileRechargeDao {
	public void MobileRechargeUpdate(MobileRecharge mr) {
		try {
			
			Connection con=null;
			PreparedStatement ps=null;
			con=DbConnection.getConnect();
			String query="update customer_details set wallet_balance=wallet_balance-? where cust_id=?";
			ps=con.prepareStatement(query);
			ps.setInt(1, mr.getAmount());
			ps.setInt(2,mr.getId());
			ps.executeUpdate();
            
			
		}catch(Exception ep){
			ep.printStackTrace();
		}
	}
}
