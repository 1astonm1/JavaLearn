//��Ʊ
class Ticket extends Thread{
	static int i=50;
	static Object o = new Object();
	
	public Ticket(String name) {
		super(name);
	}
	
	public void run() {
		while(true) {
			synchronized (o) {
				if(i>0) {
				System.out.println(this.getName()+"���˵�"+(51-i)+"��Ʊ��");
				i--;
				}else {
					System.out.println("������");
					break;
				} 
				
			}
		}

		
	}
}
	

public class Demo24 {
	public static void main(String[] args) {
		Ticket t1 = new Ticket("С��");
		Ticket t2 = new Ticket("С��");
		Ticket t3 = new Ticket("С��");
		Ticket t4 = new Ticket("С��");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
