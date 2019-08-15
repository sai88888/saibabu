package dao;
//import java.util.Scanner;
import bean.Employee;
public class EmployeeDao implements EmployeeDaoInt {
Employee eObj[]=new Employee[100];
public void store(Employee eObj1,int tmp) {
	eObj[tmp]=eObj1;
}
@Override
public Employee getEmployeeDetails(int temp) {
	if(temp==eObj[temp].getEmployeeID())
	{
		return eObj[temp];
		
	}
	return null;
}
}
