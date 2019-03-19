//String·½·¨Á·Ï°
public class Demo19 {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
//		String str4 = new String("hello");
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		
		
		String str5 = "hello world!";
		System.out.println("length:"+str5.length());
		System.out.println("index of:"+str5.indexOf("o"));
		System.out.println("lastIndexof:"+str5.lastIndexOf("l"));
		System.out.println("charat:"+str5.charAt(0));
		System.out.println(str5.toUpperCase());
	}
	
	
}
