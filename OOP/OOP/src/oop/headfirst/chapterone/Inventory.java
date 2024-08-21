package oop.headfirst.chapterone;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List guiters;
	
	public Inventory() {
		guiters = new LinkedList();
	}
	
	public void addGuiter(String serialNumber, Builder fender, String model, Type electric, Wood alder, Wood alder2, double price) {
		Guiter guiter = new Guiter(serialNumber, fender, model, electric, alder, alder2, price);
		
		guiters.add(guiter);
		
		System.out.println("Guiter " + guiter.getModel() + " added successfully");
	}
	
	public Guiter getGuiter(String serialNumber) {
		for(Iterator i = guiters.iterator(); i.hasNext();) {
			Guiter guiter = (Guiter)i.next();
			if(guiter.getSerialNumber().equals(serialNumber)) {
				return guiter;
			}
		}
		return null;
	}
	
	public List search(Guiter searchGuiter) {
		List matchingGuiters = new LinkedList();
		for(Iterator i = guiters.iterator(); i.hasNext();) {
			Guiter guiter = (Guiter) i.next();
			
			
//			String model = searchGuiter.getModel();
			
			
//			if(searchGuiter.getBuilder() != guiter.getBuilder()) {
//				continue;
//			} 
			if(searchGuiter.getType() != guiter.getType()) {
				continue;
			}
			
//			if(searchGuiter.getBackWood() !=guiter.getBackWood()) {
//				continue;
//			}
//			 
//			if(searchGuiter.getTopWood() != guiter.getTopWood()) {
//				continue;
//			}
			
			matchingGuiters.add(guiter);
			
			
		}
		return matchingGuiters;
	}
}
