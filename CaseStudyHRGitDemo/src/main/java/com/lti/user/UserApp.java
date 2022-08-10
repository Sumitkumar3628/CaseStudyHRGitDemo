package com.lti.user;

import com.lti.beans.Employee;
import com.lti.services.EmpService;
import com.lti.services.EmpServiceImpl;

public class UserApp {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(102,"Viay",600000);
		//System.out.println(e1);
		System.out.println("in user layer");
		EmpService service = new EmpServiceImpl();
		service.addEmployee(e1);

	}

}
