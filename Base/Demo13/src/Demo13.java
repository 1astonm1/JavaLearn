//����ϰ
import pack1.Dog;
//import Pack2.Benz;
//import Pack2.Bmw;
import Pack2.*;

public class Demo13 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Dog d = new Dog();
		d.shout();
		
		Bmw bmw = new Bmw("����x5","��ɫ");
		bmw.run();
		
		Benz benz = new Benz("����c200","��ɫ");
		benz.run();
		}
	
	
}
