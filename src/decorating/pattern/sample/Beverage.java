package decorating.pattern.sample;

public abstract class Beverage {
	
	String description = "Unknown Beverage";
	Size size = Size.TALL;
	
	public String getDescription() {
		return description;
	}
	
	public Size getSize() {
	  return size;
	}
	
	public void setSize(Size s) {
	  size = s;
	}
	
	public abstract double cost();

}
