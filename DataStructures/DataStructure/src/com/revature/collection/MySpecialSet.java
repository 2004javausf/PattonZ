package com.revature.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.revature.random.RandomObject;

	//Collection Framework
	//List, Set, Queue All interfaces in the Collection

	//Why?
	//	Array object within Java is limited. Mainly that the array is immutable and you're not given
	//	many methods to work with.

	/*
	 * Called a framework (more library), provides interfaces and clasees that allow developers to more easily
	 * manage a group of objects.
	 * 
	 * Advantages:
	 * 		Reduces effort (provides data structure and algorithms for you)
	 * 		Increases performance
	 * 		Encourages software reuse
	 * 
	 * BUT!
	 * 		Convert primitive values into object
	 * 		ints -> Integers
	 * 		boolean -> Boolean
	 * 		byte -> Byte
	 * 
	 * 		Process of converting a primitive data types into its Wrapper class is called boxing
	 */

	/*
	 * What is a SET???
	 * 		Does not allow duplicate objects
	 * 		Does not in general guarantee insertion order
	 * 		Sets are equal if they contain the same elements
	 * 
	 * HashSet:
	 * 		Maintains no order, stores in hash table, best performance
	 * 
	 * LinkedHashSet:
	 * 		Maintains insertion order, weaker performance
	 * 
	 * TreeSet:
	 * 		Maintains value order, very slow performance
	 */

public class MySpecialSet {

		public static void main(String[] args) {
			
			Set<String> myFirstSet = new HashSet<String>();
			
			myFirstSet.add("Hello There");
			myFirstSet.add("What happens if you add an empty string?");
			myFirstSet.add(" ");
			System.out.println(myFirstSet.add("Peter Pan")); //return a boolean if operation was successful
			
			System.out.println(myFirstSet.add("Peter Pan"));
			
			System.out.println(myFirstSet);
			
			Set<String> myOtherSet = new HashSet<>();
			myOtherSet.add("Spice Girls");
			myOtherSet.add("Hello There");
			
			myOtherSet.addAll(myFirstSet);
			System.out.println(myOtherSet);
			
			myOtherSet = myFirstSet; //By reference, so other sets will change
			
			myFirstSet.add("Apples");
			
			System.out.println(myOtherSet);
			System.out.println(myFirstSet);
			
			Set<RandomObject> randomSet = new HashSet<>();
			RandomObject rand1 = new RandomObject("Cameron");
			RandomObject rand2 = new RandomObject("Chad");
			
			randomSet.add(rand1);
			randomSet.add(rand2);
			
			System.out.println(randomSet);
			
			//TreeSet
			
			Set<Object> myFirstTreeSet = new TreeSet<>(); //Created a Tree Set
			myFirstTreeSet.add(4);	//Cannot use heterogeneous objects
			myFirstTreeSet.add(3);	//Cannot use heterogeneous objects
			myFirstTreeSet.add(2);	//Cannot use heterogeneous objects
			myFirstTreeSet.add(57);	//Cannot use heterogeneous objects
			myFirstTreeSet.add(1);	//Cannot use heterogeneous objects
			//myFirstTreeSet.add("Apples");	//Cannot use heterogeneous objects
			//myFirstTreeSet.add(3.3); //Cannot use heterogeneous objects
			
			System.out.println(myFirstTreeSet);
			
			Set<Object> myFinalSet = new HashSet<>(); //No comparisons are being done, so heterogeneous objects are allowed
			
			myFinalSet.add(42);
			myFinalSet.add("Good day");
			
			Object myObject = new Object(); //object tangent
			
			System.out.println(myFinalSet);
			
			Set<Integer> myLinkedSet = new LinkedHashSet<>(); //Preserves insertion order
			
			myLinkedSet.add(72);
			myLinkedSet.add(15);
			myLinkedSet.add(107);
			System.out.println(myLinkedSet);
			
			//Tree set will keep value order
			//Linked Hash Set will preserve insertion order
			
			
			
		}
}
