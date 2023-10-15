package commandpattern.headfirst.device;

public class Light {
    String area;

    public Light(String area) {
        this.area = area;
    }

    public void on() {
        System.out.println(area + " Light is switched On!");
    }

    public void off() {
        System.out.println(area + " Light is switched Off!");
    }
}