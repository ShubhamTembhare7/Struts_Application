package com.yash.connectionmaster;
import java.sql.*;

public class ConnectionMaster {
public static Connection getConnection() {
	
	Connection conn=null;
	try {
		
		String url="jdbc:mysql://localhost:3306/smaster";
		String userName="root";
		String password="yash@123";
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection(url,userName,password);
	}catch(Exception ex) {
		
		System.out.println(ex.getMessage());
	}
	return conn;
}
}
