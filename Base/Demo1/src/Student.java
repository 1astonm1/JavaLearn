
public class Student {
	String name;
	String num;
	int age;
	
	public Student(String name,String num,int age)
	{
		this.age = age;
		this.name = name;
		this.num = num;
//		System.out.println("调用了Student的构造函数！");
	}
	
	public void study()
	{
		System.out.println(name+"学习马克思列宁主义");
	}
}

class JuniorStudent extends Student{
	
	public JuniorStudent(String name,String num,int age) 
	{
		super(name,num,age);
//		System.out.println("调用了JuniorStudent的构造函数..");
	}
	
	public void study()
	{
		super.study();
		System.out.println(name+"学习JAVAEE..");
	}

}

class SeniorStudent extends Student {
	public SeniorStudent(String name,String num,int age)
	{
		super(name,num,age);
//		System.out.println("调用了SeniorStudent的构造函数..");
	}
	
	public void study()
	{
		super.study();
		System.out.println(name+"学习javase，android..");
	}
	
}
