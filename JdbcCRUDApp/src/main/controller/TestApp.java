package main.controller;

import java.util.Scanner;

import main.dto.Student;
import main.service.IStudentService;
import main.servicefactory.StudentServiceFactory;

public class TestApp {
	public static void main(String[] args) {
		
		IStudentService studentService = StudentServiceFactory.getStudentService();
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an id :: ");
		Integer id = sc.nextInt();
		
		
		Student std = studentService.searchStudent(id);
		
		if(std!=null) {
			System.out.println(std);
			
			System.out.println("ID\tName\tAge\tAddress");
			
			System.out.println(std.getsId() + "\t" + std.getsName() + "\t" + std.getsAge() + "\t" + std.getsAddress());
		} else {
			System.out.println("Record not found for id " + id);
		}
		
		
//		String msg = studentService.addStudent("Kogami", 26, "Yokohama, Japan");
//		
//		
//		if(msg.equalsIgnoreCase("success")) {
//			System.out.println("Record update successfully");
//		} else {
//			System.out.println("Record update failed.");
//		}
	}

}
