package com.mouni;
import java.util.*;
class Employee {
	int emp_id;
	String emp_name;
	float emp_salary;
	Employee(int emp_id, String emp_name , float emp_salary){
		this.emp_id = emp_id;
		this.emp_name =  emp_name;
		this.emp_salary = emp_salary;
	}
	void display() {
		System.out.println("Employee Id : " + emp_id);
		System.out.println("Employee Name : " + emp_name);
		System.out.println("Employee Salary : " + emp_salary);
	}
}

public class MyClass {

	public static void main(String[] args) {
		
		Employee ep1 = new Employee(101, "Mouni", 2000.00f);
		ep1.display();
		Employee ep2 = new Employee(102, "Abii" , 3000.00f);
		ep2.display();
	}

}
