package com.webservice.generated.employee;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding;

@WebService(
		name = "employeePortName",
        targetNamespace = "http://employee.co.id/ws/employee/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface  EmployeeInterfaceWS {
	
	@WebMethod(operationName = "getEmployee", action = "employee-getEmployee")
	Employee getEmployee (int idEmp);
	
	@WebMethod(operationName = "addData", action = "employee-addData")
	int addData (int a, int b);
}
