package Pack2;

public abstract class Car {
	String name;
	String color;
	
	public Car() {
		
	}
	
	public Car(String name,String color) {
		this.name = name;
		this.color = color;
	}
	
	public abstract void run();
}








