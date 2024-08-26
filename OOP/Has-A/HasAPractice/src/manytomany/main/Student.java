package manytomany.main;

// to show many to many relationship

public class Student {
	private String studentName;
	private String studentAddress;
	private Integer studentId;
	Course[] courses;

	public Student(String studentName, String studentAddress, Integer studentId, Course[] courses) {
		super();
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentId = studentId;
		this.courses = courses;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public Integer getStudentId() {
		return studentId;
	}
	
	
//	public void showStudentDetails() {
//		System.out.println("++++ Student Details ++++");
//		System.out.println("Student name : " + getStudentName());
//		System.out.println("Student Address : " + getStudentAddress());
//		System.out.println("Student ID : " + getStudentId());
//	}
}
