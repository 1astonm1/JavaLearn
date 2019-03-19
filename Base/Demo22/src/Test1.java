
public class Test1 extends Thread{
	
	public Test1(String name) {
		super(name);
	}
	public void run() {
		print();
	}
	
	public void print() {
		for(int i=0;i<10;i++) {
			try {
				this.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.getName()+":"+i);
		}
		
	}

}
