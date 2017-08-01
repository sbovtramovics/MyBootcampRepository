package sef.module9.activity;
//Needs to be completed

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import sef.module9.sample.MapSample;


public class MapActivity {

		public static void main(String[] args) {
			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String and value is a name
			
		
			//Map map = new HashMap();
			//map.put("1", "A String");
			//map.put("2", new Date());
			//map.put("3", new Integer(42));
			//map.put("4", new Float(23.0f));
			
			
			Map map = new HashMap();
			map.put("1", "Sasha");
			map.put("2", "John");
			map.put("3", "Stacie");
			map.put("4", "Mike");
			map.put("5", "Peter");
			
			//Beware of using the same key twice cause it will overwrite the value
			//map.put("1", "Same key as A String");
			
			//System.out.println(map.get("1"));
			//System.out.println(map.get("2"));
			
			
			new MapActivity().print(map);
			
			
			
			
			//2 - Call print method to print the map passed as its parameter.
		
		}
		
		void print(Map map)
		{
			
			//3 - Type code to print this map
			
			//Keys are maintained as set in map.
			Set keySet = map.keySet();
			
			//You can use an iterator to access keys
			System.out.println("*************************************");
			System.out.println("Key\tValue");
			Iterator it=keySet.iterator();
			while(it.hasNext())
			{
				String key=(String)it.next();
				System.out.println(key+"\t"+map.get(key));
			}
			
			System.out.println("*************************************");
			

		
		}
	}
