package office.main;

import java.util.ArrayList;

public class OfficeMain {
	public static void main(String[] args) {
		
		ArrayList<Account> al = new ArrayList<>();
		
		Account ac = new Account("Silvia Islam Eera", 91243225, "Nathullabad");
		
		Account ac2 = new Account("Taskia Islam", 43252, "Berlin, Germany");
		
		Account ac3 = new Account("Tasnuva Islam", 643225, "Wartburg, Germany");
//		Injecting account to employee 
//		Constructor injection
		
		al.add(ac);
		
		
		Employee em1 = new Employee("Silvia Islam", 241, "Babuganj, Barisal", ac);
		
		Employee em2 = new Employee("Taskia Islam", 241, "Berlin, Germany", ac2);
		Employee em3 = new Employee("Tasnuva Islam", 241, "Wartburg, Germany", ac3);
		Employee emps[] = new Employee[3];
		emps[0] = em1;
		emps[1] = em2;
		emps[2] = em3;
		
		ITDepartment d = new ITDepartment(2, "CSE", emps);
		
		
		d.getDepartmentDetails();
		
//		em1.getEmployeeDetails();
	}
}
