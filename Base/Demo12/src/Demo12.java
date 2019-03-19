//自定义异常类

class NoIpException extends Exception{
	public NoIpException() {
		
	}
	
	public NoIpException(String message) {
		super(message);
	}
}

public class Demo12 {
	public static void main(String[] args) {
		String IP = "202.196.190.1";
		IP = null;
		try {
			test(IP);
		}catch(NoIpException e) {
			System.out.println("插上网线");
		}
		
	}
	
	public static void test(String IP) throws NoIpException{
		if (IP == null) {
			System.out.println("没插网线");
			throw new NoIpException();
		}
		System.out.println("正在显示好友列表！");
	}
}