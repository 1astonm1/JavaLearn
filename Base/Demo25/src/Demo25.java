import java.util.ArrayList;
import java.util.Collection;

public class Demo25 {
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
//增加		
		Collection list = new ArrayList();
		
		list.add("计算机网络");
		list.add("操作系统");
		list.add("java编程思想");
		System.out.println(list);
		
		Collection list2 = new ArrayList();
		list2.add("java核心技术");
		list2.addAll(list);
		list2.add("java编程方法");
		System.out.println(list2);

//移除		
		boolean remove = list2.remove("java核心技术");
		System.out.println(remove);
		System.out.println(list2);
		
		boolean removeAll = list2.removeAll(list);
		System.out.println(removeAll);
		System.out.println(list2);

//修改
		list2.add("java编程方法");
		list2.add(list);
		
		System.out.println(list2);
		list2.clear();//清除
		System.out.println(list2);
		
//判断
		list2.add("java核心技术");
		list2.addAll(list);
		list2.add("java编程方法");
		
		System.out.println(list2);
		
		boolean empty = list2.isEmpty();
		System.out.println(empty);
		
		boolean contains = list2.contains("java编程方法");
		System.out.println(contains);
		//比较是否全部一样
		Collection list3 = new ArrayList();
		list3.add("java编程方法");
		list3.add("aaa");
		boolean containsAll = list2.containsAll(list3);
		System.out.println(containsAll);
		
//获取
		int size = list2.size();
		System.out.println(size);
		
		
	}
}
