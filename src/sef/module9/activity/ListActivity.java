package sef.module9.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import sef.module9.sample.ListSample;

public class ListActivity {

	public static void main(String[] args) {
		//1 - Type code to create a list of names. Use ArrayList.
		
		//2 - Call print method to print the list passed as its parameter.
		
		
		//Create an ArrayList
	    List list = new ArrayList();
	    // List implemented as growable array
	    
	    // Add an element to the list
	    list.add("a");
	    
	    // Insert an element at the head of the list
	    list.add(0, "b");
	    
	    // Get the number of elements in the list
	    int size = list.size();          // 2
	    
	    // Retrieving the element at the end of the list
	    Object element = list.get(list.size()-1);   // a
	    
	    // Retrieving the element at the head of the list
	    element = list.get(0);                      // b
	    
	    // Remove the first occurrence of an element
	   // boolean b = list.remove("b");      // true
	   // b = list.remove("b");              // false
	    
	    // Remove the element at a particular index
	   // element = list.remove(0);          // a

	    
	    //1 - Add 3 more elements to the list - A, B and C
	    
	    
	
	    print(list);
	
		//call a method which prints this list
	}
	
	static void print(List list)
	{	

		
		//For(ListSample o:list)
		//{
		
		//1
		System.out.println("for(Obkect s : list)");
		for(Object s : list)
			System.out.println(s.toString());
		
		//2
		System.out.println(" Iteratror)");
		Iterator i=list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	
		//3
		System.out.println(list.toString());
		//3 - Type code to print this list
		//Notice the order in which elements get printed.
	
	}
}


