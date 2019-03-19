
public class Demo1 {

	public static void main(String[] args) {
//		System.out.println("Hello World!");
		Student s1 = new Student("大海","111",22);
		s1.study();
		JuniorStudent s2 = new JuniorStudent("小王","112",23);
		s2.study();
		SeniorStudent s3 = new SeniorStudent("小宋","113",22);
		s3.study();
	}

}
