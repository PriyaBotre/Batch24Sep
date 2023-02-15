package Generics;

import java.util.HashSet;
import java.util.Iterator;

public class TestClass7 {
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
		
		//Retrieval-using iterator
		
		Iterator i=s.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

		//Deletion
		s.remove('D');
		System.out.println("=====");
		i=s.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
