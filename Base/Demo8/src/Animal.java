
public class Animal {
	String color;
	
	public Animal() {
		
	}
	
	public Animal(String color) {
		this.color = color;
	}
	
	public void run() {
		System.out.println("�ܣ�");
	}
	
}

class Dog extends Animal{
	public Dog() {
		
	}
	
	public Dog(String color) {
		this.color = color;
	}
	
	public void run() {
		System.out.println("������");
	}
	
	public void portectHome() {
		System.out.println("��������");
	}
}

class Fish extends Animal {
	public Fish() {
		
	}
	
	public Fish(String color) {
		this.color = color;
	}
	
	public void run() {
		System.out.println("�����Σ�");
	}
	
	public void swim() {
		System.out.println("�����Σ�");
	}
}

class Bird extends Animal {
	public Bird() {
		
	}
	
	public Bird(String color) {
		this.color = color;
	}
	
	public void run() {
		System.out.println("������");
	}
	
	public void fly() {
		System.out.println("���ڷɣ�");
	}
}
