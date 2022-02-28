package org.collectionmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class IterateKeyandValues {

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
		Set<Integer> keySet1 = mp1.keySet();
		System.out.println("\nKeys");
		System.out.println("------");
		for (Integer key1 : keySet1) {
			System.out.println(key1);
		}
		System.out.println("\nValues");
		System.out.println("---------");
		Collection<String> value1 = mp1.values();
		for (String v1 : value1) {
			System.out.println(v1);
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
		System.out.println("\nKeys");
		System.out.println("------");
		Set<Integer> keySet2 = mp2.keySet();
		for (Integer key2 : keySet2) {
			System.out.println(key2);
		}
		System.out.println("\nValues");
		System.out.println("---------");
		Collection<Integer> value2 = mp2.values();
		for (Integer v2 : value2) {
			System.out.println(v2);
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
		System.out.println("\nKeys");
		System.out.println("------");
		Set<Character> keySet3 = mp3.keySet();
		for (Character key3 : keySet3) {
			System.out.println(key3);
		}
		System.out.println("\nValues");
		System.out.println("---------");
		Collection<Integer> value3 = mp3.values();
		for (Integer v3 : value3) {
			System.out.println(v3);
		}
		
		Map<String, String> mp4 = new Hashtable<String, String>();
		mp4.put("vel", "Selenium");
		mp4.put("Ganesh", "framework");
		mp4.put("Dinesh", "oracle");
		mp4.put("Vengat", "corejava");
		mp4.put("subash", "jira");
		System.out.println("\nHash Table : Random Order" +mp4);
		System.out.println("\nKeys");
		System.out.println("------");
		Set<String> keySet4 = mp4.keySet();
		for (String key4 : keySet4) {
			System.out.println(key4);
		}
		System.out.println("\nValues");
		System.out.println("---------");
		Collection<String> value4 = mp4.values();
		for (String v4 : value4) {
			System.out.println(v4);
		}

	}
}
