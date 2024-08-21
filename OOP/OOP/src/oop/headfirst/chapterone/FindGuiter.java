package oop.headfirst.chapterone;

public class FindGuiter {
	public static void main(String [] args) {
		Inventory inventory = new Inventory();
		
		inventory.addGuiter("V95693", "Fender", "Stratocastor", "electric", "alder", "alder", 1499.95);
		
		Guiter forErin = new Guiter("", "Fender", "Stratocastor", "electric", "alder", "alder", 0);
		
		Guiter guiter = inventory.search(forErin);
		if(guiter!=null) {
			System.out.println("Erin, you might like this " + guiter.getBuilder() + " " + guiter.getModel() + " " + guiter.getPrice() + " " + guiter.getSerialNumber() + " " + guiter.getTopWood());
		}else {
			System.out.println("Sorry! nothing for you.");
		}
		
//		System.out.print(inventory.guiters);
		
	}
}
