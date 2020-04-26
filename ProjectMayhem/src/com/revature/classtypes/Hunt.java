package com.revature.classtypes;
/*Special type of class that can not be instantiated
 *	Specify what a class must do but not how it does it
 *	These lack instance variables
 *	Characterized by a behavior
 *	Can mimic multiple inheritance with interface
 *	Classes can implement interface 0+
 *	Interface can extend other interfaces 0+
 *	All variables are implicitly static, public, and final (java8)*
 *	
 *	
 */
public interface Hunt {
	void findPrey();
}
