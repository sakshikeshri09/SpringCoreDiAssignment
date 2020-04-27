package org.cap.exceptions;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

public class AdminDao implements IAdminDao {

	 private HashMap<Integer,Admin> store=new HashMap<>();

	public HashMap<Integer, Admin> getStore() {
		return store;
	}

	public void setStore(HashMap<Integer, Admin> store) {
		this.store = store;
	}
	
	public boolean validate(String name,String password)
	{
		boolean result=false;
		if(name.contentEquals("Sakshi")&&password.contentEquals("sakshi123"))
		{result=true;}
		
		return result;
		
	}
}
