
import java.util.ArrayList;

public class Demo27 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("���������");
		list.add("�ִ�����ϵͳ");
		list.add("java���ļ���");
		list.add("java���˼��");
		list.add("java�������");
		
		System.out.println(list);
		
		list.add(0, "��˺ͱ���");
		System.out.println(list);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list.add("ˮ䰴�");
		list.add("��������");
		list.add("���μ�");
		System.out.println(list2);
		
		list.addAll(1,list2);
		System.out.println(list);
		
		Object obj = list.remove(0);
		System.out.println(obj);
		System.out.println(list);
		
		list.add(0,"��˺ͱ���");
		
		Object obj1 = list.set(2, "�߳�");
		System.out.println(obj1);
		System.out.println(list);
	}
}
