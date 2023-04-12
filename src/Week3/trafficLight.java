package Week3;

enum trafficLightPhase {red, redyellow, green, yellow}

class trafficLight {
    final String streetName;
    trafficLightPhase Phase = trafficLightPhase.red;

    public trafficLight(String streetName) {
        this.streetName = streetName;
    }

    public trafficLight(String streetName, trafficLight trafficLight0) {
        this(streetName);
        this.Phase = trafficLightPhase.values()[(trafficLight0.Phase.ordinal() + 2) % 4];
    }

    public trafficLightPhase getTrafficLightPhase() {
        return this.Phase;
    }

    public void setTrafficLightPhase(trafficLightPhase Phase) {
        this.Phase = Phase;
    }

    public String toString() {
        return streetName + ": " + Phase;
    }

    public void next() {
        Phase = trafficLightPhase.values()[(Phase.ordinal() + 1) % 4];
    }
}