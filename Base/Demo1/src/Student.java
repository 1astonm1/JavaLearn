
public class Student {
	String name;
	String num;
	int age;
	
	public Student(String name,String num,int age)
	{
		this.age = age;
		this.name = name;
		this.num = num;
//		System.out.println("������Student�Ĺ��캯����");
	}
	
	public void study()
	{
		System.out.println(name+"ѧϰ���˼��������");
	}
}

class JuniorStudent extends Student{
	
	public JuniorStudent(String name,String num,int age) 
	{
		super(name,num,age);
//		System.out.println("������JuniorStudent�Ĺ��캯��..");
	}
	
	public void study()
	{
		super.study();
		System.out.println(name+"ѧϰJAVAEE..");
	}

}

class SeniorStudent extends Student {
	public SeniorStudent(String name,String num,int age)
	{
		super(name,num,age);
//		System.out.println("������SeniorStudent�Ĺ��캯��..");
	}
	
	public void study()
	{
		super.study();
		System.out.println(name+"ѧϰjavase��android..");
	}
	
}
