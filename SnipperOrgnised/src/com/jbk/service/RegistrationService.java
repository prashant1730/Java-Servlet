package com.jbk.service;

import com.jbk.dao.RegistrationDao;

public class RegistrationService {

	public boolean datapass(String un, String bg, String wgt, String cn, String loc, String pass) throws Exception {
		RegistrationDao rd=new RegistrationDao();
		boolean res=rd.datasend(un,bg,wgt,cn,loc,pass);
		return res;
	}

}
