//捕获异常练习
public class Demo10 {
	
	public static void main(String[] args) {
//		Throwable able = new Throwable("想吐。。。");
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
			System.out.println("数组的长度："+arr.length);
		}catch(ArithmeticException e){
			System.out.println("异常处理了！");
			System.out.println("toString:"+e.toString());
		}catch(NullPointerException e) {
			System.out.println("出现了空指针异常!");
		}
		
		
		System.out.println("c:"+c);
	}
}
