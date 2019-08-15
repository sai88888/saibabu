package ui;
//import service.EmployeeService;
//import service.EmpSerInterface;
import dao.EmployeeDao;
import bean.Employee;
import java.util.Scanner;
public class EmployeeUi {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		/*
		 * System.out.println("enter the employeeid"); int empId=sc.nextInt();
		 * System.out.println("enter the employeeName"); String empName=sc.next();
		 * System.out.println("enter the employeeSalary"); double
		 * empSalary=sc.nextDouble();
		 */
		//Employee eObj=new Employee();
		EmployeeDao edc=new EmployeeDao();
		System.out.println("Enter the employee details");
		
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			//int empId=sc.nextInt();
			String empName=sc.next();
			double empSalary=sc.nextDouble();
			Employee eObj1=new Employee(i,empName,empSalary);
			edc.store(eObj1,i);
		}
		System.out.println("enter employee id to get all details");
		int temp=sc.nextInt();
		sc.close();
		System.out.println(edc.getEmployeeDetails(temp));
	}

}
