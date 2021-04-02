package com.jbk.service;

import java.util.ArrayList;

import com.jbk.dao.EditDao;
import com.jbk.entity.BloodInfo;

public class EditService {

	public ArrayList<BloodInfo> datapass(int id) throws Exception {

		EditDao ed = new EditDao();
		ArrayList<BloodInfo> al = ed.datapass(id);
		
		return al;
	}

}
