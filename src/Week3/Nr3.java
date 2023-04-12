package Week3;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class Nr3 {

    public static void main(String[] args) {
        circle c = new circle(10);
        System.out.println(c.area());
        System.out.println(c.circumference());
        System.out.println();

        triangle t = new triangle(10, 8, 10);
        System.out.println(t.area());
        System.out.println(t.circumference());
        System.out.println(t.isGleichschenkelig());
        System.out.println(t.isGleichseitig());
    }
}

class circle {
    private double radius = 0;

    double area() {
        return PI * radius * radius;
    }

    double circumference() {
        return 2 * PI * radius;
    }

    public circle(double radius) {
        this.radius = radius;
    }
}

class triangle {
    private double a = 0;
    private double b = 0;
    private double c = 0;

    public triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double area() {
        double halfCircum = this.circumference() / 2;
        return sqrt(halfCircum * (halfCircum - a) * (halfCircum - b) * (halfCircum - c));
    }

    double circumference() {
        return a + b + c;
    }

    boolean isGleichschenkelig() {
        return a == b || b == c || a == c;
    }

    boolean isGleichseitig() {
        return a == b && a == c;
    }
}