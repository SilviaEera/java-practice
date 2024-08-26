package manytomany.main;

public class ShowDetails {
	public void showStudetnDetails(Student s) {
		System.out.println("++++ Student Details ++++");
		System.out.println("Student name : "+s.getStudentName());
		System.out.println("Student ID : "+s.getStudentId());
		System.out.println("Student Address : "+s.getStudentAddress());
		
		
		System.out.println("*****************************************");
		System.out.println("*****************************************");
		System.out.println();
		System.out.println("++++ Course enrolled ++++");
		for(int i =0; i<s.courses.length; i++) {
			System.out.println("Corese name : "+ s.courses[i].getCourseName());
			System.out.println("Course ID : "+s.courses[i].getCourseId());
			System.out.println("Course Cost : "+s.courses[i].getCourseCost());
//			System.out.println();
		}
		System.out.println("--------------------------------------");
	}
}
