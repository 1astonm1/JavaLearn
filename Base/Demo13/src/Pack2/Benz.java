package Pack2;

public class Benz extends Car{
	public Benz() {
		
	}
	public Benz(String name,String color) {
		super(name,color);
	}
	public void run(){
		System.out.println(name+"��������");
	}
	protected static void benzVip() {		//����protected
		System.out.println("���Ǳ���vip!");
	}
}