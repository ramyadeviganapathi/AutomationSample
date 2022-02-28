package org.collectionlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ReplaceValue {

	public static void main(String[] args) {
		
		//Replace the value 300 into 350 in the list
		
		List<Integer> li1 = new Vector<Integer>();
		li1.add(100);
		li1.add(200);
		li1.add(300);
		li1.add(400);
		li1.add(500);
		li1.add(600);
		li1.add(700);
		System.out.println("My list is : " +li1);
		for (int i = 0; i < li1.size(); i++) {
			Integer value = li1.get(i);
			if (value == 300) {
				li1.set(i, 350);
			}
			
		}
		System.out.println("My new list after replacing : " +li1);
		
		//Replace the value present in 7th index as 90 
		List<Integer> li2 = new ArrayList<Integer>();
		li2.add(10);
		li2.add(20);
		li2.add(30);
		li2.add(90);
		li2.add(10);
		li2.add(10);
		li2.add(40);
		li2.add(50);
		li2.add(10);
		
		System.out.println("My list is : " +li2);
		li2.set(7, 90);
		System.out.println("My new list after replacing : " +li2);
		
		//Replace the 10 into 100 in List
		List<Integer> li3 = new ArrayList<Integer>();
		li3.add(10);
		li3.add(20);
		li3.add(30);
		li3.add(90);
		li3.add(10);
		li3.add(10);
		li3.add(40);
		li3.add(50);
		li3.add(30);
		System.out.println("My list is : " +li3);
		for (int j = 0; j < li3.size(); j++) {
			Integer val = li3.get(j);
			if (val == 10) 
			{
				li3.set(j, 100);
			}
			
		}
		System.out.println("My new list after replacing : " +li3);
		
		
		/*Collections.replaceAll(li3, 10, 100);*/
		/*System.out.println("My new list after replacing : " +li3);*/
	}
}
