package Generics;

import java.util.ArrayList;

public class TestClass2 {
	

	public static void main(String[] args) {
		
		//Heterogeneous
		ArrayList a=new ArrayList();
		a.add(36);
		a.add("Velocity");
		a.add(12.56);
		a.add(true);
		
		//for each/advance for loop
		for(Object r:a) {
			System.out.println(r);
		}
		
		System.out.println("=======");
		//Homogeneous
		ArrayList <Integer> b=new ArrayList<Integer>();
		b.add(80);
		b.add(62);
		
		for(Integer r:b) {
			System.out.println(r);
		}

		
	}

}
