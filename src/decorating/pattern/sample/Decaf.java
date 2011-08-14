package decorating.pattern.sample;

public class Decaf extends Beverage {

  public Decaf() {
    description = "Decaf coffee";
  }
  
	@Override
	public double cost() {
	  if (getSize() == Size.GRANDE) {
	    return 1.90;
	  }
	  if (getSize() == Size.VENTI) {
	    return 2.20;
	  }
		return 1.60;
	}

}
