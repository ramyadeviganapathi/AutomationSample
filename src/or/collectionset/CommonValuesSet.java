package or.collectionset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CommonValuesSet {

	public static void main(String[] args) {
		
		Set<Integer> s1 =  new HashSet<Integer>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(90);
		s1.add(10);
		s1.add(10);
		s1.add(40);
		s1.add(50);
		System.out.println("Hash set 1 is : " +s1);
		
		Set<Integer> s2 =  new HashSet<Integer>();
		s2.add(30);
		s2.add(40);
		s2.add(50);
		s2.add(60);
		s2.add(80);
		System.out.println("Hash set 2 is : " +s2);
		s2.retainAll(s1);
		System.out.println("Hash Set Common Values : " +s2);
		
		Set<Integer> s3 =  new LinkedHashSet<Integer>();
		s3.add(10);
		s3.add(20);
		s3.add(30);
		s3.add(90);
		s3.add(10);
		s3.add(10);
		s3.add(40);
		s3.add(50);
		System.out.println("\nLinked Hash set 1 is : " +s3);
		
		Set<Integer> s4 =  new LinkedHashSet<Integer>();
		s4.add(10);
		s4.add(20);
		s4.add(60);
		s4.add(50);
		s4.add(40);
		s4.add(70);
		s4.add(80);
		s4.add(90);
		System.out.println("Linked Hash set 2 is : " +s4);
		s4.retainAll(s3);
		System.out.println("Linked Hash set common Values : " +s4);
		
		Set<Integer> s5 =  new TreeSet<Integer>();
		s5.add(10);
		s5.add(20);
		s5.add(30);
		s5.add(90);
		s5.add(10);
		s5.add(10);
		s5.add(40);
		s5.add(50);
		System.out.println("\nTree Hash set 1 is : " +s5);
		
		Set<Integer> s6 =  new TreeSet<Integer>();
		s6.add(30);
		s6.add(40);
		s6.add(50);
		s6.add(60);
		s6.add(80);
		System.out.println("Tree Hash set 2 is : " +s6);
		s6.retainAll(s5);
		System.out.println("Tree set common Values : " +s6);
	}
}
