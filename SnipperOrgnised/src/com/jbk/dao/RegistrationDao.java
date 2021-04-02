package com.jbk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.jbk.configuration.MyConfiguration;

public class RegistrationDao {

	public boolean datasend(String un, String bg, String wgt, String cn, String loc, String pass) throws Exception {

		Connection con = MyConfiguration.getConnection();
		PreparedStatement pstmt = con.prepareStatement("INSERT INTO blood_bank VALUES(NULL,?,?,?,?,?,?)");
//		pstmt.setInt(1, 3);
		pstmt.setString(1, un);
		pstmt.setString(2, bg);
		pstmt.setString(3, wgt);
		pstmt.setString(4, cn);
		pstmt.setString(5, loc);
		pstmt.setString(6, pass);

		int i = pstmt.executeUpdate();
		if (i != 0) {

			return true;
		} else {
			return false;
		}
	}

}
