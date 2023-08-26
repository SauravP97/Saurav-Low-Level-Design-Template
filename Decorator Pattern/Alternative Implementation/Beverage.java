package decorator.alternate;

public class Beverage {
    private boolean mocha;
    private boolean soy;
    private boolean steamedMilk;
    private boolean whip;
    String description;
    double cost;

    public String getDescription() {
        if (mocha) {
            description += ", Mocha";
        }
        if (soy) {
            description += ", Soy";;
        }
        if (whip) {
            description += ", Whip";;
        }
        if (steamedMilk) {
            description += ", Steamed Milk";;
        }
        return description;
    }

    public double cost() {
        if (mocha) {
            cost += 0.20;
        }
        if (soy) {
            cost += 0.15;
        }
        if (whip) {
            cost += 0.10;
        }
        if (steamedMilk) {
            cost += 0.10;
        }
        return cost;
    }

    public void setMocha() {
        mocha = true;
    }

    public void setSoy() {
        soy = true;
    }

    public void setWhip() {
        whip = true;
    }

    public void setSteamedMilk() {
        steamedMilk = true;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public boolean hasSoy() {
        return soy;
    }

    public boolean hasWhip() {
        return whip;
    }

    public boolean hasSteamedMilk() {
        return steamedMilk;
    }
}
