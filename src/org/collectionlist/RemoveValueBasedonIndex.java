package org.collectionlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RemoveValueBasedonIndex {

	public static void main(String[] args) {
		
		//Remove the value present at 2nd index
		
		List<Integer> li1 = new LinkedList<Integer>();
		li1.add(10);
		li1.add(20);
		li1.add(30);
		li1.add(40);
		li1.add(50);
		li1.add(60);
		System.out.println("My List is : " +li1);
		li1.remove(2);
		System.out.println("Removed value in 2nd Index : " +li1);
		
		//Remove the last value of 10 present in the list  
		
		List<Integer> li2 = new ArrayList<Integer>();
		li2.add(10);
		li2.add(20);
		li2.add(30);
		li2.add(90);
		li2.add(10);
		li2.add(10);
		li2.add(40);
		System.out.println("My List is : " +li2);
		int lastoccur = li2.lastIndexOf(10);
		li2.remove(lastoccur);
		System.out.println("Removed value in 2nd Index : " +li2);
	}
}
