package decorator.newsletter.alternateimpl;

public class Meal {
    String description;
    double price;

    private boolean cheese;
    private boolean veggies;
    private boolean chips;
    private boolean sauce;

    public String getDescription() {
        if (cheese) {
            description += ", Cheese";
        }
        if (veggies) {
            description += ", Veggies";
        }
        if (chips) {
            description += ", Chips";
        }
        if (sauce) {
            description += ", Sauce";
        }
        return description;
    }

    public double getPrice() {
        if (cheese) {
            price += 20.0;
        }
        if (veggies) {
            price += 15.0;
        }
        if (chips) {
            price += 10.0;
        }
        if (sauce) {
            price += 8.0;
        }
        return price;
    }

    public void putCheese() {
        cheese = true;
    }

    public void putVeggies() {
        veggies = true;
    }

    public void putChips() {
        chips = true;
    }

    public void putSauce() {
        sauce = true;
    }
}