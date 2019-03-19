//÷ÿ–¥toString
public class Demo15 {
	public static void main(String[] args) {
		Person p = new Person("mike",22);
		System.out.println(p);
	}
}


class Person {
	String name;
	int age;
	public Person() {
		
	}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return this.name+"-"+this.age;
	}
}
