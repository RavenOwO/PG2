package Playground;

public class Inheritance {
    public static void main(String[] args) {
        SuperClass.staticMethod();          // super
        new SuperClass().staticMethod();    // super
        SubClass.staticMethod();            // sub
        new SubClass().staticMethod();      // sub

        SuperClass ss = new SubClass();
        ss.staticMethod();                  // super, because static method belongs to a class, not to an instance
    }
}

class SuperClass {
    public static void staticMethod() {
        System.out.println("super");
    }
}

class SubClass extends SuperClass {
    public static void staticMethod() {
        System.out.println("sub");
    }
}