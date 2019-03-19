package Pack2;

public class Benz extends Car{
	public Benz() {
		
	}
	public Benz(String name,String color) {
		super(name,color);
	}
	public void run(){
		System.out.println(name+"跑起来了");
	}
	protected static void benzVip() {		//测试protected
		System.out.println("我是奔驰vip!");
	}
}