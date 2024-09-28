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
	public Student searchStudent(Integer sId) {
		stdDAO = StudentDAOFactory.getStudentDAO();
		
		return stdDAO.searchStudent(sId);
	}

	@Override
	public String updateStudent(Integer sId, String sName, Integer sAge, String sAddress) {
		stdDAO = StudentDAOFactory.getStudentDAO();
		if(stdDAO!=null) {
			return stdDAO.updateStudent(sId, sName, sAge, sAddress);
		} else {
			return "failed";
		}
	}

	@Override
	public String deleteStudent(Integer  sId) {
		stdDAO = StudentDAOFactory.getStudentDAO();
		
		if(stdDAO!=null) {
			return stdDAO.deleteStudent(sId);
		} else {
			return "failed";
		}
	}
	
}
