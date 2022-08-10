package com.lti.dao;

import com.lti.beans.Employee;

//chef
public class EmpDaoImpl implements EmpDao{

	public void addEmployee(Employee e) {
		System.out.println("in dao layer " + e);
	}
	
	
}
