package Week5.Chess;

import java.util.Arrays;

public class Schachspiel {
    private static final Schachfigur[][] Spielfeld = new Schachfigur[8][8];

    public static void main(String[] args) {
        Schachspiel partie = new Schachspiel();
        System.out.println(partie);
        partie.ziehe("e2-e4"); partie.ziehe("e7-e5");
        partie.ziehe("Sg1-f3"); partie.ziehe("sb8-c6");
        partie.ziehe("Lf1-c4"); partie.ziehe("lf8-c5");
        System.out.println(partie);
    }

    //constructor of the chess game fills the array with the starting set of figures
    public Schachspiel() {
        Spielfeld[0][0] = new Schachfigur(Figur.Turm, Farbe.Schwarz);
        Spielfeld[0][1] = new Schachfigur(Figur.Springer, Farbe.Schwarz);
        Spielfeld[0][2] = new Schachfigur(Figur.Läufer, Farbe.Schwarz);
        Spielfeld[0][3] = new Schachfigur(Figur.Dame, Farbe.Schwarz);
        Spielfeld[0][4] = new Schachfigur(Figur.König, Farbe.Schwarz);
        Spielfeld[0][5] = new Schachfigur(Figur.Läufer, Farbe.Schwarz);
        Spielfeld[0][6] = new Schachfigur(Figur.Springer, Farbe.Schwarz);
        Spielfeld[0][7] = new Schachfigur(Figur.Turm, Farbe.Schwarz);

        Arrays.fill(Spielfeld[1], new Schachfigur(Figur.Bauer, Farbe.Schwarz));

        for (int i = 2; i < 6; i++) {
            Arrays.fill(Spielfeld[i], null);
        }

        Arrays.fill(Spielfeld[6], new Schachfigur(Figur.Bauer, Farbe.Weiß));

        Spielfeld[7][0] = new Schachfigur(Figur.Turm, Farbe.Weiß);
        Spielfeld[7][1] = new Schachfigur(Figur.Springer, Farbe.Weiß);
        Spielfeld[7][2] = new Schachfigur(Figur.Läufer, Farbe.Weiß);
        Spielfeld[7][3] = new Schachfigur(Figur.Dame, Farbe.Weiß);
        Spielfeld[7][4] = new Schachfigur(Figur.König, Farbe.Weiß);
        Spielfeld[7][5] = new Schachfigur(Figur.Läufer, Farbe.Weiß);
        Spielfeld[7][6] = new Schachfigur(Figur.Springer, Farbe.Weiß);
        Spielfeld[7][7] = new Schachfigur(Figur.Turm, Farbe.Weiß);
    }

    //defines how to display the playing field when invoked by sout()
    public String toString() {
        StringBuilder str = new StringBuilder("""
                    a   b   c   d   e   f   g   h
                  ---------------------------------
                """);

        int count = 8;
        for (Schachfigur[] schachfiguren : Spielfeld) {
            str.append(count);
            for (int j = 0; j < Spielfeld.length; j++) {
                str.append(" | ").append(schachfiguren[j]);
            }
            str.append(" | ").append(count).append("\n");
            count--;
        }

        str.append("""
                  ---------------------------------
                  a   b   c   d   e   f   g   h
                """);

        return str.toString().replaceAll("null", " ");
    }

    //implements the possibility of making a turn, removing the figure from the initial field and creating it anew on the new one
    public void ziehe(String zug) {
        int firstFirstCordInt = 0;
        int firstSecondCordInt = 0;
        int secondFirstCordInt = 0;
        int secondSecondCordInt = 0;
        String firstCord = "";
        String secondCord = "";

        if (zug.matches("\\w\\d-\\w\\d")) {
            firstCord = zug.substring(0, 2);
            secondCord = zug.substring(3, 5);
        } else {
            firstCord = zug.substring(1, 3);
            secondCord = zug.substring(4, 6);
        }

        try {
            firstFirstCordInt = Integer.parseInt(firstCord.substring(1, 2));
            firstFirstCordInt += Spielfeld.length - (firstFirstCordInt * 2); //reverses the order of the given cord

            secondFirstCordInt = Integer.parseInt(secondCord.substring(1, 2));
            secondFirstCordInt += Spielfeld.length - (secondFirstCordInt * 2); //reverses the order of the given cord
        }
        catch (RuntimeException e) {
            e.printStackTrace();
        }

        firstSecondCordInt = firstCord.charAt(0) - 97;
        secondSecondCordInt = secondCord.charAt(0) - 97;

        Spielfeld[secondFirstCordInt][secondSecondCordInt] = Spielfeld[firstFirstCordInt][firstSecondCordInt];
        Spielfeld[firstFirstCordInt][firstSecondCordInt] = null;
    }
}
