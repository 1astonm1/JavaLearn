
public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
//		Animal a = new Dog();
		doSomething(new Dog());
		doSomething(new Fish());
		doSomething(new Bird());
		
	}
	
	public static void doSomething(Animal a){
		if (a instanceof Dog){
			Dog d =(Dog)a;
			d.portectHome();
		}
		else if (a instanceof Bird) {
			Bird b = (Bird)a;
			b.fly();
		}
		else if (a instanceof Fish) {
			Fish f = (Fish)a;
			f.swim();
		}
		else System.out.println("¶¯Îï£¡");
	}

}
