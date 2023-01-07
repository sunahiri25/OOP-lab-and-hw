package lab6;

public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1);
        Shape shape2 = new Shape("blue", false);
        System.out.println(shape2);
        System.out.println(shape2.getColor());
        System.out.println(shape2.isFilled());

        Circle1 circle1 = new Circle1();
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());

        Rectangle rectangle1 = new Rectangle(4, 5);
        System.out.println(rectangle1);
        System.out.println(rectangle1.getWidth());

        Square square1 = new Square(7);
        System.out.println(square1);
        System.out.println(square1.getSize());
        System.out.println(square1.getPerimeter());
    }
}
