//�ڲ�����ϰ
public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����ⲿ��
		Outer o = new Outer();
		o.printOuter();
		//�����ڲ���
		Outer.Inter o1 = new Outer().new Inter();
		o1.printInter();
		//���ʾ�̬�ڲ���
		Outer.Inner oi = new Outer.Inner();
		oi.printInner();
	}

}
