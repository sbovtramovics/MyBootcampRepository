package sef.module6.activity;

import sef.module6.sample.Person_I;
//import sef.module6.sample.Student_I;

public class InheritanceActivity {

	public static void main(String[] args) {
		
		// Create Person object p. Write code to and set name of Person as Sarah Johnson
		// and age as 21
		
		Person_I p = new Person_I();
		p.setName("Sarah Johnson");
		p.setAge(21);
		
		System.out.println("-----------------------------");
		//Create Employee object e and 
		// set salary as 70000, title as Developer, age as 32 and name as Shawn Cun
		
		Employee_I e = new Employee_I(); // Notice that Student_I constructor calls Person_I constructor
		e.setSalary(70000);
		e.setAge(35);
		e.setTitle("Developer");
		e.setName("Shawn Cun");
		
		// Print Info using Employee object
		System.out.println("-----------------------------");
		System.out.println("Employee's Name is   : " + e.getName());
		System.out.println("Employee's Age is    : " + e.getAge());
		System.out.println("Employee's Title is  : " + e.getTitle());
		System.out.println("Employee's Salary is : " + e.getSalary());
		
		
		// Print Info using Person object
		System.out.println("-----------------------------");
		System.out.println("Person's Name is    : " + p.getName());
		System.out.println("Person's Age is     : " + p.getAge());
		
			
		
	}

}