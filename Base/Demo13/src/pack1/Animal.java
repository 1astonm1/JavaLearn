package pack1;

public abstract class Animal {
	String name;
	String kinds;
	
	public Animal() {
		
	}
	
	public Animal(String name,String kinds) {
		this.name = name;
		this.kinds = kinds;
	}
	
	
	public abstract void shout();
}



