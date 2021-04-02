package com.jbk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.jbk.configuration.MyConfiguration;
import com.jbk.entity.BloodInfo;

public class UpdateDao {
	public ArrayList<BloodInfo> updatepass(int id, String un, String bg, String wgt, String cn, String loc, String pass)
			throws Exception {
		// TODO Auto-generated method stub
		Connection con = MyConfiguration.getConnection();
		PreparedStatement pstmt = con.prepareStatement(
				"UPDATE blood_bank SET username=?,Blood_Group=?,Weight=?,Contact_Number=?,Location=?,password=? WHERE id=?");
		pstmt.setString(1, un);
		pstmt.setString(2, bg);
		pstmt.setString(3, wgt);
		pstmt.setString(4, cn);
		pstmt.setString(5, loc);
		pstmt.setString(6, pass);
		pstmt.setInt(7, id);
		int ii = pstmt.executeUpdate();
		ArrayList<BloodInfo> al = new ArrayList<>();
		if (ii > 0) {
			PreparedStatement ps = con.prepareStatement("SELECT * FROM blood_bank");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int user_id = rs.getInt(1);
				String username = rs.getString("username");
				String Blood_Group = rs.getString("Blood_Group");
				String Weight = rs.getString("Weight");
				String Contact_Number = rs.getString("Contact_Number");
				String Location = rs.getString("Location");
				String password = rs.getString("password");

				BloodInfo bi = new BloodInfo(user_id, username, Blood_Group, Weight, Contact_Number, Location,
						password);
				al.add(bi);
			}

		}
		return al;

	}
}
