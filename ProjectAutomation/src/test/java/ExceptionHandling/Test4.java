package ExceptionHandling;

public class Test4 {
	public static void main(String[] args) {
		
		int a=12;
		int b=0;
		int c=0;
		int i=7;
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
			try {
				System.out.println(d[i]);
			}
			catch(ArrayIndexOutOfBoundsException t)
			{
				System.out.println("Alternative code for Array Index Out Of Bounds Exception");
				System.out.println("index="+ i + "is not present");
			}
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Alternative code for Array Index Out Of Bounds Exception");
			System.out.println("index="+ i + "is not present");
		}
		//Normal flow
		System.out.println(c);
		System.out.println("End");
	}

}
