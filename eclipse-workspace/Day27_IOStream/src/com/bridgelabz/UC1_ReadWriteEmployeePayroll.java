package com.bridgelabz;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UC1_ReadWriteEmployeePayroll {
 public enum IOService
 {
	 CONSOLE_IO,FILE_IO,DB_IO,REST_IO
 }
 private List<EmployeePayrollData> employeePayrollList;
 public void EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {}
	public static void main(String[] args) {
		// TODO Auto-generated method stPayrollList;ub
    ArrayList<EmployeePayrollData> employeePayrollList= new ArrayList<>();
    EmployeePayrollService employeePayrollService=new EmployeePayrollService(employeePayrollList);
    Scanner consoleInputReader = new Scanner(System.in);
    employeePayrollService.readEmployeePayrollData(consoleInputReader);
    employeePayrollService.writeEmployeePayrollData();
	}
	private  void readEmployeePayrollData(Scanner consoleInputReader)
	{
		System.out.println("Enter  employee ID: ");
		int id = consoleInputReader.nextInt();
		System.out.println("Enter  employee Name: ");
		String name = consoleInputReader.next();
		System.out.println("Enter  employee Salary: ");
		double salary = consoleInputReader.nextDouble();
		employeePayrollList.add(new EmployeePayrollData(id,name,salary));
		
	}
	private void writeEmployeePayrollData()
	{
		System.out.println("\nWriting Employee payroll Roaster to Console\n"+ employeePayrollList);
		
		
	}

		
		
		
	

}
