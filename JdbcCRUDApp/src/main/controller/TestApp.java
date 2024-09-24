package main.controller;

import main.service.IStudentService;
import main.servicefactory.StudentServiceFactory;

public class TestApp {

	public static void main(String[] args) {
		
		IStudentService studentService = StudentServiceFactory.getStudentService();
		
		String msg = studentService.addStudent("Silvia", 23, "Kaunia 1st Lane, Barisal");
		
		if(msg.equalsIgnoreCase("success")) {
			System.out.println("Record inserted successfully");
		} else {
			System.out.println("Record insertion faild.");
		}
	}

}
