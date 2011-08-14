package decorating.pattern.sample;

public class DarkRoast extends Beverage {
	
  public DarkRoast() {
    description = "Dark Roast Coffee";
  }

	@Override
	public double cost() {
	  if (getSize() == Size.GRANDE) {
	    return 2.20;
	  }
	  if (getSize() == Size.VENTI) {
	    return 2.50;
	  }
    return 1.99;
	}

}
