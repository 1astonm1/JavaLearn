//�Զ����쳣��

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
			System.out.println("��������");
		}
		
	}
	
	public static void test(String IP) throws NoIpException{
		if (IP == null) {
			System.out.println("û������");
			throw new NoIpException();
		}
		System.out.println("������ʾ�����б�");
	}
}