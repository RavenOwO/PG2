package Week3;

public class Nr1 {

    public static void main(String[] args) {
        Greeter g = new Greeter("Buenos Dias");
        g.greet("Ralf");
    }
}

class Greeter {
    String greeting = "Hello";

    public void greet(String person) {
        System.out.println(greeting + " " + person + "!");
    }

    public Greeter (String greeting) {
        this.greeting = greeting;
    }

    public Greeter () {}
}