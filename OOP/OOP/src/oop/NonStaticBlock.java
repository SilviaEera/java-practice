package oop;

class Demo{
	
	int a;
	int b;
	static int count;
	{
		count++;
	}
	
	
//	non-static java block is included inside every constructor;
	
	Demo(){
		
	}
	
	Demo(int a)
	{
		this.a = a;
	}
	
	Demo(int a, int b){
		this.a=a;
		this.b=b;
	}
}


public class NonStaticBlock {
	
	public static void main(String args[]) {
		Demo d1 = new Demo();
		Demo d2 = new Demo(10, 4);
		Demo d3 = new Demo(4);
		Demo d4 = new Demo();
		
		
		System.out.println(Demo.count);
	}

}
