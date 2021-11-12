package com.syntax.com15;

public class EmployeeIDTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	EmployeeID emp=new EmployeeID();
	
	emp.empID=49779;
	emp.salary=72500.00;
	
	System.out.println("The first employee's ID is "+emp.empID+" his salary is "+emp.salary+" his employer is "+emp.CEO+".");
	
	
	EmployeeID emp2=new EmployeeID();
	emp2.empID=46345;
	emp2.salary=9552.50;
	
	System.out.println("The second employee's ID is "+emp2.empID+" his salary is "+emp2.salary+" his employer is "+emp.CEO+".");
	}

}
