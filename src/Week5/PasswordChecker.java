package Week5;

public class PasswordChecker {

    public static void main(String[] args) {

        System.out.println("AxB1&a8c"+" isStrong: "+ PasswordChecker.isStrongPassword("AxB1&a8c"));
        System.out.println("lpassw0rt"+ " isStrong: "+PasswordChecker.isStrongPassword("lpassw0rt"));
        System.out.println("5und7sindNICHT3!"+" isStrong: "+PasswordChecker.isStrongPassword("5und7sindNICHT3!"));
        System.out.println("topSecret"+" isStrong: "+PasswordChecker.isStrongPassword("topSecret"));
        System.out.println("L33t!"+" isStrong: "+PasswordChecker.isStrongPassword("L33t!"));
        System.out.println("som3strangeP4$$word"+ " isStrong: "+PasswordChecker.isStrongPassword("som3strangeP4$$word"));
    }



    public static boolean isStrongPassword(String str) {
        boolean strongPW = true;

        if (str.length() < 8) {
            strongPW = false;
        }
        if (!(str.matches(".+\\w.+\\w.+"))) {
            strongPW = false;
        }
        if (!(str.matches(".+\\d.+\\d.+"))) {
            strongPW = false;
        }
        if (!(str.matches(".+[a-z].+") && str.matches(".+[A-Z].+"))) {
            strongPW = false;
        }
        if (!(str.matches(".+[^a-zA-Z].+"))) {
            strongPW = false;
        }

        return strongPW;
    }
}