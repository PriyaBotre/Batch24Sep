package TestNGKeywords;

import org.testng.Assert;
import org.testng.annotations.Test;

public class enabled {
	
	@Test (priority=3)
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test (priority=1,enabled=false)
	public void test2() {
		System.out.println("Test 2");
	}
	
	@Test (priority=0)
	public void test3() {
		System.out.println("Test 3");
	}
	
	@Test (priority=2)
	public void test4() {
		System.out.println("Test 4");
	}

}
