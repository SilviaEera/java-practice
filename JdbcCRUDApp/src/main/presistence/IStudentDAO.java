package main.presistence;

import main.dto.Student;

public interface IStudentDAO {
	
	
//	operations to implement
	public String addStudent(String sName, Integer sAge, String sAddress);
	
	public Student searchStudent(Integer sId);
	
	public String updateStudent(Integer sId, String sName, Integer sAge, String sAddress);
	
	public String deleteStudent(Integer sId);
}
