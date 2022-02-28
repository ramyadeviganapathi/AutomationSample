package org.collectionlist;

import java.util.ArrayList;
import java.util.List;

public class RemoveAllMethod {
//RemoveAll
	public static void main(String[] args) {
		List<Integer> li1 = new ArrayList<Integer>();
		li1.add(10);
		li1.add(20);
		li1.add(30);
		li1.add(90);
		li1.add(10);
		li1.add(10);
		li1.add(40);
		li1.add(50);
		System.out.println("My List is 1: " +li1);
		
		List<Integer> li2 = new ArrayList<Integer>();
		li2.add(30);
		li2.add(40);
		li2.add(50);
		li2.add(60);
		li2.add(80);
		System.out.println("My List is 2: " +li2);
		
		li2.removeAll(li1);
		System.out.println("After Removal : " +li2);
		
		List<Integer> li3 = new ArrayList<Integer>();
		li3.add(10);
		li3.add(20);
		li3.add(60);
		li3.add(50);
		li3.add(40);
		li3.add(70);
		li3.add(80);
		li3.add(90);
		System.out.println("My List is 3: " +li3);
		
		li3.removeAll(li1);
		System.out.println("After Removal : " +li3);
		
	}
}
