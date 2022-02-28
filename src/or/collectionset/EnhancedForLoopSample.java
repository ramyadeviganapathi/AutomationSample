package or.collectionset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EnhancedForLoopSample {

	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(105);
		s1.add(205);
		s1.add(305);
		s1.add(405);
		s1.add(505);
		s1.add(605);
		s1.add(705);
		s1.add(805);
		
		System.out.println("My Hash set is : ");
		for (Integer val1 : s1) {
			System.out.println(val1);	
		}
		
		Set<Integer> s2 = new TreeSet<Integer>();
		s2.add(10);
		s2.add(20);
		s2.add(90);
		s2.add(40);
		s2.add(70);
		s2.add(60);
		s2.add(30);
		s2.add(50);
		s2.add(80);
		s2.add(10);
		s2.add(20);
		
		System.out.println("\nMy Tree set is : ");
		for (Integer val2 : s2) {
			System.out.println(val2);	
			
		}
	}
	
	
}
