package varargs.main;
class Demo{
	public void varArgsMethod(int...x) {
		for(int i:x) {
			System.out.println("inside " + i);
		}
	}
}

public class Varargs {
	

	public static void main(String [] args) {
		
		System.out.println("The quick brown fox jumps over the lazy dog.");
		
		Demo d = new Demo();
		d.varArgsMethod();
		d.varArgsMethod(1, 4);
		d.varArgsMethod(3, 6, 1, 9);
	}
}
