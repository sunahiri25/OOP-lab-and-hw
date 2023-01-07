public class TestMyRectangle {
    public static void main(String[] args) {
        // Test Constructors and toString()
        MyRectangle triangle1 = new MyRectangle(0, 5, 3, 0);
        System.out.println(triangle1);
        MyRectangle triangle2 = new MyRectangle(new MyPoint(-4, 2), new MyPoint(3, -5));
        System.out.println(triangle2);

        // Test Setters and Getters
        triangle1.setV1(new MyPoint(-1, 2));
        System.out.println(triangle1);
        System.out.println("bottom-right corner is: " + triangle1.getV2());
    }
}
