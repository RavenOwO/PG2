package Week4;

public class Nr3 {

    public static void main(String[] args) {
        Datum d1 = new Datum(23, 3, 2018),
                d2 = new Datum("24/12/2018");

        int tage = 1000;
        System.out.println(tage + " Tage nach dem " + d1 +
                " ist der: " + Datum.getDatumAfterDays(d1, tage));

    }
}
