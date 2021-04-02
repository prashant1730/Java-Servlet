package com.jbk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.jbk.configuration.MyConfiguration;
import com.jbk.entity.BloodInfo;

public class ShowListDao {

	public ArrayList<BloodInfo> ShowAllList() throws Exception {

		Connection con = MyConfiguration.getConnection();
		PreparedStatement pstmt = con.prepareStatement("SELECT * FROM blood_bank");
		ResultSet rs = pstmt.executeQuery();
		ArrayList<BloodInfo> al = new ArrayList<>();
		BloodInfo List = null;
		while (rs.next()) {
			int id = rs.getInt(1);
			String username = rs.getString("username");
			String Blood_Group = rs.getString("Blood_Group");
			String Weight = rs.getString("Weight");
			String Contact_Number = rs.getString("Contact_Number");
			String Location = rs.getString("Location");
			String password = rs.getString("password");

			List = new BloodInfo(id, username, Blood_Group, Weight, Contact_Number, Location, password);
			al.add(List);
		}

		return al;
	}

}
