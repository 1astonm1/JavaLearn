//ͼ�γ�����
public abstract class Figure {
	String name;
	
	public Figure(String name)
	{
		this.name = name;
	}
	
	public abstract void getArea();//�������
	
	public abstract void getGirth();//�����ܳ�
}

//Բ����
class Circle extends Figure{
	
	final double pi = 3.14;
	double r;//�뾶
	public Circle(String name,double r)
	{
		super(name);
		this.r = r;
	}
	
	public void getArea()
	{
		System.out.println(name+"�����Ϊ��"+(pi*r*r));
	}
	
	public void getGirth()
	{
		System.out.println(name+"���ܳ�Ϊ��"+(2*pi*r));
	}
	
}

//������
class Square extends Figure{
	short width;//��
	short length;//��
	
	public Square(String name,short width,short length)
	{
		super(name);
		this.length = length;
		this.width = width;
	}
	
	public void getArea()
	{
		System.out.println(name+"���ε����Ϊ��"+(width*length));
	}
	
	public void getGirth()
	{
		System.out.println(name+"���ε��ܳ�Ϊ��"+(2*(width+length)));
	}
}
