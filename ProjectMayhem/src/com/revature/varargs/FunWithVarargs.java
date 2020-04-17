package com.revature.varargs;

public class FunWithVarargs {
	/*
	 * Variable Link Arguments
	 * 	Method that will take a variable number of arguments
	 * 	Automates and hides the process of creating and saving the values into an array prior to invoking the method
	 * 	Vararg MUST be the last argument
	 * 	Can be of any type
	 */
	
	public static void vaTest(int  ... v) {
		System.out.print("Number of Args is: " + v.length + " Contents: ");
		for(int x:v) {
			System.out.print(x+ " ");
		}
	}
	public static void main(String[] args) {
		vaTest(10);
		System.out.println();
		vaTest(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		System.out.println();
		vaTest();
		
	}

}
