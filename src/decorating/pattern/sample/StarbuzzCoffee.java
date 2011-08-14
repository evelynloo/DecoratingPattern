package decorating.pattern.sample;

import decorating.pattern.sample.condiment.Milk;
import decorating.pattern.sample.condiment.Mocha;

public class StarbuzzCoffee {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Beverage beverage = new Espresso();
    System.out.println("Beverage: " + beverage.getDescription() + ", cost: "
        + beverage.cost());

    Beverage beverage2 = new DarkRoast();
    beverage2.setSize(Size.VENTI);
    beverage2 = new Milk(beverage2);
    beverage2 = new Mocha(beverage2);
    beverage2 = new Mocha(beverage2);
    System.out.println("Beverage: " + beverage2.getDescription() + ", cost: "
        + beverage2.cost());

    Beverage beverage3 = new Espresso();
    beverage3.setSize(Size.VENTI);
    beverage3 = new Milk(beverage2);
    beverage3 = new Mocha(beverage2);
    beverage3 = new Mocha(beverage2);
    System.out.println("Beverage: " + beverage3.getDescription() + ", cost: "
        + beverage3.cost());

  }

}
