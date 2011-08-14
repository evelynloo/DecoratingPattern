package decorating.pattern.sample.condiment;

import decorating.pattern.sample.Beverage;

public class Whip extends CondimentDecorator {
  Beverage beverage;
  
  public Whip(Beverage bev) {
    beverage = bev;
  }
  
  @Override
  public String getDescription() {
    return beverage.getDescription() + " plus Whip";
  }

  @Override
  public double cost() {
    return beverage.cost() + 0.80;
  }

}
