
public class Animal {
	String color;
	
	public Animal() {
		
	}
	
	public Animal(String color) {
		this.color = color;
	}
	
	public void run() {
		System.out.println("跑！");
	}
	
}

class Dog extends Animal{
	public Dog() {
		
	}
	
	public Dog(String color) {
		this.color = color;
	}
	
	public void run() {
		System.out.println("狗在跑");
	}
	
	public void portectHome() {
		System.out.println("狗保护家");
	}
}

class Fish extends Animal {
	public Fish() {
		
	}
	
	public Fish(String color) {
		this.color = color;
	}
	
	public void run() {
		System.out.println("鱼在游！");
	}
	
	public void swim() {
		System.out.println("鱼在游！");
	}
}

class Bird extends Animal {
	public Bird() {
		
	}
	
	public Bird(String color) {
		this.color = color;
	}
	
	public void run() {
		System.out.println("鸟在跑");
	}
	
	public void fly() {
		System.out.println("鸟在飞！");
	}
}
