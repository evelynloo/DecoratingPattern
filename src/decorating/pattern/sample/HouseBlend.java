package decorating.pattern.sample;

public class HouseBlend extends Beverage {

  public HouseBlend() {
    description = "House Blend Coffee";
  }
  
	@Override
	public double cost() {
		return 2.10;
	}

}
