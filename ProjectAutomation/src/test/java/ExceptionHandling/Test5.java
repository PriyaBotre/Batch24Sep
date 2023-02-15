package ExceptionHandling;

public class Test5 {
	
	public static void main(String[] args) {
		
		int a=12;
		int b=5;
		int c=0;
		int i=6;
		int d[]= {34,54,67,98};
		
		try {
			c=a/b;
			System.out.println("Hello");
			System.out.println(d[i]);
		}
		catch(ArithmeticException e)
		{   
			System.out.println("Alternative code for Arithmatic Exceptionn");
			System.out.println("the value of b is 0(zero)");
			System.out.println("Hi");
		}
		finally {
			System.out.println("Finally Block");
		}
		//Normal flow
		System.out.println(c);
		System.out.println("End");
		
		//1.Exception is not generate
		//try->finally->Normal Flow
		
		//2.Exception is generated and get handled
		//try->catch->finally->Normal flow
		
		//3.Exception generated but not handled
		//try->finally---
	}

}
