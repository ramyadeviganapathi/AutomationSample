package org.collectionlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ValueofIndexForLoopEnhancedForLoop {

	public static void main(String[] args) {
		
		//Get the value present at 2nd index
		
		List<Integer> li1 = new LinkedList<Integer>();
		li1.add(10);
		li1.add(20);
		li1.add(30);
		li1.add(40);
		li1.add(50);
		li1.add(60);
		
		Integer val1 = li1.get(2);
		System.out.println("Value present at 2nd index : " +val1);
		
		//Get the value present at 4th index
		
		List<Integer> li2 = new ArrayList<Integer>();
		li2.add(100);
		li2.add(200);
		li2.add(300);
		li2.add(400);
		li2.add(500);
		li2.add(600);
		li2.add(700);
		
		Integer val2 = li2.get(4);
		System.out.println("Value present at 4th index : " +val2);
		
		//Get the value present at 8th index
		
		Vector<Integer> li3 = new Vector<Integer>();
		li3.add(105);
		li3.add(205);
		li3.add(305);
		li3.add(405);
		li3.add(505);
		li3.add(605);
		li3.add(705);
		li3.add(805);
		
		Integer val3 = li3.get(7);
		System.out.println("Value present at 7th index : " +val3);
		
		//Get the each value of list by using normal for loop
		System.out.println("Normal For Loop");
		System.out.println("---------------");
		for (int i = 0; i < li3.size(); i++) {
			Integer value1 = li3.get(i);
			System.out.println(value1);
		}
		
		System.out.println("Enhanced For Loop");
		System.out.println("------------------");
		for (Integer value2 : li3) {
			System.out.println(value2);
		}
	}
	
}
