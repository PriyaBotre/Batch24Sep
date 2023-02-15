package TestNGKeywords;

import org.testng.Assert;
import org.testng.annotations.Test;

public class timeOut {
	
	@Test (priority=3)
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test (timeOut=3000)
	public void test2() throws InterruptedException {
		System.out.println("Test 2");
		Thread.sleep(4000);
		System.out.println("Hello");
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
