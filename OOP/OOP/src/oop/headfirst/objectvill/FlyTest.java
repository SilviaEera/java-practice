package oop.headfirst.objectvill;

public class FlyTest {
	public static void main(String args []) {
		
		
		Airplane biplane = new Airplane();
		biplane.setSpeed(212);
		
		System.out.println(biplane.getSpeed());
		
		Jet boing = new Jet();
		
//		biplane.display();
//		boing.display();
		boing.setSpeed(422);
		
		System.out.println(boing.getSpeed());
		
		int x = 0;
		
		while(x<4) {
			boing.accelarate();
			System.out.println("Boing "+boing.getSpeed());
			
			if(boing.getSpeed()>5000) {
				biplane.setSpeed(biplane.getSpeed()*2);
			} else {
				boing.accelarate();
			}
			x++;
			
		}
		System.out.println("Biplane "+biplane.getSpeed());
	}
}
