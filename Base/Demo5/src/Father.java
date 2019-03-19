
public class Father {
	static int x = 1;
	int y = 2;
	
	public void eat() {
		System.out.println("小头爸爸不能吃。");
	}
	
	public static void speak() {
		System.out.println("小头爸爸。");
	}
}

class Son extends Father{
	static int x = 3;
	int y = 4;
	
	public void eat() {
		System.out.println("大头儿子很能吃。");
	}
	
	public static void speak() {
		System.out.println("大头儿子。");
	}
}
