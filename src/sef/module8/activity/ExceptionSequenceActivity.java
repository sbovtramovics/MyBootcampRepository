package sef.module8.activity;
import java.util.*;

//Needs to be completed
//1 - Find out the error in this program and share your finding with the instructor
public class ExceptionSequenceActivity {
public static void main(String[] args) {
	Scanner input = new Scanner( System.in);
	int number1 = 0;
	int number2 = 0;
	boolean flag=true;
	try{
		number1 = input.nextInt();
		number2 = input.nextInt();
	}
	catch (InputMismatchException e) {
		System.out.println("Text is not allowed");
		flag=false;
		//break;
	}
	finally{
		if (flag)
			new ExceptionSequenceActivity().divide(number1,number2);
		}
}

void divide(int num1,int num2)
{
	try{
	System.out.println(num1/num2);	
	}
	catch(ArithmeticException a)
	{
	System.out.println("Division by zero is not allowed");} 
	catch(Exception e)
	{
		System.out.println("Exception!!!");
	}
	
	
}
}
