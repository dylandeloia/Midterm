package pkgShape;

public class Ellipsoid extends Ellipse implements Comparable {
	
	private double HeightRadius;
	
	public Ellipsoid(double Radius, double MinorRadius, double HeightRadius) {
		super(Radius,MinorRadius);
		this.HeightRadius=HeightRadius;
	}
	public double Volume() {
		return ((Math.PI*getRadius()*getMinorRadius()*HeightRadius*4)/3);
	}
	
	public int compareTo(Object o)
	   {
	       Ellipsoid u=(Ellipsoid)o;
	       if(this.Volume()>(u.Volume()))
	       {
	           return 1;
	       }
	       else if(this.Volume()<u.Volume())
	       {
	           return -1;
	       }
	       else
	       {
	           return 0;
	       }
	   }
	}