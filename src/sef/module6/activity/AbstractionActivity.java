package sef.module6.activity;

public class AbstractionActivity {
	
	public static void main(String[] args) {
		Shape square1 =new Square(5);
		Shape recta2 = new Rectangle(5,6);
		square1.setColor("Red");
		
		recta2.setColor("Green");

		
		System.out.println("*** Print the Information for Square ***");
		System.out.println("Color os Square   : " + square1.getColor());
		System.out.println("Area of Square    : " + square1.calculateArea());
		System.out.println("Perimetr of Square  : " + square1.calculatePerimetr());
		
		System.out.println("*** Print the Information for Rectangle ***");
		System.out.println("Color os Rectangle   : " + recta2.getColor());
		System.out.println("Area of Rectangle    : " + recta2.calculateArea());
		System.out.println("Perimetr of Rectangle  : " + recta2.calculatePerimetr());
	}

}
