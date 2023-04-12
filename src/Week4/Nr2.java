package Week4;

public class Nr2 {

    public static void main(String[] args) {
        double[] array = new double[] {9, 1, 7, -3.8};
        //double[] array2 = new double[] {9, 1, 7, -3.8};

        Polynom poly = new Polynom(array);
        //Polynom poly2 = new Polynom(array2);

        //poly.addiere(poly2);
        System.out.println(poly);
        System.out.println(poly.ableiten());
    }
}