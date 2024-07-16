class CalcCylinder {
    public double height;
    public double radius;

    public double lidArea() {
        return Math.PI * (radius * radius);
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double volume() {
        return Math.PI * (radius * radius) * height;
    }
}

public class Cylinder {

    public static void main(String args[]) {
        CalcCylinder newCylinder = new CalcCylinder();

        newCylinder.height = 10;
        newCylinder.radius = 7;

        System.out.println(newCylinder.lidArea());
        System.out.println(newCylinder.surfaceArea());
        System.out.println(newCylinder.volume());
    }

}
