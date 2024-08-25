package oop;
class Rectangle2{
	private int length;
	private int breadth;
	
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getBreadth() {
		return breadth;
	}
	
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	
	public int area() {
		return length*breadth;
	}
	
	public int peimeter() {
		return 2*(length*breadth);
	}
}
public class RectangleMain {
	
	public static void main(String[] args) {
		Rectangle2 r = new Rectangle2();
		
		r.setLength(14);
		r.setBreadth(10);
		int area = r.area();
		int perimeter = r.peimeter();
		
		System.out.println("Area : " + area);
		System.out.println("Perimeter : " + perimeter);
		
	}

}
