package inurone.main;

public class Batch {
	
	private String batchName;
	private Integer batchId;
	
	



	public Batch(String batchName, Integer batchId) {
		super();
		this.batchName = batchName;
		this.batchId = batchId;
	}
	
	public String getBatchName() {
		return batchName;
	}


	public Integer getBatchId() {
		return batchId;
	}
	
	public String toString() {
		return batchName + " " + batchId;
	}

}
