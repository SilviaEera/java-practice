package manytomany.main;

public class MainCass {
	public static void main(String[] args) {
		
		ShowDetails sd = new ShowDetails();
		Course course1 = new Course( "J1435", "Java Fundamentals", 7000);
		Course course2 = new Course( "P9426", "Python OOP", 7000);
		Course course3 = new Course( "R5241", "Frontend Development with ReactJS", 7000);
		
		Course[] c = new Course[3];
		c[0] = course1;
		c[1] = course2;
		c[2] = course3;
		
		Student s1 = new Student("Srikath", "Calcutta", 4653, c);
		Student s2 = new Student("Chandra", "Delhi", 4653, c);
		Student s3 = new Student("Indra", "Meghaloy", 4653, c);
		
		sd.showStudetnDetails(s1);
		sd.showStudetnDetails(s2);
		sd.showStudetnDetails(s3);
	}
}
