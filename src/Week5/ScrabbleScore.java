package Week5;

public class ScrabbleScore {

    public static void main(String[] args) {
        System.out.format("""
        Scrabble Score FARM: " + %d
        ("Scrabble Score JAVA: " + %d
        ("Scrabble Score nichts: " + %d
        ("Scrabble Score REGENSBURG: " + %d
        ("Scrabble Score XYLOPHONE: " + %d
        """
        , getWordScore("FARM"), getWordScore("JAVA"), getWordScore("nichts"), getWordScore("REGENSBURG"), getWordScore("XYLOPHONE"));
    }

    private static final String zeroPoints = " ";
    private static final String onePoint = "AEILNORSTU";
    private static final String twoPoints = "DG";
    private static final String threePoints = "BCMP";
    private static final String fourPoints = "FHVWY";
    private static final String fivePoints = "K";
    private static final String eightPoints = "JX";
    private static final String tenPoints = "QZ";

    public static int getWordScore(String str) {
        int wordScore = 0;

        for (int i = 0; i < str.length(); i++) {

            if (zeroPoints.indexOf(str.charAt(i)) > -1) {
                /* Nothing happens */
            }
            if (onePoint.indexOf(str.charAt(i)) > -1) {
                wordScore += 1;
            }
            if (twoPoints.indexOf(str.charAt(i)) > -1) {
                wordScore += 2;
            }
            if (threePoints.indexOf(str.charAt(i)) > -1) {
                wordScore += 3;
            }
            if (fourPoints.indexOf(str.charAt(i)) > -1) {
                wordScore += 4;
            }
            if (fivePoints.indexOf(str.charAt(i)) > -1) {
                wordScore += 5;
            }
            if (eightPoints.indexOf(str.charAt(i)) > -1) {
                wordScore += 8;
            }
            if (tenPoints.indexOf(str.charAt(i)) > -1) {
                wordScore += 10;
            }
        }

        return wordScore;
    }
}
