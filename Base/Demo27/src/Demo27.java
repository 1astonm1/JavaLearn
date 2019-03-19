
import java.util.ArrayList;

public class Demo27 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("计算机网络");
		list.add("现代操作系统");
		list.add("java核心技术");
		list.add("java编程思想");
		list.add("java程序设计");
		
		System.out.println(list);
		
		list.add(0, "舒克和贝塔");
		System.out.println(list);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list.add("水浒传");
		list.add("三国演义");
		list.add("西游记");
		System.out.println(list2);
		
		list.addAll(1,list2);
		System.out.println(list);
		
		Object obj = list.remove(0);
		System.out.println(obj);
		System.out.println(list);
		
		list.add(0,"舒克和贝塔");
		
		Object obj1 = list.set(2, "边城");
		System.out.println(obj1);
		System.out.println(list);
	}
}
