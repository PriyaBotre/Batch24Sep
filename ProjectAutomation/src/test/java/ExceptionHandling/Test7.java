package ExceptionHandling;

public class Test7 {
	public static void main(String[] args) {
		
		int a=12;
		int b=5;
		int c=0;
		int i=6;
		int d[]= {34,54,67,98};
		
		try {
			c=a/b;     //new ArithmeticException
	        System.out.println("Hello");
			System.out.println(d[i]);    //new ArrayIndexOutOfBoundException
		}
		catch(ArithmeticException e)
		{    
			System.out.println("Alternative code for Arithmetic Exception");
			System.out.println("the value of b is 0(zero)");
			System.out.println("Hi");
		}
		catch(Exception e)      //(Exception e)is common code for all types of exceptions 
		{
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
