package service;
//import ui.EmployeeUi;
import bean.Employee;

public class EmployeeService implements EmpSerInterface {
	Employee eObj;
	@Override
public void calculateIncentive() {
		double eSalary=eObj.getSalary()+5000;
		eObj.setSalary(eSalary);
	}
	

}
