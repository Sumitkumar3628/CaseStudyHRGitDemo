package com.lti.services;

import com.lti.beans.Employee;
import com.lti.dao.EmpDao;
import com.lti.dao.EmpDaoImpl;

public class EmpServiceImpl implements EmpService{

	EmpDao dao = new EmpDaoImpl();
	
	public void addEmployee(Employee e) {
		System.out.println("in service layer "+ e);
		dao.addEmployee(e);
	}
	
	
}
