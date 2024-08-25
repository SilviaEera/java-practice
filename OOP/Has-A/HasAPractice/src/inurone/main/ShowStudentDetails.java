package inurone.main;

public class ShowStudentDetails {
	public void showDetails(Student s){
		System.out.println("Student name : " + s.getStudentName());
		System.out.println("Student id : " + s.getStudentId());
		System.out.println("Student address : " + s.getStudentAddress());
		System.out.println("Batch enrolled : " + s.getBatch());
		System.out.println();
	}
}
