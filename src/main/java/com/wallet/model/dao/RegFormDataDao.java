package com.wallet.model.dao;
import com.wallet.connection.DbConnection;
import com.wallet.model.RegFormData;


import java.sql.*;

public class RegFormDataDao {
	public void insertRegData(RegFormData r) {
		try {
			Connection con=null;
			PreparedStatement ps=null;
			con=DbConnection.getConnect();
			ps=con.prepareStatement("insert into customer_details(cust_name, age, phone, email, account_no, bank_name, bank_balance, password,wallet_balance) values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, r.getCust_name());
            ps.setInt(2, r.getAge());
            ps.setString(3, r.getPhone());
            ps.setString(4, r.getEmail());
            ps.setInt(5, r.getAccount_no());
            ps.setString(6, r.getBank_name());
            ps.setInt(7, r.getBank_balance());
            ps.setString(8, r.getPassword());
            ps.setInt(9, 0);
            ps.executeUpdate();
            
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
