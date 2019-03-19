
public abstract class MyShape {
	
	public abstract double getArea();
	
	public abstract double getLen();
}

class Rect extends MyShape{
	double width;
	double height;
	public Rect() {
		
	}
	
	public Rect(double width,double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		double x;
		x = width*height;
		return x;
	}

	public double getLen() {
		double x;
		x = 2*(width*height);
		return x;
	}
}

class Circle extends MyShape{
	
	final double pi = 3.14;
	double r;
	
	public Circle() {
		
	}
	
	public Circle(double r) {
		this.r = r;
	}
	
	public double getArea() {
		double x;
		x = (pi*r*r);
		return x;
	}
	
	public double getLen() {
		double x;
		x = 2*pi*r;
		return x;
	}


}

