package com.jbk.service;

import java.util.ArrayList;

import com.jbk.dao.UpdateDao;
import com.jbk.entity.BloodInfo;

public class UpdateService {

	public ArrayList<BloodInfo> updatepass(int id, String un, String bg, String wgt, String cn, String loc, String pass)
			throws Exception {

		UpdateDao ud = new UpdateDao();
		ArrayList<BloodInfo> res = ud.updatepass(id, un, bg, wgt, cn, loc, pass);
		return res;
	}

}
