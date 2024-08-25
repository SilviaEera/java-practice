package office.main;

public class Account {
	private Integer accountNum;
	private String accountHolderName;
	private String accountHolderAddress;
	
	
	//
	
	public Account(String accountHolderName, Integer accountNum, String accountHolderAddress) {
		this.accountHolderName = accountHolderName;
		this.accountHolderAddress = accountHolderAddress;
		this.accountNum = accountNum;
	}


	public Integer getAccountNum() {
		return accountNum;
	}


	public String getAccountHolderName() {
		return accountHolderName;
	}


	public String getAccountHolderAddress() {
		return accountHolderAddress;
	}
}
