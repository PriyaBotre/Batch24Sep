package ExceptionHandling;

public class TestClass2 {
	
	public static void main(String[] args) {
		
		int a=12;
		int b=5;
		int c=0;
		
		int d[]= {34,54,67,98};
		
		try {
			c=a/b;
			System.out.println(d[6]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("the value of b is 0(zero)");
		}
		//Normal flow
		System.out.println(c);
		System.out.println("End");
		
		//1.Exception is not generate
		//try->Normal Flow
		
		//2.Exception is generated and get handled
		//try->catch->Normal flow
		
		//3.Exception generated but not handled
		//try->---
	}

}
