package oop.headfirst.chapterone;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List guiters;
	
	public Inventory() {
		guiters = new LinkedList();
	}
	
	public void addGuiter(String serialNumber, String builder, String model, String type, String backWood, String topWood, double price) {
		Guiter guiter = new Guiter(serialNumber, builder, model, type, backWood, topWood, price);
		
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
	
	public Guiter search(Guiter searchGuiter) {
		for(Iterator i = guiters.iterator(); i.hasNext();) {
			Guiter guiter = (Guiter) i.next();
			
			
			
			String model = searchGuiter.getModel();
			String type = searchGuiter.getType();
			String backWood= searchGuiter.getBackWood();
			String topWood= searchGuiter.getTopWood();
			if((model.equals(guiter.getModel())) || (type.equals(guiter.getType())) || (backWood.equals(guiter.getBackWood())) || (topWood.equals(guiter.getTopWood()))) {
				return guiter;
			}
//			
//			
//			
//			if((type!=null) && (type!="") && (!type.equals(guiter.getType()))){
//				continue;
//			}
//			
//			
//			
//			if((backWood!=null) && (backWood!="") && (!backWood.equals(guiter.getBackWood()))){
//				continue;
//			}
//			
//			
//			
//			if((topWood!=null) && (topWood!="") && (!topWood.equals(guiter.getTopWood()))){
//				continue;
		}
		return null;
	}
}
