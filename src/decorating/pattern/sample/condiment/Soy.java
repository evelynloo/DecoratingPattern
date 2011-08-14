package decorating.pattern.sample.condiment;

import decorating.pattern.sample.Beverage;

public class Soy extends CondimentDecorator {
  Beverage beverage;
  
  public Soy(Beverage bev) {
    beverage = bev;
  }
  
  @Override
  public String getDescription() {
    return beverage.getDescription() + " plus Soy";
  }

  @Override
  public double cost() {
    return beverage.cost() + 0.70;
  }

}
