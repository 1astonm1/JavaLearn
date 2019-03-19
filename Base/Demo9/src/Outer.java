
public class Outer {
	
	int x = 20;
	
	class Inter{
		int y = 10;
		
		public void printInter() {
			System.out.println("y:"+y+"x:"+x);
		}
	}
	
	static class Inner{
		static int z = 30;
		public void printInner() {
			System.out.println("z:"+z);
		}
	}
	
	public void printOuter() {
		System.out.println("y:"+new Inter().y+"x:"+x);
	}
}
