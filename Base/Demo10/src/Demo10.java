//�����쳣��ϰ
public class Demo10 {
	
	public static void main(String[] args) {
//		Throwable able = new Throwable("���¡�����");
//		
//		System.out.println(able.toString());
//		System.out.println(able.getMessage());
//		able.printStackTrace();
		int[] arr = null;
		div(4,2,arr);
	}
	
	public static void div(int a,int b,int[] arr) {
		int c = 0;
		try {
			c = a/b;
			System.out.println("����ĳ��ȣ�"+arr.length);
		}catch(ArithmeticException e){
			System.out.println("�쳣�����ˣ�");
			System.out.println("toString:"+e.toString());
		}catch(NullPointerException e) {
			System.out.println("�����˿�ָ���쳣!");
		}
		
		
		System.out.println("c:"+c);
	}
}
