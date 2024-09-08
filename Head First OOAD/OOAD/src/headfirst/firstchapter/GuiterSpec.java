package headfirst.firstchapter;

public class GuiterSpec {
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	private Integer numOfString;
	
	public GuiterSpec(Builder builder, String model, Type type, Wood backWood,
			Wood topWood, Integer numOfString) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.numOfString = numOfString;
	}

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}
	
	public Integer getNumOfString() {
		return numOfString;
	}
	
	
	public boolean match(GuiterSpec checkSpec) {
		if(!builder.equals(checkSpec.builder)) {
			return false;
		} 
		if((model != null) &&(!model.equals("")) && (!model.equals(checkSpec.model))) {
			return false;
		} 
		if((type != null ) && (!type.equals("")) &&(!type.equals(checkSpec.type))) {
			return false;
		}
		if((numOfString != null) && (!numOfString.equals("")) && (!numOfString.equals(checkSpec.numOfString))) {
			return false;
		}
		if((topWood != null) && (!topWood.equals("")) && (!topWood.equals(checkSpec.topWood))) {
			return false;
		}
		if((backWood != null) && (!backWood.equals("")) && (!backWood.equals(checkSpec.backWood))) {
			return false;
		}
		
		return true;
	}
	
	
}
