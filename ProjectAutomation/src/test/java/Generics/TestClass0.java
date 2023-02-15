package Generics;

public class TestClass0 <K,T>{
	
	int a;
	T c;
	K d;
	
	
	public static void main(String[] args) {
		
		TestClass0 x=new TestClass0();
		x.a=56;
		x.c="Velocity";
		
		
		TestClass0<Integer,String> y=new TestClass0<Integer,String>();
		y.a=24;
		y.c="pune";
		y.d=78;
	}

}
