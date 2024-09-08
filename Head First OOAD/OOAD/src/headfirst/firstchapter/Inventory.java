package headfirst.firstchapter;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List guiters;
	
	public Inventory(){
		guiters = new LinkedList<>();
	}
	
	
//	method to add guiter
	public Guiter addGuiter(String serial, double price, Builder builder, String model,Type type, Wood topWood,
			Wood backWood, Integer numOfString) {
		
		
		GuiterSpec spec = new GuiterSpec(builder, model, type, backWood, backWood, numOfString);
		Guiter guiter = new Guiter(serial, price, spec);
		
		
		guiters.add(guiter);
		
		return null;
		
	}
	
	

	
//	search guitar method 
	
	public List searchGuiter(GuiterSpec searchSpec) {
		
		List matchingGuiters =  new LinkedList();
		
		for(Iterator i = guiters.iterator(); i.hasNext();) {
			Guiter guiter = (Guiter)i.next();
			GuiterSpec guiterSpec = guiter.getSpec();
			
			
//			taking the match method inside GuiterSpec using the getSpec method from Guiter object
//			now to add any item or remove item we just need to change the GuiterSpec object
			
			if(guiter.getSpec().match(searchSpec)) {
				matchingGuiters.add(guiter);
			}
			
//			Builder builder = searchSpec.getBuilder();
					
//			if(searchSpec.getBuilder() != guiterSpec.getBuilder()) {
//				continue;
//			}
			
//			String model = searchSpec.getModel();
			
//			if(searchSpec.getModel() != guiterSpec.getModel()) {
//				continue;
//			}
			
//			Type type = searchSpec.getType();
			 
//			if(searchSpec.getType() != guiterSpec.getType()) {
//				continue;
//			}
			
//			Wood topWood = searchSpec.getTopWood();
			 
//			if(searchSpec.getBackWood() != guiterSpec.getTopWood()) {
//				continue;
//			}
			 
			
//			Wood backWood = searchSpec.getBackWood();
			 
//			if(searchSpec.getBackWood() != guiterSpec.getBackWood()) {
//				continue;
//			}
			
//			matchingGuiters.add(guiter);
		}
		return matchingGuiters;
	}
	
	
	
//	get guiter method 
	
	
	public Guiter getGuiter(String serial) {
		
		for(Iterator i = guiters.iterator(); i.hasNext();) {
			Guiter guiter = (Guiter) i.next();
			
			if(guiter.getSerial().equals(serial)) {
				return guiter;
			}
		}
		return null;
	}


	
		
}	

