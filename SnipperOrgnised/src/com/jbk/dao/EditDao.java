package com.jbk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.jbk.configuration.MyConfiguration;
import com.jbk.entity.BloodInfo;

public class EditDao {

	public ArrayList<BloodInfo> datapass(int id) throws Exception {

		System.out.println("In Edit Dao");
		Connection con = MyConfiguration.getConnection();
		PreparedStatement pstmt = con.prepareStatement("SELECT * FROM blood_bank WHERE id=?");
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		BloodInfo edit = new BloodInfo();
		ArrayList<BloodInfo> al = new ArrayList<>();
		while (rs.next()) {
			int user_id = rs.getInt(1);
			String username = rs.getString("username");
			String Blood_Group = rs.getString("Blood_Group");
			String Weight = rs.getString("Weight");
			String Contact_Number = rs.getString("Contact_Number");
			String Location = rs.getString("Location");
			String password = rs.getString("password");

			edit = new BloodInfo(id, username, Blood_Group, Weight, Contact_Number, Location, password);
			al.add(edit);

		}
		return al;

	}
}