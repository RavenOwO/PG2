package Week4;

import java.util.Arrays;

public class Polynom {
    double[] factors;

    public Polynom(double... factors) {
        this.factors = factors;
    }

    //b)
    public int getGrad() {
        return factors.length - 1;
    }

    //c)
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < factors.length; i++) {
            if (Math.signum(factors[i]) == 1 || Math.signum(factors[i]) == 0) {
                strBuilder.append("+");
            }

            if ((factors.length - (i + 1)) > 1) {
                strBuilder.append(factors[i]).append("x^").append(factors.length - (i + 1)).append(" ");
            } else if ((factors.length - (i + 1) == 1)) {
                strBuilder.append(factors[i]).append("x").append(" ");
            } else {
                strBuilder.append(factors[i]).append(" ");
            }
        }

        String polyToString = strBuilder.toString();
        polyToString = polyToString.substring(1, polyToString.length()-1);
        return "f(x) = " + polyToString;
    }

    //d)
    public void addiere(Polynom add) {
        for (int i = 0; i < factors.length; i++) {
            this.factors[i] += add.factors[i];
        }
    }

    //e)
    public Polynom ableiten() {
        double[] values = Arrays.copyOf(factors, factors.length - 1);
        for (int i = 0; i < values.length; i++) {
            values[i] = values[i] * (values.length - i);
        }
        return new Polynom(values);
    }
}
