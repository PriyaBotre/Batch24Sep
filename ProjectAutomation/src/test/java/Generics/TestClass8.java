package Generics;

import java.util.HashMap;
import java.util.Map;

public class TestClass8 {
	
	public static void main(String[] args) {
		//HashMap
		       //Address,Data
		      //key,    value
		HashMap<Integer,String>map=new HashMap<Integer,String>();
		map.put(12,"Pune");
		map.put(45,"Class");
		map.put(9,"velocity");
		map.put(56,"56789");
		map.put(16,"Pune");
		
		for(Map.Entry<Integer,String>d:map.entrySet())
		{
			System.out.println("Key= " + d.getKey() + " Value= " + d.getValue());
		}
		
		map.put(56,"43211");
		System.out.println("==========");
		
		for(Map.Entry<Integer,String>d:map.entrySet())
		{
			System.out.println("Key= " + d.getKey() + " Value= " + d.getValue());
		}
	}
	

}
