package com.wallet.model.dao;

import com.wallet.connection.DbConnection;
import com.wallet.model.AddWallet;
import java.sql.*;

public class AddWalletDao {
	public void updateWallet(AddWallet add) {
		try {
			
			Connection con=null;
			PreparedStatement ps=null;
			con=DbConnection.getConnect();
			String query="update customer_details set wallet_balance=wallet_balance+?,bank_balance=bank_balance-? where cust_id=?";
			ps=con.prepareStatement(query);
			ps.setInt(1, add.getAmount());
			ps.setInt(2, add.getAmount());
			ps.setInt(3,add.getId());
			ps.executeUpdate();
            
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
