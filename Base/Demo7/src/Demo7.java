/*1������Animal����ɫ��Ա�������޲ι��죬�вι��죬run����
  2������Dog�࣬�̳�Animal,�����޲ι��죬�вι��죨ʹ��super���ø����вι��죩��
      Dog�����з���ProtectHome
  3������Fish�࣬�̳�Animal�������޲ι��죬�вι��죨ʹ��super���ø����вι��죩��
      Fish���з���swim
  4������Bird�࣬�̳�Animal�������޲ι��죬�вι��죨ʹ��super���ø����вι��죩��Bird���з���fly
  5��ʹ�ö�̬��Animal a=new Dog();
  6������Dog�����з�����ProtectHome
		1��������ת����Dog d=(Dog)a;
		2��d.protectHome
  7���Ƕ�̬
		1��Animal a=new Animal();
		2��������ת��
			Dog d=(Dog)a;  
			d.protectHome();
		3������ͨ�������г����쳣
			1��ClassCastException
  8����̬����
			1��Animal  a=new Dog();
			2��������ת��
				1��Fish f=(Fish)a;
				2��f.fish();
				3������ͨ���������쳣
					1��ClassCastException
				4����Ȼ�Ƕ�̬����������תΪ����������תΪ�㣬����֮��û�й�ϵ��*/
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
