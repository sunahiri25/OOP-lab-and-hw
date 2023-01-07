public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + real + (imag >= 0 ? "+" : "") + imag + "i)";
    }

    public boolean isReal() {
        return Double.compare(this.imag, 0.0) == 0;
    }

    public boolean isImaginary() {
        return Double.compare(this.real, 0.0) == 0;
    }

    public boolean equals(double real, double imag) {
        return Double.compare(this.real, real) == 0 && Double.compare(this.imag, imag) == 0;
    }

    public boolean equals(MyComplex another) {
        return Double.compare(this.real, another.real) == 0 && Double.compare(this.imag, another.imag) == 0;
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public double argument() {
        return Math.atan2(this.imag, this.real);
    }

    public MyComplex add(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex newComplex = new MyComplex();
        newComplex.setReal(this.real + right.real);
        newComplex.setImag(this.imag + right.imag);
        return newComplex;
    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        MyComplex newComplex = new MyComplex();
        newComplex.setReal(this.real - right.real);
        newComplex.setImag(this.imag - right.imag);
        return newComplex;
    }

    public MyComplex multiply(MyComplex right) {
        double temp = this.real;
        this.real = this.real * right.real - this.imag * right.imag;
        this.imag = temp * right.imag + this.imag * right.real;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        MyComplex temp = new MyComplex(right.real, -right.imag);
        temp.multiply(this);
        this.real = temp.real / (right.real * right.real + right.imag * right.imag);
        this.imag = temp.imag / (right.real * right.real + right.imag * right.imag);
        return this;
    }

    public MyComplex conjugate() {
        this.imag = -this.imag;
        return this;
    }

}
