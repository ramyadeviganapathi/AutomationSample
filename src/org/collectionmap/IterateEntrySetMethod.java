package org.collectionmap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class IterateEntrySetMethod {

	public static void main(String[] args) {
		
		Map<Integer, String> mp1 = new HashMap<Integer, String>();
		mp1.put(10, "java");
		mp1.put(20, "sql");
		mp1.put(30, "oops");
		mp1.put(40, "Sql");
		mp1.put(50, "oracle");
		mp1.put(60, "DB");
		mp1.put(10, "selenium");
		mp1.put(50, "psql");
		mp1.put(40, "Hadoop");
		System.out.println("Hashmap : Random Order" +mp1);
		Set<Entry<Integer, String>> entrySet1 = mp1.entrySet();
		System.out.println("Hashmap Changed as Array Brackets : " +entrySet1);
		for (Entry<Integer, String> entry1 : entrySet1) {
			System.out.println(entry1);
		}
		
		
		Map<Integer, Integer> mp2 = new LinkedHashMap<Integer, Integer>();
		mp2.put(10, 10);
		mp2.put(20, 20);
		mp2.put(30, 30);
		mp2.put(40, 40);
		mp2.put(50, 50);
		mp2.put(60, 60);
		mp2.put(10, 10);
		mp2.put(50, 50);
		mp2.put(40, 40);
		System.out.println("\nLinked Hashmap : Insertion Order" +mp2);
		Set<Entry<Integer, Integer>> entrySet2 = mp2.entrySet();
		System.out.println("Linked Hashmap Changed as Array Brackets : " +entrySet1);
		for (Entry<Integer, Integer> entry2 : entrySet2) {
			System.out.println(entry2);
		}
		
		Map<Character, Integer> mp3 = new TreeMap<Character, Integer>();
		mp3.put('!', 10);
		mp3.put('@', 20);
		mp3.put('#', 30);
		mp3.put('$', 40);
		mp3.put('%', 50);
		mp3.put('^', 60);
		mp3.put('&', 10);
		mp3.put('*', 50);
		mp3.put('(', 40);
		System.out.println("\nTree Map : Ascending Order" +mp3);
		Set<Entry<Character, Integer>> entrySet3 = mp3.entrySet();
		System.out.println("Tree Map changed as Array Brackets : "+entrySet3);
		for (Entry<Character, Integer> entry3 : entrySet3) {
			System.out.println(entry3);
		}
		
		
		Map<String, String> mp4 = new Hashtable<String, String>();
		mp4.put("vel", "Selenium");
		mp4.put("Ganesh", "framework");
		mp4.put("Dinesh", "oracle");
		mp4.put("Vengat", "corejava");
		mp4.put("subash", "jira");
		System.out.println("\nHash Table : Random Order" +mp4);
		Set<Entry<String, String>> entrySet4 = mp4.entrySet();
		System.out.println("Hash Table changed as Array Brackets : " +entrySet4);
		for (Entry<String, String> entry4 : entrySet4) {
			System.out.println(entry4);			
		}
		
	}
}
