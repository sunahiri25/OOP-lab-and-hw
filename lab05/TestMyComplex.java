public class TestMyComplex {
    public static void main(String[] args) {
        // Test Constructors and toString()
        MyComplex complex1 = new MyComplex(3.1, 2.4);
        System.out.println(complex1); // (3.1+2.4i)
        MyComplex complex2 = new MyComplex();
        System.out.println(complex2); // (0.0+0.0i)

        // Test Getters and Setters
        complex2.setValue(0, 4.3);
        System.out.println(complex2); // (0.0+4.3i)
        System.out.println("real is: " + complex2.getReal()); // real is: 0.0
        System.out.println("imaginary is: " + complex2.getImag()); // imaginary is: 4.3

        // Test isReal(), isImaginary(), equals()
        System.out.println(complex1.isReal()); // false
        System.out.println(complex2.isImaginary()); // true
        System.out.println(complex1.equals(3.1, 2.4)); // true
        System.out.println(complex1.equals(complex2)); // false

        // Test magnitude()
        System.out.println("the magnitude of " + complex1 + " is: " + complex1.magnitude()); // the magnitude of (3.1+2.4i) is: 3.920459156782532

        // Test add(), addNew(), subtract(). subtractNew(), multiply() and divide()
        System.out.println(complex1.addNew(complex2)); // (3.1+6.699999999999999i)
        System.out.println(complex1.add(complex2)); // (3.1+6.699999999999999i)
        System.out.println(complex1.subtractNew(complex2)); // (3.1+2.3999999999999995i)
        System.out.println(complex1.subtract(complex2)); // (3.1+2.3999999999999995i)
        System.out.println(complex1.multiply(complex2)); // (-10.319999999999997+13.33i)
        System.out.println(complex1.divide(complex2)); // (3.1+2.3999999999999995i)

        // Test conjugate
        System.out.println(complex1.conjugate()); // (3.1-2.3999999999999995i)
    }
}
