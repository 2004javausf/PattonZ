package com.revature.control;

public class LoopyLoops {
/*	If Statement
 * 		for decision making
 * 		providing multiple paths of execution
 * 		if(<conditional>){
 * 			<what to do if true>
 * 			} else if (<second conditional>){
 * 			<what to do if 2nd conditional is true>
 * 			} else {
 * 			<what to do if false>
 * 			}
 * 
 * 
 * 	Switch Cases
 * 		Provides multiple paths of execution based on some value
 * 		the "switch" is based on an integer numeric, a string, a char, a boolean, or enum. 
 * 		(enum = list of constant values held within a set class)
 */
	
	static String colour;
	public static void whatColour(String colour) {
		switch (colour) {
			case "green" :
				System.out.println("Colour is Green.");
				break;
			case "purple" :
				System.out.println("Colour is Purple.");
				break;
			case "black" :
				System.out.println("Colour is Black");
				break;
			case "blue" :
				System.out.println("Colour is Blue");
				break;
			default :
				System.out.println("You chose ... poorly");
				break;
		}
	}
	
	/*For Loops
	 * for(a;b;c){do something}
	 * a is variable declaration (counter)
	 * b is the condition that controls how far the loop will go
	 * c is the incrementor/decrementor
	 */
	public static void forLoopFunness(int p) {
		for(int i=p; i>0; i--) {
			//break and continue
			if(i==10) {
				//break;
				continue;
			}
			System.out.println(i);
		}
	}
	/*Enhanced for loop aka for each
	 * for (x:<Array or Collection>)(do thing)
	 * good for moving through collections, arrays and other iterables
	 * more CPU efficient
	 * no issues with index out of bounds- not size dependent
	 * good for access elements in one collection
	 * bad for adding and removing
	 */
	static int [] myArray= {11,22,33,44,55,66,77,88,99};
	public static void forEachFun(int [] a) {
		for(int i:a) {
			System.out.println(i);
		}
	}
	/*While Loops
	 * while(<condition>){<do something>}
	 * 
	 * do while
	 * do{<do thing>} while(<condtion>)
	 */
	public static void wileyWhile(int i) {
		while (i++<10) {
			System.out.println("boring");
			//i++;
		}
	}
	public static void doWileyWhile(int i) {
		do {
			System.out.println("Not so boring");
			i++;
		}
		while(i<10);
	}
	
	public static void main(String[] args) {
		whatColour("green");
		whatColour("anything");
		
		forLoopFunness(20);
		
		forEachFun(myArray);
		
		wileyWhile(3);
		
		doWileyWhile(13);
		
	}
	
	/*Conditionals
	 * < > <= >= != ==
	 * OR
	 * a|b - bit wise
	 * a||b short circuit OR if a is true, return true without b
	 * AND
	 * a&b - bit wise
	 * a&&b - checks both and evaluates true iff both are true
	 * EQUALS
	 * ==
	 * compare values of primitives
	 * compare the reference for objects. NOT THE CONTENTS
	 * != is good for checking nulls
	 * .equals()
	 * method inherited Object
	 * All reference types have it
	 * looking at content
	 * 
	 * 
	 */
}
