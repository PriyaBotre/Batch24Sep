package Generics;

public class TestCl1 <K>{
	
	int a;
	String c;
	K d;
	
	public void demo(K f) {
		System.out.println(f);
	}
	
	public static void main(String[] args) {
		
		TestCl1 x=new TestCl1();
		x.a=45;
		x.c="Velocity";
		x.d=56;
		x.d="class";
		x.d=43.6;
		
		
		TestCl1<Integer> y=new TestCl1<Integer> ();
		y.a=34;
		y.c="Pune";
		y.d=65;
		y.demo(16);
	}

}
