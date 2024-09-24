package main.daofactory;

import main.presistence.IStudentDAO;
import main.presistence.StudentDAOImpl;

public class StudentDAOFactory {
	private StudentDAOFactory() {
		
	}
	
	private static IStudentDAO studentDAO = null;
	
	public static IStudentDAO getStudentDAO() {
		
		if(studentDAO==null) {
			synchronized (StudentDAOFactory.class) {
				if(studentDAO==null) {
					studentDAO = new StudentDAOImpl();
				}
			}
		}
		
		return studentDAO;
	}
}
