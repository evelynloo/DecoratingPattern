package decorating.pattern.sample.condiment;

import decorating.pattern.sample.Beverage;

public class Milk extends CondimentDecorator {
  Beverage beverage;
  
  public Milk(Beverage bev) {
    beverage = bev;
  }
  
  @Override
  public String getDescription() {
    return beverage.getDescription() + " plus Milk";
  }

  @Override
  public double cost() {
    return beverage.cost() + 0.50;
  }

}
