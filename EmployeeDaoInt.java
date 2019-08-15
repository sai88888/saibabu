package dao;
//import service.EmployeeService;
import bean.Employee;
public interface EmployeeDaoInt {
	public Employee getEmployeeDetails(int temp);
	public void store(Employee eObj1,int tmp);
}
