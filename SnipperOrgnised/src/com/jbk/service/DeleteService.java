package com.jbk.service;

import java.util.ArrayList;

import com.jbk.dao.DeleteDao;
import com.jbk.entity.BloodInfo;

public class DeleteService {

	public ArrayList<BloodInfo> deleteuser(int id) throws Exception {

		DeleteDao d = new DeleteDao();
		ArrayList<BloodInfo> al = d.deleteuser(id);
		return al;
	}

}
