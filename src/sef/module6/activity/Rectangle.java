package sef.module6.activity;

public class Rectangle extends Shape {

	private double side1;
	private double side2;
	
	Rectangle(){}
	Rectangle(double side1, double side2){
			this.side1=side1;
			this.side2=side2;
	}
	
	public double calculateArea() {
		double area = side1 * side2;
		return area;
	}
	
	public double calculatePerimetr() {
		double perimetr = (side1+side2)*2;
		return perimetr; 
	}
	
	
}
