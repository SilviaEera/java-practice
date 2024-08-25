package office.main;

public class Employee {
	
	private Integer employeeID;
	private String employeeName;
	private String employeeAddress;
	
	Account account;
	//
	
	public Employee(String employeeName, Integer employeeID, String employeeAddress, Account account) {
		this.employeeName = employeeName;
		this.employeeID = employeeID;
		this.employeeAddress = employeeAddress;
		this.account = account;
	}
	
	public Employee(String employeeName, Integer employeeID, String employeeAddress) {
		this.employeeName = employeeName;
		this.employeeID = employeeID;
		this.employeeAddress = employeeAddress;
	}

	public Integer getEmployeeID() {
		return employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public Account getAccount() {
		return account;
	}
	
//	public void getEmployeeDetails() {
//		System.out.println("Employee Details are ");
//		System.out.println("........................");
//		System.out.println();
//		System.out.println("Employee id : " + employeeID);
//		System.out.println("employee name : " + employeeName);
//		System.out.println("employee address : " + employeeAddress);
//		
//		System.out.println();
//		
//		System.out.println("----------------------------------------------------------");
//		System.out.println();
//		System.out.println("Account Details are ");
//		System.out.println("........................");
//		System.out.println();
//		System.out.println("account name : " + account.getAccountHolderName());
//		System.out.println("account number : " + account.getAccountNum());
//		System.out.println("account address : " + account.getAccountHolderAddress());
//	}

}
