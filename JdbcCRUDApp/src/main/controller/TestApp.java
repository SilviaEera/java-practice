package main.controller;

import main.service.IStudentService;
import main.servicefactory.StudentServiceFactory;

public class TestApp {
	public static void main(String[] args) {
		
		IStudentService studentService = StudentServiceFactory.getStudentService();
		
		String msg = studentService.updateStudent(4, "Tasnuva Islam", 1, "Frankfurt, Germany");
		
		
		if(msg.equalsIgnoreCase("success")) {
			System.out.println("Record update successfully");
		} else {
			System.out.println("Record update failed.");
		}
	}

}
