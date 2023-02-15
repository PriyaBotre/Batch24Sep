package ExceptionHandling;

public class Test3 {
	
	public static void main(String[] args) {
		//1 try->multiple catch
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
