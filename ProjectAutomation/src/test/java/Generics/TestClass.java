package Generics;

import java.util.ArrayList;

public class TestClass {
	
	public static void main(String[] args) {
		
		//Insertion
		//Deletion
		//

		//Homogeneous
		ArrayList<String> b=new ArrayList<String> ();
		b.add("Class");
		b.add("Velocity");
		b.add("Pune");
		b.add("Testing");
		
		//Advance for loop-For each
		for(String x : b) {
			System.out.println(x);
		}
		b.remove(2);
		
		System.out.println("=========");
		
		//Normal for loop
		for(int i=0;i<b.size();i++)
		{
			System.out.println(b.get(i));
		}
	}
		
	
	
}
