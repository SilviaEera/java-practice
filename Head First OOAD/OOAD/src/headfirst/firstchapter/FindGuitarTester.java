package headfirst.firstchapter;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {
	
	public static void initializeInentory(Inventory inv) {
		inv.addGuiter("V95396", 1499.67, Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6);
		inv.addGuiter("V95393", 1799.67, Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6);
	}

	public static void main(String[] args) {
		
		Inventory inventory = new Inventory();
		
		initializeInentory(inventory);
		
		
		GuiterSpec whatErinLikes = new GuiterSpec(Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6);
		
//		Guiter guiter = inventory.searchGuiter(whatErinLikes);
		List matchingGuiters = inventory.searchGuiter(whatErinLikes);
		
		if(!matchingGuiters.isEmpty()) {
			System.out.println("Erin you might like this : ");
			
			for(Iterator i = matchingGuiters.iterator(); i.hasNext();) {
				Guiter guiter = (Guiter) i.next();
				System.out.println("We have a : " +  guiter.getSpec().getBuilder() + "\t" + guiter.getSpec().getModel() + "\t" 
					
					+ guiter.getSpec().getTopWood() + "\t" + guiter.getSpec().getBackWood() + "\t" + guiter.getPrice() 
					);
			}
		} else {
			System.out.println("Sorry Erin we could not find the guitar you are looking for. ");
		}
	}

}
