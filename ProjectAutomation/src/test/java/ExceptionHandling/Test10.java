package ExceptionHandling;

public class Test10 {
	public static void main(String[] args) {
		
		int a=12;
		int b=0;
		int c=0;
		int i=6;
		int d[]= {34,54,67,98};
		
		try {
			c=a/b;     //new ArithmeticException
	        System.out.println("Hello");
			System.out.println(d[i]);    //new ArrayIndexOutOfBoundException
		}
		catch(ArithmeticException e)    //this catch is execute
		{    
			System.out.println("Alternative code for Arithmetic Exception");
			System.out.println("the value of b is 0(zero)");
			System.out.println("Hi");
		}
		//catch(Throwable e)it is syntaxwise correct but practically wrong
		//because it can try to handle the error also
		catch(Throwable e)      //(Exception e)is common code for all types of exceptions 
		{                   //this catch is not execute
			System.out.println("Common code for all types of Exceptions");
			e.printStackTrace();
			String x=e.toString();
			System.out.println(x);
		}
		//Normal flow
		System.out.println(c);
		System.out.println("End");
	}

}
