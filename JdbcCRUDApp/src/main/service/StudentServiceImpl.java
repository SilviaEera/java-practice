package main.service;

import main.daofactory.StudentDAOFactory;
import main.dto.Student;
import main.presistence.IStudentDAO;

public class StudentServiceImpl implements IStudentService {
	
	IStudentDAO studentDAO;

	@Override
	public String addStudent(String sName, Integer sAge, String sAddress) {
		 studentDAO = StudentDAOFactory.getStudentDAO();
		return studentDAO.addStudent(sName, sAge, sAddress);
	}

	@Override
	public Student searchStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateStudent(Integer sId, String sName, Integer sAge, String sAddress) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudent() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
