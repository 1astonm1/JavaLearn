//常用线程方法
class ThreadDemo1 extends Thread{
	public ThreadDemo1() {
		
	}
	
	public ThreadDemo1(String name) {
		super(name);
	}
	
	public void run() {
		int i = 0;
		while (i<30) {
			System.out.println(this.getName()+" "+":i"+i);
			System.out.println(Thread.currentThread().getName()+" "+":i"+i);
			System.out.println( Thread.currentThread() == this );
			System.out.println( "getId()" + " "+ " : id = " + super.getId() );
			System.out.println( "getPriority()" + " "+ " : Priority = " + super.getPriority() );
			i++;
		}
	}
}



public class Demo23 {
	public static void main(String[] args) {
		ThreadDemo1 th1 = new ThreadDemo1("线程1");
		ThreadDemo1 th2 = new ThreadDemo1("线程2");
		//设置线程名
		th1.setName("th1");
		th2.setName("th2");
		//设置优先级
		th1.setPriority(10);
		th2.setPriority(7);
		
		System.out.println("MAX:"+Thread.MAX_PRIORITY);
		System.out.println("MIN:"+Thread.MIN_PRIORITY);
		System.out.println("NOR:"+Thread.NORM_PRIORITY);
		th1.start();
		th2.start();
		
		System.out.println("Hello World!");
		
		
		
		
	}
}
