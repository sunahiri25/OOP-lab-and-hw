public class Rectangle1 implements GeometricObject {
    private double width;
    private double length;

    public Rectangle1(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle1[width = " + width + ", length = " + length + "]";
    }

    @Override
    public double getPerimeter() {
        return this.width * this.length;
    }

    @Override
    public double getArea() {
        return 2 * (this.width + this.length);
    }
}
