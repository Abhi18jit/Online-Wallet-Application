package com.wallet.connection;

import java.sql.*;

import com.mysql.cj.jdbc.MysqlDataSource;



public class DbConnection {
	static Connection con;
	public static Connection getConnect() {
		String jdbc_url="jdbc:mysql://localhost:3306/wallet";
		String username="root";
		String pass="abhi123";
		
		try{
			MysqlDataSource ds=new MysqlDataSource();
			ds.setURL(jdbc_url);
	        ds.setUser(username);
	        ds.setPassword(pass);
	        
	        con=ds.getConnection();
			
		}
		
		catch(Exception e)
        {
            e.printStackTrace();
        }
		return con;
	}
}
