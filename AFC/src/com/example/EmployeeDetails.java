package com.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Employee{
	int emp_id;
	String name;
	int salary;
	public Employee(int emp_id, String name, int salary) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}

public class EmployeeDetails {
	
public static void main(String str[]) {
	
	Set<Employee> employee = new HashSet();
	System.out.println(employee);
	
	employee.add(new Employee(01,"sham",20000 ));
	employee.add(new Employee(02,"john",30000 ));
	employee.add(new Employee(03,"doe",45000 ));
	employee.add(new Employee(04,"casey",50000 ));
	employee.add(new Employee(05,"tom",60000 ));
	
	Iterator<Employee> iterator = employee.iterator();
	
	while(iterator.hasNext()) {
		Employee  emp = (Employee)iterator.next();
		System.out.println("id: " + emp.emp_id + " name: " + emp.name + " salary: " + emp.salary);
	}

	
}
}
