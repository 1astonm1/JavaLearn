
public class Person {
	
	String name;
	int age;
	
	public Person() {
		
	}
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void run() {
		System.out.println("壓怒。。。。。");
	}
	
	public String toString() {
		return "Person:name="+name+",age="+age;
		
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) {
			return false;
		}
		Person p = (Person)obj;
		return this.name.equals(p.name)&&this.age == p.age;
	}
	
	public int hashCode() {
		return this.name.hashCode()+age;
	}
}
