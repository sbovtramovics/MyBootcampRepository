package sef.module8.activity;

import sef.module6.activity.Shape;

//Needs to be completed
//1 - extend this class from Exception class
public class CustomExceptionActivity extends CustomExceptionActivityTest {
	public static void main(String[] args) {
	
		try {
		validateUser("Sergejs");
		}
		catch (IllegalArgumentException e) {System.out.println("User is not valid!!!");}
		finally {}
	}
		
		//CustomExceptionActivityTest validateUser("Sergejs");
	
	}
	//2 - Override getMessage() and provide the following message 
	// "You are not allowed to use this program"
	
	
