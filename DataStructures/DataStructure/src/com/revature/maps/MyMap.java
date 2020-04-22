package com.revature.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MyMap {

	//Consists of key, value pairs.
	//	Each key has to be unique and can only be mapped to one value
	//	A key can be mapped to a duplicate value
	
	//Methods
	//	Basic Operations:
	//		put, get, remove, containsKey, containsValue, size, and empty
	//	Bulk Operations:
	//		putAll, clear
	//	Collection views
	//		keySet, entrySet, and values
	
	//ALL MAPS DO NOT ALLOW MULTIPLE KEYS
	public static void main(String[] args) {
		
		Map<Integer, String> myMap = new HashMap<>();
		/*
		 * Allows Duplicate values, not duplicate keys
		 * Allows a single null key, and it allows multiple null values
		 * Does not guarantee order
		 */
		Map<String, Integer> myOtherMap = new TreeMap<>();
		/*
		 * Does not allow null keys, but does allow null values
		 * Sorts according to the natural ordering of the keys
		 */
		Map<Integer, String> myOtherOtherMap = new LinkedHashMap<>();
		/*
		 * It maintains insertion order
		 */
		
		myMap.put(1, "This is my first value");
		myMap.put(42, "The answer to everything");
		myMap.put(21, "Today");
		
		//myOtherOtherMap.put("Apple", "Red spherical fruit, sometimes green");
		
		
		System.out.println(myMap);
		System.out.println(myMap.get(1));
		System.out.println(myMap.remove(1));
		System.out.println(myMap);
		
		System.out.println(myMap.keySet());
		System.out.println(myMap.values());
		
		myMap.put(42, null);
		myMap.put(null, "This is a null value");
		System.out.println(myMap.get(1234) + ": returning the value of key 1234");  //Access key value pair, if the key doesn't exist, returns null
		myMap.put(null, null);
		System.out.println(myMap);
		
		System.out.println(myMap.size()); //	returns size
		System.out.println(myMap.isEmpty());//	checks if empty
		
		myOtherOtherMap.put(42, "I am not Null"); //put in a key for 42, will overwritten with addAll
		System.out.println(myOtherOtherMap);
		
		myOtherOtherMap.putAll(myMap); //		similar to putAll, adds submap into map
		System.out.println(myOtherOtherMap);
		myOtherOtherMap.clear();	//Clears all the entries in a map
		System.out.println(myOtherOtherMap);
		
		Set<Integer> myKeySet = myMap.keySet(); //create a set
		
		for (Integer i: myKeySet) { //Iterate through the set
			System.out.println(myMap.get(i)); //Get the values
		}
		
		
	}
	
}
