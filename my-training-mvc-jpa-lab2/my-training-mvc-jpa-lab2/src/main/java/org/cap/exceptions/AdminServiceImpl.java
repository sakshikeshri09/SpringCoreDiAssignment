package org.cap.exceptions;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class AdminServiceImpl implements IAdminService {



	private AdminDao dao;
	public AdminDao getDao() {
		return dao;
	}
	public void setDao(AdminDao dao) {
		this.dao = dao;
	}
	@Override
	public boolean validate(String name, String password) {
		boolean result=dao.validate(name, password);
		return result;
	}

}
