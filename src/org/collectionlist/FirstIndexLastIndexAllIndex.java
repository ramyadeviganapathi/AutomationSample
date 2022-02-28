package org.collectionlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FirstIndexLastIndexAllIndex {

	public static void main(String[] args) {
		
		//Get the first index value of 10 
		
		List<Integer> li1 = new ArrayList<Integer>();
		li1.add(10);
		li1.add(20);
		li1.add(30);
		li1.add(90);
		
		int firstindex = li1.indexOf(10);
		System.out.println("First index of 10 : " +firstindex);
		
		//Get the last index value of 10
		
		List<Integer> li2 = new ArrayList<Integer>();
		li2.add(10);
		li2.add(20);
		li2.add(30);
		li2.add(90);
		li2.add(10);
		li2.add(10);
		li2.add(40);
		li2.add(50);
		int lastindex = li2.lastIndexOf(10);
		System.out.println("Last index of 10 : " +lastindex);
		
		//Get the index value of 50 
		
		int index = li2.indexOf(50);
		System.out.println("Index of 50 : " +index);
		
		//Get the index value of 90 
		int indexOf = li2.indexOf(90);
		System.out.println("Index of 90 : " +indexOf);
		
		//Get the each index value of 10 present in below list 
		
		List<Integer> li3 = new LinkedList<Integer>();
		li3.add(10);
		li3.add(20);
		li3.add(30);
		li3.add(90);
		li3.add(10);
		li3.add(10);
		li3.add(40);
		li3.add(50);
		li3.add(10);
		System.out.println("Each index value of 10");
		System.out.println("-----------------------");
		for (int i = 0; i < li3.size(); i++) {
			
			Integer val1 = li3.get(i);
			
			if (val1 == 10) {
				System.out.println(i);
			}
		}
			//Get the each index value of 70 present in below list
			
			System.out.println("Each index value of 70");
			System.out.println("-----------------------");
			for (int j = 0; j < li3.size(); j++) {
				Integer val2 = li3.get(j);
				if (val2 == 70) {
					System.out.println(j);
				}
			}
			
		
		
	}
}
