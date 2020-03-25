package com.webservice.controller;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webservice.generated.employee.Employee;
import com.webservice.generated.employee.EmployeeInterfaceWS;
import com.webservice.generated.employee.EmpoyeeImpl;

@WebServlet("/ws/EmployeeWSImpl")
@WebService(
		name = "employeePortName",
        targetNamespace = "http://employee.co.id/ws/employee/")
public class EmployeeWSImpl extends HttpServlet implements EmployeeInterfaceWS {

	@Override
	public Employee getEmployee(int idEmp) {
		// TODO Auto-generated method stub
		EmpoyeeImpl empImp = new EmpoyeeImpl();
		return empImp.getEmployee(idEmp);
	}

	@Override
	public int addData(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

}
