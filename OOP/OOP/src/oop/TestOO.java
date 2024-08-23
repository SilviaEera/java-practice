package oop;

import java.util.Scanner;

abstract class Shapes{
	float area;
	
	abstract void input();
	abstract void calculate();
	
	public void display() {
		System.out.println("area is " + area);
	}
}
class Rectangle extends Shapes{
	float length;
	float width;
	@Override
	void input() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter length");
			length = sc.nextFloat();
			
			System.out.println("enter width");
			
			width = sc.nextFloat();
		}
	@Override
	void calculate() {
		area = length * width;
		
	}
}

class Circle extends Shapes{
	
float radius;
	
	final float pi = 3.14f;
	
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter radius");
		radius = sc.nextFloat();
		
//		System.out.println("enter width");
//		
//		width = sc.nextFloat();
	}
	
	public void calculate() {
		area = pi*(radius*radius);
	}
	
	public void display() {
		System.out.println("area is " + area);
	}
}

class Square extends Shapes{
	float length;
	 
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter length");
		length = sc.nextFloat();
	}
	
	public void calculate() {
		area = length * length;
	}
	
	public void display() {
		System.out.println("area is " + area);
	}
}

class Test {
	public void runObj(Shapes s) {
		s.input();
		s.calculate();
		s.display();
	}
}
public class TestOO {
	public static void main(String[] args) {
		
		Test t = new Test();
//		Square s = new Square(); //tight coupling // not using polymorphism
		Shapes s = new Square(); //loosely coupling // polymorphism 
		t.runObj(s);
		
//		s.input();
//		s.calculate();
//		s.display();
//		
		Shapes c = new Circle();
		t.runObj(c);
//		
//		c.input();
//		c.calculate();
//		c.display();
//		
		Shapes r = new Rectangle();
		t.runObj(r);
//		
//		r.input();
//		r.calculate();
//		r.display();
		
		
	}
}
