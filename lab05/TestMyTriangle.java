public class TestMyTriangle {
    public static void main(String[] args) {
        // Test Constructors and toString()
        MyTriangle t1 = new MyTriangle(0, 0, 4, 1, 1, 5);
        System.out.println(t1);
        MyTriangle t2 = new MyTriangle(new MyPoint(0, 0), new MyPoint(0, 2), new MyPoint(2, 0));
        System.out.println(t2);

        // Test getPerimeter() and getType()
        System.out.println(t1 + " is " + t1.getType() + " and has perimeter " + t1.getPerimeter());
        System.out.println(t2 + " is " + t2.getType() + " and has perimeter " + t2.getPerimeter());
    }

}
