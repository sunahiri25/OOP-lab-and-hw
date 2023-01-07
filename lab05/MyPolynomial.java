public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public double[] getCoeffs() {
        return coeffs;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = getDegree(); i >= 1; i--) {
            str.append(coeffs[i]).append("x^").append(i).append(" + ");
        }
        str.delete(str.length() - 5, str.length() - 3);
        str.append(coeffs[0]);
        return str.toString();
    }

    public double evaluate(double x) {
        double polyValue = 0;
        for (int i = this.getDegree(); i >= 0; i--) {
            polyValue = polyValue * x + this.coeffs[i];
        }
        return polyValue;
    }

    public MyPolynomial add(MyPolynomial right) {
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] addPolyData = new double[maxDegree + 1];

        // add this poly to addPoly
        for (int i = 0; i <= this.getDegree(); i++) {
            addPolyData[i] += this.coeffs[i];
        }

        // add rightPoly to addPoly
        for (int i = 0; i <= right.getDegree(); i++) {
            addPolyData[i] += right.coeffs[i];
        }
        return new MyPolynomial(addPolyData);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int multiPolyDegree = this.getDegree() + right.getDegree() + 1;
        double[] multiPolyData = new double[multiPolyDegree];
        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                multiPolyData[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        return new MyPolynomial(multiPolyData);
    }
}
