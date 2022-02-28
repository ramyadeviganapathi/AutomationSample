package or.collectionset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class AddAllMethod {

	//To copy from List to set
	public static void main(String[] args) {
		List<Integer> li1 = new LinkedList<Integer>();
		li1.add(10);
		li1.add(20);
		li1.add(30);
		li1.add(90);
		li1.add(10);
		li1.add(10);
		li1.add(40);
		li1.add(50);
		System.out.println("My Linked List is : " +li1);
		
		Set<Integer> s1 = new LinkedHashSet<Integer>();
		s1.addAll(li1);
		System.out.println("My copied Linked Hash set is : " +s1);
		
		List<Integer> li2 = new ArrayList<Integer>();
		li2.add(105);
		li2.add(205);
		li2.add(305);
		li2.add(405);
		li2.add(505);
		li2.add(605);
		li2.add(705);
		li2.add(805);
		li2.add(505);
		li2.add(605);
		System.out.println("My Array List is : " +li2);
		
		Set<Integer> s2 = new HashSet<Integer>();
		s2.addAll(li2);
		System.out.println("My copied Hash set is : " +s2);
	}
}
