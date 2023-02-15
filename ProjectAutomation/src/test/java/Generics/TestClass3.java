package Generics;

import java.util.ArrayList;

public class TestClass3 {
	
	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		//Insertion
		a.add(76);
		a.add("Velocuty");
		a.add(45.99);
		a.add(true);
		
		//Retrieval
		Object x=a.get(3);
		
		for(Object r:a) {
			System.out.println(r);
		}
		
		
		System.out.println("=========");
		
		//deletion
		a.remove(2);
		
		for(Object r:a) {
			System.out.println(r);
		}
	}

}
