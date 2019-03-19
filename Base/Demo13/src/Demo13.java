//包练习
import pack1.Dog;
//import Pack2.Benz;
//import Pack2.Bmw;
import Pack2.*;

public class Demo13 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Dog d = new Dog();
		d.shout();
		
		Bmw bmw = new Bmw("宝马x5","黑色");
		bmw.run();
		
		Benz benz = new Benz("奔驰c200","白色");
		benz.run();
		}
	
	
}
