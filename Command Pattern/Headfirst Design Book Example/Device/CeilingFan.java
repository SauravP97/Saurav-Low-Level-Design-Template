package commandpattern.headfirst.device;

public class CeilingFan {
    public static enum SPEED {
        OFF,
        LOW,
        MEDIUM,
        HIGH,
    }

    private String location;
    private SPEED currentSpeed;

    public CeilingFan(String location) {
        this.location = location;
        currentSpeed = SPEED.OFF;
    }

    public void high() {
        currentSpeed = SPEED.HIGH;
        System.out.println(location + " Fan's speed set to High");
    }

    public void medium() {
        currentSpeed = SPEED.MEDIUM;
        System.out.println(location + " Fan's speed set to Medium");
    }

    public void low() {
        currentSpeed = SPEED.LOW;
        System.out.println(location + " Fan's speed set to Low");
    }

    public void off() {
        currentSpeed = SPEED.OFF;
        System.out.println(location + " Fan is switched Off!");
    }

    public SPEED getSpeed() {
        return currentSpeed;
    }
}
