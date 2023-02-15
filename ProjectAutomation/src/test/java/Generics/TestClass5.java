package Generics;

import java.util.ArrayList;
import java.util.List;

public class TestClass5 {
	
	public static void main(String[] args) {
		
		List<String> b=new ArrayList<String>();  //up-casting
		b.add("Class");
		b.add("Velocity");
		b.add("Pune");
		b.add("Testing");
		
		//Advance for loop/for each
		for(String x:b) {
			System.out.println(x);
		}
	}

}
