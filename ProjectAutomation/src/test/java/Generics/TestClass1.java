package Generics;

import java.util.ArrayList;

public class TestClass1<K,T> {
	
	public static void main(String[] args) {
		
		//Heterogeneous
		ArrayList a=new ArrayList();
		a.add(36);
		a.add("Velocity");
		a.add(12.56);
		a.add(true);
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println("=======");
		//Homogeneous
		ArrayList <Integer> b=new ArrayList<Integer>();
		b.add(80);
		b.add(62);
		
		for(int i=0;i<b.size();i++) {
			System.out.println(b.get(i));
		}

		
	}

}
