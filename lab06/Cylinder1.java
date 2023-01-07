package lab6;

public class Cylinder1 {
    private Circle base;
    private double height;

    public Cylinder1() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder1(double radius) {
        base = new Circle(radius);
        height = 1.0;
    }

    public Cylinder1(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }

    public Cylinder1(double radius, double height, String color) {
        base = new Circle(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return base.getArea() * height;
    }
}
