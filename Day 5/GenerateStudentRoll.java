import java.util.*;

class Student {
    private String rollNo;
    private static int counter = 1;

    private String generateRollNo() {
        Date d = new Date();
        String y = d.toString();
        String cnst = "Trust";

        // String newRollNo = cnst + "" + (d.getYear()+ 1900) + "" + counter;
        return y;
    }
}

public class GenerateStudentRoll {
    public static void main(String[] args) {

        Date t = new Date();
        String yy = t.toString();

        System.out.println(yy);
    }
}
