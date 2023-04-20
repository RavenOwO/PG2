package Week5.Chess;

public class Schachfigur {
    Figur figur;
    Farbe farbe;

    public Schachfigur(Figur figur, Farbe farbe) {
        this.figur = figur;
        this.farbe = farbe;
    }

    public Figur getFigur() {
        return figur;
    }

    public Farbe getFarbe() {
        return farbe;
    }

    public String toString() {
        String str = "";
        switch (figur) {
            case König -> str += "k";
            case Dame -> str += "d";
            case Läufer -> str += "l";
            case Springer -> str += "s";
            case Turm -> str += "t";
            case Bauer -> str += "b";
        }

        if (getFarbe() == Farbe.Weiß) {
            str = str.toUpperCase();
        }

        return str;
    }
}
