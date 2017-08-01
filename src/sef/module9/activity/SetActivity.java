package sef.module9.activity;

import java.util.HashMap;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Map;
//Needs to be completed
import java.util.Set;


public class SetActivity {

	public static void main(String[] args) {
		
		
		//Map map = new HashMap();
		Set nameSet = new TreeSet();
		nameSet.add("Sasha");
		nameSet.add("John");
		nameSet.add("Stacie");
		nameSet.add("Mike");
		nameSet.add("Peter");
		
		System.out.println("Output : " +nameSet.toString());
		
		//Beware of using the same key twice cause it will overwrite the value
		//map.put("1", "Same key as A String");
		
		//System.out.println(map.get("1"));
		//System.out.println(map.get("2"));
		
		
		//new MapActivity().print(map);
		//1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.
		
		
		
		//2 - Call print method to print the set passed as its parameter.
		
	}
	
	void print(Set set)
	{
		
		//Set keySet = map.keySet();
		
		//You can use an iterator to access keys
		//System.out.println("*************************************");
		//System.out.println("Key\tValue");
		//Iterator it=keySet.iterator();
		//while(it.hasNext())
		//{
		//	String key=(String)it.next();
		//	System.out.println(key+"\t"+map.get(key));
		//}
		
		//System.out.println("*************************************");
		//3 - Type code to print this set
		//Notice the order in which elements get printed.
	}
}
