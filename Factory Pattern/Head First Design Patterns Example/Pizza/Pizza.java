package factory.headfirst.pizza;

public abstract class Pizza {
    protected String name;

    public void prepare() {
        System.out.println("Preparing " + this.name + "...");
    }
    
    public void bake() {
        System.out.println("Baking " + this.name + "...");
    }

    public void cut() {
        System.out.println("Cutting " + this.name + " into slices...");
    }

    public void box() {
        System.out.println("Boxing your " + this.name + "...");
    }

    public String getName() {
        return name;
    }

    public abstract void setName();
}