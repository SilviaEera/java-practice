package inurone.main;

public class MainClass {
	public static void main(String[] args) {
		ShowStudentDetails ssd = new ShowStudentDetails();
		Batch batch1 = new Batch("Sreshtha", 101);
		Batch batch2 = new Batch("Revelution", 464);
		Batch batch3 = new Batch("Onlo", 201);
		Student s1 = new Student("Yuna", "Spira Island", 30221, batch1);
		Student s2 = new Student("Tidus", "Zanarakand", 42512, batch1);
		Student s3 = new Student("Sora", "Kingdom Hearts II", 72325, batch2);
		Student s4 = new Student("Himari", "Momochi Household", 65463, batch2);
		Student s5 = new Student("Yuuki Anzai", "Onlo research center", 85533, batch3);
		
		ssd.showDetails(s1);
		ssd.showDetails(s2);
		ssd.showDetails(s3);
		ssd.showDetails(s4);
		ssd.showDetails(s5);
		
	}
}
