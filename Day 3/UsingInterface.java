interface Student {
    void personalDetails(String studentName, String city, int age);

    void studentDetails(String university, String depeartment, String semester, float cgpa);
}

class StudentCls implements Student {
    String university;
    float cgpa;
    String department;
    String semester;
    String studentName;
    String city;
    int age;

    @Override
    public void studentDetails(String university, String depeartment, String semester, float cgpa) {
        this.university = university;
        this.department = depeartment;
        this.cgpa = cgpa;
        this.semester = semester;
    }

    @Override
    public void personalDetails(String studentName, String city, int age) {
        this.age = age;
        this.studentName = studentName;
        this.city = city;
    }

    public void printStudentDetails() {
        System.out.println(university + " " + department + " " + cgpa + " " + semester);
    }

    public void printPersonalDetails() {
        System.out.println(studentName + " " + city + " " + age);
    }

}

public class UsingInterface {
    public static void main(String args[]) {
        StudentCls studentOne = new StudentCls();

        studentOne.studentDetails("Trust University", "Computer Science and Engineering", "Spring-21", 3.89f);
        studentOne.personalDetails("Silvia", "Barishal", 23);
        studentOne.printPersonalDetails();
        studentOne.printStudentDetails();

    }
}
