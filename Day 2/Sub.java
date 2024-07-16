class Subjuct {
    private String sName;
    private int sID;
    private int maxMark;
    private int marks;

    public Subjuct(String sName, int sID, int maxMark, int marks) {
        this.sName = sName;
        this.sID = sID;
        this.maxMark = maxMark;
        this.marks = marks;
    }

    public String getName() {
        return sName;
    }

    public int sID() {
        return sID;
    }

    public int maxMark() {
        return maxMark;
    }

    public int marks() {
        return marks;
    }

    public void setMarks(int mark) {
        maxMark = mark;
    }
}

public class Sub {
    public static void main(String[] args) {
        System.out.println("the quick borwn fox jumps over the lazy dog.");
    }
}
