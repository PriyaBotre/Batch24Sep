package TestNGKeywords;

import org.testng.annotations.Test;

public class priority {
	//to change the exectuion sequence of test method
	//default execution-based on alphabetical order of method name
	//default priority=0
	//-ve no is supported
	@Test  (priority=3)
	public void test1() {
		System.out.println("Test 1");
		
	}
	
	@Test (priority=-2)
	public void test2() {
		System.out.println("Test 2");
	}
	

	@Test                 //default priority=0
	public void test3() {
		System.out.println("Test 3");
	}
	

	@Test (priority=2)
	public void test4() {
		System.out.println("Test 4");
	}

}
