package inurone.main;


// to show many to one relationship

//student is the target object in which data will be injected


public class Student {
	private String studentName;
	private String studentAddress;
	private Integer studentId;
	
	Batch batch;

	public Student(String studentName, String studentAddress, int studentId, Batch batch) {
		super();
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentId = studentId;
		this.batch = batch;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public int getStudentId() {
		return studentId;
	}

	public Batch getBatch() {
		return batch;
	}
	
	
	
}
