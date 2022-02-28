package or.collectionset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetLinkedHashSetTreeSet {

	public static void main(String[] args)
	
	{
		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(50);
		s1.add(60);
		s1.add(70);
		s1.add(80);
		s1.add(90);
		s1.add(10);
		s1.add(20);
		
		System.out.println("Hash set : Random  order : " +s1);
		
		Set<Integer> s2 = new LinkedHashSet<Integer>();
		s2.add(10);
		s2.add(20);
		s2.add(30);
		s2.add(40);
		s2.add(50);
		s2.add(60);
		s2.add(70);
		s2.add(80);
		s2.add(90);
		s2.add(10);
		s2.add(20);
		
		System.out.println("Linked Hash set : Insertion  order : " +s2);
		
		Set<Integer> s3 = new TreeSet<Integer>();
		s3.add(10);
		s3.add(20);
		s3.add(90);
		s3.add(40);
		s3.add(70);
		s3.add(60);
		s3.add(30);
		s3.add(50);
		s3.add(80);
		s3.add(10);
		s3.add(20);
		
		System.out.println("Tree set : Ascending  order : " +s3);
	}
}
