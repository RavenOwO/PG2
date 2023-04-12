package Week3;

public class Nr2 {

    public static void main(String[] args) {
        trafficLight trafficLight1 = new trafficLight("Friedenstr.");
        trafficLight trafficLight2 = new trafficLight("Universitätsstr.", trafficLight1);
        for (int i = 1; i <= 5; i++) {
            System.out.println(trafficLight1 + "\t\t" + trafficLight2);
            trafficLight1.next();
            trafficLight2.next();
        }
    }
}