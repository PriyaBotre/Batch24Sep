package Generics;

import java.util.HashSet;
import java.util.Iterator;

public class TestClass6 {
	
	public static void main(String[] args) {
		//HashSet
		HashSet<Character> s=new HashSet<Character>();
		s.add('$');
		s.add('4');
		s.add('D');
		s.add('*');
		s.add('$');
		s.add('Y');
		s.add('q');
		
		for(char x:s) {
			System.out.println(x);
		}
		System.out.println("======");
		//OR
		
		Iterator i=s.iterator();
		
		for(char x:s)
		{
			System.out.println(i.next());
		}
		System.out.println("=====");
		
		i=s.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
