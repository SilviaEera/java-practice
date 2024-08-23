package oop;

class Mamal{
	final boolean hasBackBone = true;
	
	{
//		hasBackBone = false; //can't be assigned a new value because the variable is final
	}
	
	final void display() {
		System.out.println("does not lay eggs");
	}
}


final class Cat extends Mamal{
	String s ="t";
	
	void dis() {
		System.out.print(s.repeat(5));	
		
	}
	
	
	
//	can not override because the method is final
	
//	void display() {
//		System.out.println("test");
//	}
}


//another class can not inherit a class if it's final

//class LocalCat extends Cat{
//	
//}

public class FinalKeyword {
	public static void main(String args[]) {
		Cat c = new Cat();
		
		c.dis();
	}
}
