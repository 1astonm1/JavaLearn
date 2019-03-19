import java.util.ArrayList;
import java.util.Collection;

public class Demo26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Mike",22);
		Person p2 = new Person("Jack",25);
		Person p3 = new Person("due",22);
		
		p1.run();
		System.out.println(p2.hashCode());
		System.out.println(p2.toString());
		System.out.println(p2.equals(p2));
		
		Collection list = new ArrayList();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		System.out.println(list);
		
		boolean empty = list.isEmpty();
		System.out.println(empty);
		
		int size = list.size();
		System.out.println(size);
		
		list.remove(p1);
		System.out.println(list);
		
		list.removeAll(list);
		System.out.println(list);
		
	}

}

