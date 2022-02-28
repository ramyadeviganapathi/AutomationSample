package org.collectionlist;

import java.util.ArrayList;
import java.util.List;

public class Addvalues {

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
		
		//Add a value 50 in the 2nd index and display the list after adding.
		
		li1.add(2, 50);
		System.out.println("Added 50 at 2nd index : " +li1);
		
		//Add a value 70 at the end of the list
		
		li1.add(70);
		System.out.println("Added 70 at the Last index : " +li1);
		
		//Add a value 80 at the 8th index of list
		
		li1.add(8, 80);
		System.out.println("Added 80 at 3rd index : " +li1);
	}
}
