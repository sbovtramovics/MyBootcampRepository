package sef.module6.activity;

public class Square extends Shape {
	
	private double side;
	
	Square(){}
	Square(double side){
			this.side=side;
	}
	
	public double calculateArea() {
		double area = side * side;
		return area;
	}
	
	public double calculatePerimetr() {
		double perimetr = 4 * side;
		return perimetr; 
	}
	
}
