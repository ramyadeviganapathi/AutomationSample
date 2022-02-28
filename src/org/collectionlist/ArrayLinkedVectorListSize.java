package org.collectionlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayLinkedVectorListSize {

	public static void main(String[] args) {
		
		//Create a new ArrayList with values and find the length of it
		
		List<Integer> li1 = new ArrayList<Integer>();
		li1.add(10);
		li1.add(20);
		li1.add(30);
		li1.add(90);
		li1.add(10);
		li1.add(10);
		li1.add(40);
		li1.add(50);
		int size1 = li1.size();
		System.out.println("Length of ArrayList : " +size1);
		
		//Create a new LinkedList with values and find the length of it
		List<Integer> li2 = new LinkedList<Integer>();
		li2.add(100);
		li2.add(200);
		li2.add(300);
		li2.add(400);
		li2.add(500);
		li2.add(600);
		li2.add(700);
		int size2 = li2.size();
		System.out.println("Length of LinkedList : " +size2);
		
		//Create a new vector with values and find the length of it
		List<Integer> li3 = new Vector<Integer>();
		li3.add(105);
		li3.add(205);
		li3.add(305);
		li3.add(405);
		li3.add(505);
		li3.add(605);
		li3.add(705);
		li3.add(805);
		int size3 = li1.size();
		System.out.println("Length of Vector : " +size3);
	}
}
