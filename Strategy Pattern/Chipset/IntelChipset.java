package strategy.chipset;

public class IntelChipset implements Chipset {
    @Override
    public void installChipset() {
        System.out.println("Installing Intel Chipset");
    }
}