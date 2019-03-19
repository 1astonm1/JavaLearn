//图形抽象类
public abstract class Figure {
	String name;
	
	public Figure(String name)
	{
		this.name = name;
	}
	
	public abstract void getArea();//计算面积
	
	public abstract void getGirth();//计算周长
}

//圆形类
class Circle extends Figure{
	
	final double pi = 3.14;
	double r;//半径
	public Circle(String name,double r)
	{
		super(name);
		this.r = r;
	}
	
	public void getArea()
	{
		System.out.println(name+"的面积为："+(pi*r*r));
	}
	
	public void getGirth()
	{
		System.out.println(name+"的周长为："+(2*pi*r));
	}
	
}

//矩形类
class Square extends Figure{
	short width;//宽
	short length;//长
	
	public Square(String name,short width,short length)
	{
		super(name);
		this.length = length;
		this.width = width;
	}
	
	public void getArea()
	{
		System.out.println(name+"矩形的面积为："+(width*length));
	}
	
	public void getGirth()
	{
		System.out.println(name+"矩形的周长为："+(2*(width+length)));
	}
}
