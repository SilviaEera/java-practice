package main.servicefactory;

import main.service.IStudentService;
import main.service.StudentServiceImpl;


//	Abstraction logic of implementation.
public class StudentServiceFactory {

//	constructor is made private to prevent object creation/instantiation 
	private StudentServiceFactory() {
		
	} 
	
	public static IStudentService studentService = null;
	
	public static IStudentService getStudentService() {
	
		if(studentService==null) {
			synchronized (StudentServiceFactory.class) {
				if(studentService==null) {
					studentService = new StudentServiceImpl();
				}
			}
		}
		
		return studentService;
	}
}
