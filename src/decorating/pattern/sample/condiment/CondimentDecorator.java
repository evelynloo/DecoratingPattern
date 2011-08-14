package decorating.pattern.sample.condiment;

import decorating.pattern.sample.Beverage;

public abstract class CondimentDecorator extends Beverage {
  public abstract String getDescription();
}
