package Playground;

class Lebewesen {
    Lebewesen() {
        System.out.println("Tier");
    }
    public String toString() {
        return "Animal";
    }
}
class Säugetier extends Lebewesen {
    Säugetier() {
        System.out.println( super.toString() );
    }
    public String toString() {
        return "Mammal";
    }
}
class Löwe extends Säugetier {
    public Löwe() {
        this("Leo");
        System.out.println(this);
        System.out.println("Löwe");
    }
    public Löwe(String s) {
        System.out.println(s);
    }
    public String toString() {
        return "Lion";
    }
    public static void main(String[] args) {
        new Löwe();
    }
}