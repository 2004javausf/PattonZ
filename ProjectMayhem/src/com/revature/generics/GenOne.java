package com.revature.generics;
/*
 *Generics
 * 	Using a type as a parameter
 *	Write code that can handle different types of objects
 *	Use angle brackets <> to denote that something is a generic
 *	Allows us to ensure type safety
 *	Adds stability and reusability to our code
 *	Placeholder (Capital letter, ?, etc.) - use instead of an explicit type 	
 */
public class GenOne<T> {
	//declare an object of type T
	T ob;
	
	//pass the constructor a reference to an object of type T
	GenOne(T o){
		ob=o;
	}
	//returns ob
	T getOb() {
		return ob;
	}
	//Show the type of T
	void showType() {
		System.out.println("Type of T is " + ob.getClass().getName());
	}
}
