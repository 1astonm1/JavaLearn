import java.util.ArrayList;
import java.util.Collection;

public class Demo25 {
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
//����		
		Collection list = new ArrayList();
		
		list.add("���������");
		list.add("����ϵͳ");
		list.add("java���˼��");
		System.out.println(list);
		
		Collection list2 = new ArrayList();
		list2.add("java���ļ���");
		list2.addAll(list);
		list2.add("java��̷���");
		System.out.println(list2);

//�Ƴ�		
		boolean remove = list2.remove("java���ļ���");
		System.out.println(remove);
		System.out.println(list2);
		
		boolean removeAll = list2.removeAll(list);
		System.out.println(removeAll);
		System.out.println(list2);

//�޸�
		list2.add("java��̷���");
		list2.add(list);
		
		System.out.println(list2);
		list2.clear();//���
		System.out.println(list2);
		
//�ж�
		list2.add("java���ļ���");
		list2.addAll(list);
		list2.add("java��̷���");
		
		System.out.println(list2);
		
		boolean empty = list2.isEmpty();
		System.out.println(empty);
		
		boolean contains = list2.contains("java��̷���");
		System.out.println(contains);
		//�Ƚ��Ƿ�ȫ��һ��
		Collection list3 = new ArrayList();
		list3.add("java��̷���");
		list3.add("aaa");
		boolean containsAll = list2.containsAll(list3);
		System.out.println(containsAll);
		
//��ȡ
		int size = list2.size();
		System.out.println(size);
		
		
	}
}
