package main.service;

import main.daofactory.StudentDAOFactory;
import main.dto.Student;
import main.presistence.IStudentDAO;
import main.servicefactory.StudentServiceFactory;

public class StudentServiceImpl implements IStudentService {
	
	IStudentDAO stdDAO;

	@Override
	public String addStudent(String sName, Integer sAge, String sAddress) {
		stdDAO = StudentDAOFactory.getStudentDAO();
		 
		 if(stdDAO!=null) {
			 return stdDAO.addStudent(sName, sAge, sAddress);
		 } else {
			 return "Failed ";
		 }
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
