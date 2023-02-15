package Generics;

import java.util.Hashtable;
import java.util.Map;

public class TestClass10 {
	public static void main(String[] args) {
		
		//Hashtable
		          //key ,value
		Hashtable<String,Integer>students=new Hashtable<String,Integer>();
		students.put("Math",78);
		students.put("Scince",89);
		students.put("History",90);
		students.put("Manual",67);
		
		for(Map.Entry<String,Integer> d:students.entrySet())
		{
			System.out.println("Key =" + d.getKey() + " Value = " + d.getValue());
		}
		
	}

}
//In Hashtable null key not allowed e.g students.put(null,78);
//In Hashtable null value not allowed e.g students.put("Math",null);
