
public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f = new Son();
		
		System.out.println(Father.x);
		System.out.println(f.y);
		
		f.eat();
		Father.speak();
	}

}
