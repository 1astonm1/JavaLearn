
public class Father {
	static int x = 1;
	int y = 2;
	
	public void eat() {
		System.out.println("Сͷ�ְֲ��ܳԡ�");
	}
	
	public static void speak() {
		System.out.println("Сͷ�ְ֡�");
	}
}

class Son extends Father{
	static int x = 3;
	int y = 4;
	
	public void eat() {
		System.out.println("��ͷ���Ӻ��ܳԡ�");
	}
	
	public static void speak() {
		System.out.println("��ͷ���ӡ�");
	}
}
