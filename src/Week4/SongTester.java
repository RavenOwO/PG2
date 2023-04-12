package Week4;

public class SongTester {

    public static void main(String[] args) {
        String[] pfade = {
                "Songtitel.mp3",
                "D:\\Eigene Musik\\Saenger - Album - Songtitel.mp3",
                "/D/Eigene Musik/Datei.mp3",
                "../Musik/",
                "/Klassiker/Mama, Du musst um Deinen Jungen doch nicht weinen",
                "\\\\server\\share\\mukke\\",
                "",
                "C:\\Benutzer\\Musik\\ESC\\Lena Meyer - Landrut - Satellite.mp3",
                "C:\\Benutzer/Musik/Test\\Max Muster - Toi-toi-toi.mp3"
        };
        String[][] ergebnisse = {
                new String[]{"Songtitel", "", "", "Songtitel.mp3"},
                new String[]{"Songtitel", "Saenger - Album", "/D/Eigene Musik/", "Saenger - Album - Songtitel.mp3"},
                new String[]{"Datei", "", "/D/Eigene Musik/", "Datei.mp3"},
                new String[]{"", "", "../Musik/", ""},
                new String[]{"Mama, Du musst um Deinen Jungen doch nicht weinen", "", "/Klassiker/", "Mama, Du musst um Deinen Jungen doch nicht weinen"},
                new String[]{"", "", "//server/share/mukke/", ""},
                new String[]{"", "", "", ""},
                new String[]{"Satellite", "Lena Meyer - Landrut", "/C/Benutzer/Musik/ESC/", "Lena Meyer - Landrut - Satellite.mp3"},
                new String[]{"Toi-toi-toi", "Max Muster", "/C/Benutzer/Musik/Test/", "Max Muster - Toi-toi-toi.mp3"}
        };
        for(int i=0; i<pfade.length; i++) {
            Song s = new Song(pfade[i]);

            System.out.println("PFAD: \"" + pfade[i] + "\"");
            for(int l=0; l<pfade[i].length() + 8; l++)
                System.out.print("-");
            System.out.println();

            String error = "";
            if(!s.getTitle().equals(ergebnisse[i][0]))
                error = " --> FEHLER!";
            System.out.println("Titel      : " + s.getTitle() + error);

            error = "";
            if(!s.getInterpret().equals(ergebnisse[i][1]))
                error = " --> FEHLER!";
            System.out.println("Interpret  : " + s.getInterpret() + error);

            error = "";
            if(!s.getDirectory().equals(ergebnisse[i][2]))
                error = " --> FEHLER!";
            System.out.println("Verzeichnis: " + s.getDirectory() + error);

            error = "";
            if(!s.getFileName().equals(ergebnisse[i][3]))
                error = " --> FEHLER!";
            System.out.println("Dateiname  : " + s.getFileName() + error);
            System.out.println();
        }
    }

}