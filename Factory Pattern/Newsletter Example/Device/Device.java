package factory.newsletter.device;

public abstract class Device {
    protected String name;

    public String getName() {
        return name;
    }

    public abstract void viewConfiguration();

    public void box() {
        System.out.println("Boxing the " + this.name + "...");
    }

    public void ship() {
        System.out.println("Shipping the " + this.name + "...");
    }
}