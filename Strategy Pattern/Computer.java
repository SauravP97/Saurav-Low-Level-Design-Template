package strategy;

import strategy.chipset.Chipset;
import strategy.graphics.GraphicsCard;

public abstract class Computer {
  private Chipset chipset;
  private GraphicsCard graphicsCard;

  public Computer(Chipset chipset, GraphicsCard graphicsCard) {
      this.chipset = chipset;
      this.graphicsCard = graphicsCard;
      configure();
  }

  private void configure() {
      System.out.println();
      System.out.println("Configuring the computer...");
      this.chipset.installChipset();
      this.graphicsCard.installGraphicsCard();
      System.out.println("Success!");
      System.out.println();
  }

  public abstract void display();

  public abstract void powerOn();

  public abstract void powerOff();
}