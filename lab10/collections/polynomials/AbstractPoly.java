package com.oop.collections.polynomials;

import java.util.Objects;

public abstract class AbstractPoly implements Poly {
    public AbstractPoly() {
    }

    double[] derive() {
        if (degree() == 0) {
            return new double[]{0};
        }
        double[] derivePoly = new double[degree()];
        for (int i = 0; i < degree(); i++) {
            derivePoly[i] = coefficient(i + 1) * (i + 1);
        }
        return derivePoly;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof AbstractPoly)) {
            return false;
        }
        if (degree() != ((AbstractPoly) o).degree()) {
            return false;
        }
        for (int i = 0; i < degree(); i++) {
            if (coefficient(i) != ((AbstractPoly) o).coefficient(i)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return (Objects.hashCode(coefficients()));
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Poly[");
        for (int i = 0; i <= degree(); i++) {
            if (coefficient(i) != 0) {
                if (i == 0) {
                    s.append(coefficient(i));
                } else {
                    if (s.charAt(s.length() - 1) != '[') {
                        if (coefficient(i) > 0) {
                            s.append(" + ");
                        } else {
                            s.append(" - ");
                        }
                    }
                    s.append(Math.abs(coefficient(i))).append(" * ");
                    if (i == 1) {
                        s.append("x");
                    } else {
                        s.append("x^").append(i);
                    }
                }
            }
        }
        s.append(']');
        return s.toString();
    }
}
