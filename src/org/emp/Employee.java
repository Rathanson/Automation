package org.emp;

public class Employee {
	public void empId() {
		System.out.println("Employee id is 123 ");

	}

	public void empName() {
		System.out.println("Employee name is rathanson");

	}

	public void empDOB() {
		System.out.println("Employee date of birth is 12/15/1993");

	}
	public void empPhone() {
	System.out.println("Employee phone num is 8438943960");

}
	public void empEmail() {
		System.out.println("Employee email id is rathanson1993@gmail.com");

	}
	public void empAddress() {
		System.out.println("Employee address is pamban");

	}
	public void maven() {

	}
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.empName();
		emp.empId();
		emp.empAddress();
		emp.empPhone();
		emp.empDOB();
		emp.empEmail();
	}
}