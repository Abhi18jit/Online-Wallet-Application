package com.wallet.model.dao;

import java.sql.*;

import com.wallet.connection.DbConnection;

public class AmountFetchDao {
	public int getAmount(int id) {
		Connection con=DbConnection.getConnect();
		try {
			PreparedStatement ps=con.prepareStatement("select amount from consumer_id_table where id=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				return Integer.parseInt(rs.getString("amount"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
		
	}
}
