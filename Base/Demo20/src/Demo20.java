//取出头尾的空格
//字符串顺序调换

public class Demo20 {
	public static void main(String[] args) {
		String str = "   helloworld!   ";
		str = trim(str);
		System.out.println(str);
		str = reaverseString(str);
		System.out.println(str);
	}
	
	public static String trim(String str) {
		int start = 0;
		int end = str.length();
		
		for (int i=0;i<str.length();i++) {
			if(str.charAt(i) == ' ') {
				start++;
			}
			else break;
		}
		
		for(int i = start;i<str.length();i++) {
			if(str.charAt(i) == ' ') {
				end--;
			}else continue;
		}
		
		if (start<end) {
			return str.substring(start,end);
		}else return str;
	}
	
	public static String reaverseString(String str) {
		char[] chs = str.toCharArray();
		int start = 0;
		int end = chs.length;
		char temp = ' ';
		for(start=0,end=chs.length-1;start<end;start++,end--) {
			temp = chs[start];
			chs[start] = chs[end];
			chs[end] = temp;
		}
		
		return new String(chs);
	}
}
