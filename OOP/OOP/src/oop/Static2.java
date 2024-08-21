package oop;

class Demo1{
	int a=5;
	int b=4;
	
	static int count;
	
	int c;
	
	Demo1(){
//		count will increase for every object created;
		count++;
		
//		non static variable. memory will be allocated only when object is created;
//		so value of c will remain 1 for every object;
		c++;
	}
}

public class Static2 {
	
	
	
	
	public static void main(String args[]) {
		
		Demo1 d1 = new Demo1();
		Demo1 d2 = new Demo1();
		Demo1 d3 = new Demo1();
		Demo1 d4 = new Demo1();
		
		
		System.out.println(Demo1.count);
		System.out.println(d1.c);
		System.out.println(d4.c);
		
	}
}
