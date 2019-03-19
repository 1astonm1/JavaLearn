//Å×³öÒì³£Á·Ï°
public class Demo11 {
	public static void main(String[] args) throws Exception {
		try{
			int[] arr = null;
			div(2,0,arr);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void div(int a,int b,int[] arr) throws Exception,NullPointerException {
		int c = 0;
		if (b == 0) {
			throw new Exception();
		}
		else if (arr == null) {
			throw new NullPointerException();
		}
		c = a/b;
		System.out.println("c:"+c);
	}
}
