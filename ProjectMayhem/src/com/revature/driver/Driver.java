package com.revature.driver;

import com.revature.beans.Human;

public class Driver {
	//single line comment
	/*multi
	 * line
	 * comment
	 */
	/*Why Java?
	 * "WORA" principle
	 * 		"Write once, Run anywhere
	 * OOP
	 * Widespread use
	 * Great Documentation
	 * Oracle owned
	 *	Used to be owned by Sun Microsystems
	 * We are using version 1.8 ie "Java 8"
	 *
	 * 
	 * 3 Common acronyms- JDK, JRE, JVM
	 * 	JVM = Java Virtual Machine
	 * 		Convert compiled Java Code into machine code that the processor can use
	 * 		Provides portability
	 * 	JRE = Java Runtime Environment
	 * 		JVM + Libraries
	 * 		Everything that we need to RUN Java
	 * 	JDK = Java Development Kit
	 * 		Contain JVM and JRE
	 * 		Compiler, etc...
	 * 		Everything we need to WRITE Java
	 * Object Oriented Programming
	 * 	Java is OOP
	 * 	Unit of programmability is the object
	 * 	Objects have states and behaviors
	 * 	State- aka fields, attributes, variables, etc
	 * 	Behaviors- methods
	 * 	Classes- blueprint or template of an object
	 * 	
	 */
	public static void main(String[] args) {
		/* public- access modifier, everything can access it
		 * static- do not need to instantiate to use/belongs to the class
		 * void- doesn't return anything
		 * String[] args- parameter(s) used for this method 
		 * 
		 */
		System.out.print("Howdy. ");
		System.out.println("Hello friend");
		System.out.println("That was too close");
		Human h = new Human();
		System.out.println(h);
		h.setName("Zach");
		h.setAge(28);
		h.setWeight(150);
		System.out.println(h);
		System.out.println(h.getName());
		
	}
}
