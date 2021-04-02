package com.jbk.configuration;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConfiguration {

	private static Connection con = null;

	public static Connection getConnection() throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bb_information", "root", "root");
		return con;

	}
}
