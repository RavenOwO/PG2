package Week4;

public class Datum {

    private int tag;
    private int monat;
    private int jahr;

    public Datum(int tag, int monat, int jahr) {
        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;
    }

    public Datum(String datum) {
        String[] input = datum.split("/");
        this.tag = Integer.parseInt(input[0]);
        this.monat = Integer.parseInt(input[1]);
        this.jahr = Integer.parseInt(input[2]);
    }

    public String toString() {
        return String.format("%02d.%02d.%04d", tag, monat, jahr);
    }

    public static int countDaysBetween(Datum von, Datum bis) {
        return Math.abs(von.tag - bis.tag)
            + Math.abs(von.monat - bis.monat) * 30
            + Math.abs(von.jahr - bis.jahr) * 360;
    }

    public int daysUntil(Datum bis) {
        return countDaysBetween(this, bis);
    }

    public static Datum getDatumAfterDays(Datum von, int days) {
        int years = days / 360;
        days -= years * 360;
        int months = days / 30;
        days -= months * 30;

        von.tag += days;
        von.monat += months;
        von.jahr += years;

        if (von.tag > 30) {
            von.tag -= 30;
            von.monat++;
        }
        if (von.monat > 12) {
            von.monat -= 12;
            von.jahr++;
        }
        return von;
    }
}
