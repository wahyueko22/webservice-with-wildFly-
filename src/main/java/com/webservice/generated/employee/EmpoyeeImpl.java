package com.webservice.generated.employee;

import java.util.*;
public class EmpoyeeImpl {
	private static  Map map;

	public EmpoyeeImpl() {
		map = new HashMap();
		map.put(1, new Employee("sven", 1, "Address 1 ocean", 8000001, "single"));
		map.put(2, new Employee("sunnny", 2, "Address 2 ocean", 8000002, "single"));
			// TODO Auto-generated constructor stub
	}
	
	public  Employee getEmployee (int idEmp){
		return (Employee) map.get(idEmp);
	}
	
}
