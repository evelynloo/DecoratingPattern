package decorating.pattern.sample.condiment;

import decorating.pattern.sample.Beverage;

public class Mocha extends CondimentDecorator {
  Beverage beverage;
  
  public Mocha(Beverage bev) {
    beverage = bev;
  }
  
  @Override
  public String getDescription() {
    return beverage.getDescription() + " plus Mocha";
  }

  @Override
  public double cost() {
    return beverage.cost() + 0.60;
  }

}
