public class TestMyPolynomial {
    public static void main(String[] args) {
        // Test Constructors and toString()}
        MyPolynomial poly1 = new MyPolynomial(1.1, 2.2, 3.3, 4.4);
        System.out.println(poly1); // 4.4x^3 + 3.3x^2 + 2.2x + 1.1
        MyPolynomial poly2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
        System.out.println(poly2); // 5.5x^4 + 4.4x^3 + 3.3x^2 + 2.2x + 1.1

        // Test getDegree()
        System.out.println("degree of " + poly1 + " is: " + poly1.getDegree()); // degree of 4.4x^3 + 3.3x^2 + 2.2x + 1.1 is: 3

        // Test evaluate(), add() and multiply()
        System.out.println(poly1.evaluate(2)); // 53.9
        System.out.println(poly1.add(poly2)); // 5.5x^4 + 8.8x^3 + 6.6x^2 + 4.4x + 2.2
        System.out.println(poly1.multiply(poly2)); // 24.2x^7 + 37.51x^6 + 41.14x^5 + 36.3x^4 + 24.2x^3 + 12.1x^2 + 4.84x + 1.21

    }
}
