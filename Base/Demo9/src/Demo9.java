//内部类练习
public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//访问外部类
		Outer o = new Outer();
		o.printOuter();
		//访问内部类
		Outer.Inter o1 = new Outer().new Inter();
		o1.printInter();
		//访问静态内部类
		Outer.Inner oi = new Outer.Inner();
		oi.printInner();
	}

}
