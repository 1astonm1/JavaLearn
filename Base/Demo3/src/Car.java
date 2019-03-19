
public abstract class Car {
	String name;
	String color;
	
	public Car(){
		
	}
	
	public Car(String name,String color) {
		this.name = name;
		this.color = color;
	}
	
	public abstract void run();
}

class Bmw extends Car{
	public Bmw() {
		
	}
	
	public Bmw(String name,String color) {
		super(name,color);
	}
	
	public void run() {
		System.out.println(color+"��"+name+"�������ˣ�");
	}
}

class Benz extends Car{
	public Benz() {
		
	}
	
	public Benz(String name,String color) {
		super(name,color);
	}
	
	public void run() {
		System.out.println(color+"��"+name+"�������ˣ�");
	}
}

class Porsche extends Car {
	public Porsche() {
		
	}
	
	public Porsche(String name,String color) {
		super(name,color);
	}
	
	public void run() {
		System.out.println(color+"��"+name+"�������ˣ�");
	}
}

