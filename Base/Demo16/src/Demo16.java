//equals¡∑œ∞
public class Demo16 {
	public static void main(String[] args) {
		String str1 = "aaa";
		String str2 = "aaa";
		System.out.println(str1.equals(str2));
		
		Person p1 = new Person("mike",22);
		Person p2 = new Person("due",23);
		System.out.println(p1.equals(p2));
	}
}

class Person{
	String name;
	int age;
	
	public Person() {
		
	}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj) {
		Person p = null;
		if (obj instanceof Person) 
		p = (Person)obj;
		
		if ( this.name.equals(p.name) ) {
			return true;
		}
		return false;
		//else return false;
	}
	
}
