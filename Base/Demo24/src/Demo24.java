//卖票
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
				System.out.println(this.getName()+"买到了第"+(51-i)+"张票。");
				i--;
				}else {
					System.out.println("卖完了");
					break;
				} 
				
			}
		}

		
	}
}
	

public class Demo24 {
	public static void main(String[] args) {
		Ticket t1 = new Ticket("小王");
		Ticket t2 = new Ticket("小张");
		Ticket t3 = new Ticket("小李");
		Ticket t4 = new Ticket("小孙");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
