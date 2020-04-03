package pkgShape;

public class Ellipse extends Circle implements Comparable {
	
	private double MinorRadius;
	
	public Ellipse(double Radius, double MinorRadius) {
		super(Radius);
		this.MinorRadius=MinorRadius;
	}
	
	public double getMinorRadius() {
		return MinorRadius;
	}
	
	public void setMinorRadius(double MinorRadius) {
		this.MinorRadius=MinorRadius;
	}
	
	public double Area() {
		return Math.PI * getRadius() * MinorRadius;
	}
	
	public boolean isCircle() {
		return getRadius()==MinorRadius;
	}
	
	public int compareTo(Object o) {
		Ellipse e=(Ellipse)o;
		if(this.Area()>(e.Area()))
		{
			return 1;
		}
		else if(this.Area()<e.Area())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
