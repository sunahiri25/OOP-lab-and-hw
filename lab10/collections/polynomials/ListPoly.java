package com.oop.collections.polynomials;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListPoly extends AbstractPoly {
    List<Double> coefficients;

    public ListPoly(double[] coeffs) {
        coefficients = Arrays.stream(coeffs)
                .boxed().collect(Collectors.<Double>toList());
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        return new ListPoly(derive());
    }

    @Override
    public double coefficient(int degree) {
        return coefficients.get(degree);
    }

    @Override
    public double[] coefficients() {
        double[] coeffs = new double[coefficients.size()];
        for (int i = 0; i < coeffs.length; i++) {
            coeffs[i] = coefficients.get(i);
        }
        return coeffs;
    }
}
