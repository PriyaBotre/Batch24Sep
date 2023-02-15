package ExceptionHandling;

public class Test6 {
	public static void main(String[] args) {
		
		int a=12;
		int b=5;
		int c=0;
		int i=6;
		int d[]= {34,54,67,98};
		
		//we can write try without catch but practically it is not necessary
		
		try {
			c=a/b;
			System.out.println("Hello");
			System.out.println(d[i]);
		}
		finally {
			System.out.println("Finally Block");
		}
		
		//Normal flow
		System.out.println(c);
		System.out.println("End");
		
	} 
	

}
