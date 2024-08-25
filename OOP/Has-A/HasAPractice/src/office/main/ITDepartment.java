package office.main;

//target object  
public class ITDepartment {
	private Integer departmentCode;
	private String departmentName;
	Employee[] employeeList;
	public ITDepartment(Integer departmentCode, String departmentName, Employee[] employeeList) {
		super();
		this.departmentCode = departmentCode;
		this.departmentName = departmentName;
		this.employeeList = employeeList;
	}
	
	public void getDepartmentDetails() {
		System.out.println("Department Details : ");
		
		System.out.println("department code : " + departmentCode) ;
		System.out.println("department name : "+ departmentName);
		System.out.println();
		System.out.println("employees detail : " );
		
		for(Employee employee:employeeList) {
			System.out.println("employee name : " + employee.getEmployeeName());
			System.out.println("employee id : " + employee.getEmployeeID());
			System.out.println("employee address : "+ employee.getEmployeeAddress());
			
		}
	}

	
}
