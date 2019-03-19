/*1：定义Animal类颜色成员变量，无参构造，有参构造，run方法
  2：定义Dog类，继承Animal,定义无参构造，有参构造（使用super调用父类有参构造），
      Dog的特有方法ProtectHome
  3：定义Fish类，继承Animal，定义无参构造，有参构造（使用super调用父类有参构造），
      Fish特有方法swim
  4：定义Bird类，继承Animal，定义无参构造，有参构造（使用super调用父类有参构造），Bird特有方法fly
  5：使用多态，Animal a=new Dog();
  6：调用Dog的特有方法，ProtectHome
		1：类类型转换，Dog d=(Dog)a;
		2：d.protectHome
  7：非多态
		1：Animal a=new Animal();
		2：类类型转换
			Dog d=(Dog)a;  
			d.protectHome();
		3：编译通过，运行出现异常
			1：ClassCastException
  8：多态例外
			1：Animal  a=new Dog();
			2：类类型转换
				1：Fish f=(Fish)a;
				2：f.fish();
				3：编译通过，运行异常
					1：ClassCastException
				4：虽然是多态，但是鸟不能转为狗，狗不能转为鱼，他们之间没有关系。*/
public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Dog();
		Dog d = (Dog)a;
		d.portectHome();
		
//		Animal a1 = new Dog();
//		Fish f = (Fish)a1;
//		f.swim();
	}

}
