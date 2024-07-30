package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	private static Connection connection;
	public static Connection getConnction() {
			try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital-management-system","root","Rishi@9838");
			} catch (Exception e) {
				e.printStackTrace();
			}
		return connection;
	}

}