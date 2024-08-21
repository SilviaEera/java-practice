package oop.headfirst.chapterone;

import java.util.Iterator;
import java.util.List;

public class FindGuiter {
	private static void initInv(Inventory inv) {
		inv.addGuiter("v94536", Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 1499.97);
		
		inv.addGuiter("v94536", Builder.COLLINGS, "SoothingStar", Type.ELECTRIC, Wood.MAHOGANY, Wood.MAHOGANY, 1300);
	}
	
	public static void main(String [] args) {
		Inventory inventory = new Inventory();
		
		 initInv(inventory);
		
		Guiter forErin = new Guiter("", Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 0);
		
		
		List matchingGuiters = inventory.search(forErin);
		if(!matchingGuiters.isEmpty()) {
			System.out.println("you might like these");
			
			for(Iterator i = matchingGuiters.iterator(); i.hasNext();) {
				Guiter guiter = (Guiter)i.next();
				
				System.out.println("we have " + guiter.getBuilder() + " " + guiter.getType() + " " + guiter.getPrice());
			}
		}
		else {
			System.out.println("sorry!");
		}
//		if(guiter!=null) {
//			System.out.println("Erin, you might like this " + guiter.getBuilder() + " " + guiter.getModel() + " " + guiter.getPrice() + " " + guiter.getSerialNumber() + " " + guiter.getTopWood());
//		}else {
//			System.out.println("Sorry! nothing for you.");
//		}
		
//		System.out.print(inventory.guiters);
		
		
		
	}
	
}
