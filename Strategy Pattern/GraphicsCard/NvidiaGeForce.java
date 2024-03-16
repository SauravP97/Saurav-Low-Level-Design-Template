package strategy.graphics;

public class NvidiaGeForce implements GraphicsCard {
    @Override
    public void installGraphicsCard() {
        System.out.println("Installing Nvidia GeForce graphics card");
    }
}