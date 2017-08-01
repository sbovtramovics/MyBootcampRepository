package sef.module8.activity;
import java.util.*;

public class AssertTest {
	public static void main( String args[] )
	{
		Scanner input = new Scanner( System.in);
		try {
		System.out.print( "Enter a number between 0 and 10: ");
		int number = input.nextInt();
		assert ( number > 0 && number <= 10 ) : "bad number: " + number;
		System.out.printf( "You entered %d\n", number );
		}
		catch(AssertionError e) {
			System.out.printf( "Wrong number!!!");
		}
	}

}
