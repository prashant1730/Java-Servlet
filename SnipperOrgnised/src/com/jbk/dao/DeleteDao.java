package com.jbk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.jbk.configuration.MyConfiguration;
import com.jbk.entity.BloodInfo;

public class DeleteDao {

	public ArrayList<BloodInfo> deleteuser(int id) throws Exception {

		System.out.println("In Delete DAO :" + id);
		Connection con = MyConfiguration.getConnection();
		PreparedStatement pstmt = con.prepareStatement("DELETE FROM blood_bank WHERE id=?");
		pstmt.setInt(1, id);
		int ii = pstmt.executeUpdate();
		System.out.println("Record Ddelete Succesfully :" + ii);

		ArrayList<BloodInfo> al = new ArrayList<>();

		BloodInfo bi = null;
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

			bi = new BloodInfo(user_id, username, Blood_Group, Weight, Contact_Number, Location, password);
			al.add(bi);
		}
		return al;
	}

}
