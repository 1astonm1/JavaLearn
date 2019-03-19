
public class Demo28 {
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		Person p1 = new Person(10,25,"mike");
		Person p2 = new Person(10,26,"calide");
		Person p3 = new Person(10,27,"andral");
		Person p4 = new Person(10,28,"andrul");
		
//		System.out.println(p1.name);
//		System.out.println(p1.name+" is "+p1.age+" years old");
		int i = 26;
		if(p1.number == i) {
			System.out.println(p1.name);
		}
		else if(p2.number == i) {
			System.out.println(p2.name);
		}
	}

}
