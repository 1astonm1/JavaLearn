//����ʱ����ϰ
public class Demo14 {
	
	public static void runTime() {
		long startTime = System.currentTimeMillis();
		code();
		long endTime = System.currentTimeMillis();
		System.out.println("��������ʱ��Ϊ��"+(endTime - startTime));
	}
	
	public static void code() {
		int x = 0;
		for(int i = 0;i < 200000;i++) {
			x+=2;
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		runTime();
	}
	
}


