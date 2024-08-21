package oop;

public class StaticTest {
	
	static int a = 5;
	static int b;
	
	static {
		System.out.println(a);
		
		System.out.println("inside a static block. outside the main mehtod.");
	}
	
	 void demo() {
		b=3;
		System.out.println("nonstatic method outside the main method, only executed when called.");
	}
	 
	 static void disp() {
		 System.out.println("inside a static method that can be called without creating object.");
	 }

	public static void main(String[] args) {
		
		System.out.println("inside the main method");
		disp();
		StaticTest st = new StaticTest();
		st.demo();
		System.out.println(b);
		
	}

}
