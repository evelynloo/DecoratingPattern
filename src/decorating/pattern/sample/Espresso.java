package decorating.pattern.sample;

public class Espresso extends Beverage {

  public Espresso() {
    description = "Espresso Coffee";
  }

  @Override
  public double cost() {
    if (getSize() == Size.GRANDE) {
      return 1.90;
    }
    if (getSize() == Size.VENTI) {
      return 2.20;
    }
    return 1.80;
  }

}
