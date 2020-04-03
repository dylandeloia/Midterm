package pkgShape;

public class Circle extends Shape implements Comparable{
	
	//For this class I could not get the exception to work
	
	private double Radius;
	
	public Circle(double Radius){
		this.Radius = Radius;
		}
	
	public double Area() //throws Exception
	{
		//if(this.Radius>0)
			return Math.PI*this.Radius*this.Radius;
		//else
			//throw new Exception;
	}
	
	protected double getRadius() {
		return Radius;
	}
	
	protected void setRadius(double Radius) {
		this.Radius = Radius;
		
	}
	
	public int compareTo(Object o) {
		Circle a=(Circle)o;
		//try {
		if(this.Area()>a.Area())
			{
			return 1;
			}
			else if(this.Area()<a.Area())
			{
			return -1;
			}
			else
			{
			return 0;
			}
		//}
		//catch (Exception e) {
			//e.printStackTrace();
		//}

		}
	}