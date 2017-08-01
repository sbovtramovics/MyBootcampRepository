package sef.module6.activity;

// class Employee_I must extend class Person_I. Complete code for the same
public class Employee_I  {
	
	//Attributes
	private double salary;
	private String title;
	private String name;
	private int age;
	
	//Behavior - write default constructor. Print 'I'm an Employee_I Constructor'
	//Behavior - default constructor
	public Employee_I(){ 
		System.out.println("I'm an Employee_A Constructor"); 
	}
	
	// write getter for int salary
	// getter for double salary
	public double getSalary() {
		return salary;
	}
	
	// write setter for int salary
	// setter for double salary
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	// write getter for String title
	// getter for String title
	public String getTitle() {
		return title;
	}
	
	// write setter for String title
	// setter for String title
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getName(){
		return name;
	}
	
	// write getter for int age
	// getter for int age
	public int getAge() {
		return age;
	}

	// write setter for int age
	// setter for int age
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name){
		this.name="<E>"+name;
	}
	
}

