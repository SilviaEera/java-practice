class NewRec {
    private int width;
    private int height;

    public void setWidth(int w) {
        width = w;
    }

    public void setHeight(int h) {
        height = h;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int area() {
        return width * height;
    }

    public int primeter() {
        return 2 * (height + width);
    }

    public boolean isSqure() {
        if (height == width) {
            return true;
        } else {
            return false;
        }
    }
}

public class Rec {
    public static void main(String args[]) {

        NewRec rec1 = new NewRec();
        rec1.setHeight(3);
        rec1.setWidth(3);

        System.out.println(rec1.area());
        System.out.println(rec1.primeter());
        System.out.println(rec1.isSqure());

    }
}
