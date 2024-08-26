package manytomany.main;

public class Course {
	private String courseId;
	private String courseName;
	private Integer courseCost;
	public Course(String courseId, String courseName, Integer courseCost) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseCost = courseCost;
	}
	public String getCourseId() {
		return courseId; 
	}
	public String getCourseName() {
		return courseName;
	}
	public Integer getCourseCost() {
		return courseCost;
	}
	
	
}
