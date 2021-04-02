package com.jbk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jbk.configuration.MyConfiguration;

public class LoginDao {

	public boolean loginCheck(String username, String password) throws Exception {

		System.out.println("In DAO :" + username + " " + password);

		Connection conn = MyConfiguration.getConnection();
		PreparedStatement pstmt = conn.prepareStatement("SELECT username,password FROM blood_bank WHERE username=? AND password=?");
		pstmt.setString(1, username);
		pstmt.setString(2, password);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			return true;
		} else {
			return false;
		}
	}

}
