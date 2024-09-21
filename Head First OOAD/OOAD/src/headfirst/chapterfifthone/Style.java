package headfirst.chapterfifthone;

public enum Style {
	
	A_STYLE, F_STYLE, BOWL_BACK, FLAT_BACK, ELECTRIC;
	
	public String toString() {
		switch(this) {
		case A_STYLE: return "a-style";
		
		case F_STYLE: return "f-style";
		
		case BOWL_BACK: return "bowl-style";
		
		case FLAT_BACK: return "flat-back";
		
		case ELECTRIC: return "electric";
		}
		
		return null;
	}

}
