package oop.headfirst.chapterone;

public enum Wood {
	INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;
	
	public String toSting() {
		switch(this) {
		case INDIAN_ROSEWOOD:
			return "indian rosewood";
		case BRAZILIAN_ROSEWOOD:return "brazilian rosewood";
		
		case MAHOGANY: return "mahogany";
		
		case MAPLE:
			return "maple";
		
		case COCOBOLO:
			return "cocobolo";
		
		case CEDAR:
			return "cedar";
		
		case ADIRONDACK:
			return "indian rosewood";
		
		case ALDER:
			return "alder";
		
		case SITKA:
			return "sitka";
	}
		return null;
	}
}
