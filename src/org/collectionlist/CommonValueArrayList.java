package org.collectionlist;

import java.util.ArrayList;
import java.util.List;

public class CommonValueArrayList {

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
		System.out.println("My List is : " +li1);
		
		List<Integer> li2 = new ArrayList<Integer>();
		li2.add(30);
		li2.add(40);
		li2.add(50);
		li2.add(60);
		li2.add(80);
		System.out.println("My List is : " +li2);
		
		li2.retainAll(li1);
		System.out.println("Common value : " +li2);
		
		List<Integer> li3 = new ArrayList<Integer>();
		li3.add(10);
		li3.add(20);
		li3.add(60);
		li3.add(50);
		li3.add(40);
		li3.add(70);
		li3.add(80);
		li3.add(90);
		System.out.println("My List is : " +li3);
		li3.retainAll(li1);
		System.out.println("Common value : " +li3);
	}
}
