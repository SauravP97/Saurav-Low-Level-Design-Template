package strategy.graphics;

public class AmdRadeon implements GraphicsCard {
    @Override
    public void installGraphicsCard() {
        System.out.println("Installing AMD Radeon graphics card");
    }
}