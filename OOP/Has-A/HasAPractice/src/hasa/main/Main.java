package hasa.main;
class Student {
	private String name;
	private Integer age;
	private Integer studentId;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Student(String name, Integer age, Integer studentId) {
		super();
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}
	
	
}
public class Main {
	public static void main(String[] args) {
		Student s = new Student("Silvia", 23, 1003);
	}
}
