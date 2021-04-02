package com.jbk.service;

import java.util.ArrayList;

import com.jbk.dao.ShowListDao;
import com.jbk.entity.BloodInfo;

public class ShowListService {

	public ArrayList<BloodInfo> ShowAllList() throws Exception {
		// TODO Auto-generated method stub
		ShowListDao sld = new ShowListDao(); 
	ArrayList<BloodInfo> al = sld.ShowAllList();
		return al;
	}

	
}
