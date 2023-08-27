package decorator.newsletter.classexplosion;

public abstract class Meal {
    String description;

    public String getDescription() {
        return description;
    }

    public abstract double getPrice();
}