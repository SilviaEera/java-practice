class StudentTemp {
    public int roll;
    public String name;
    public String course;
    public double m1, m2, m3;

    public double totalMark() {
        return m1 + m2 + m3;
    }

    public double avarage() {
        return (m1 + m2 + m3) / 3;
    }

    public String grade() {
        if (totalMark() > 80) {
            return "A+";
        } else if (totalMark() < 80 && totalMark() > 70) {
            return "A";
        } else {
            return "F";
        }
    }
}

public class Student {
    public static void main(String args[]) {
        StudentTemp studnet1 = new StudentTemp();

        studnet1.roll = 1002;
        studnet1.name = "Mehedi";
        studnet1.course = "EEE";

        studnet1.m1 = 85;
        studnet1.m2 = 80;
        studnet1.m2 = 83.5;

        System.out.println(studnet1.totalMark());
        ;
        System.out.println(studnet1.avarage());
        ;
        System.out.println(studnet1.grade());
    }
}
