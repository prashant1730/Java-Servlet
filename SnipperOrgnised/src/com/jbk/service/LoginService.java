package com.jbk.service;

import com.jbk.dao.LoginDao;

public class LoginService {

	public boolean loginCheck(String username, String password) throws Exception {

		LoginDao dao = new LoginDao();
		boolean result = dao.loginCheck(username, password);

		return result;
	}

}
