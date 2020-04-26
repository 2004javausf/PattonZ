package com.revature.driver;

import java.util.Date;

import com.revature.beans.Human; //<--grabs information from the human class
//import com.revature.beans.* (imports every class at the beans level)
//static import - this only grabs static members of the class
//static import ...

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
		Date d = new Date();
		Date e = new Date();
		java.sql.Date f = new java.sql.Date(0);
		d = new Date();
		/* public- access modifier, everything can access it
		 * static- do not need to instantiate to use/belongs to the class
		 * void- doesn't return anything
		 * String[] args- parameter(s) used for this method 
		 * 
		 */
		
		
		System.out.print("Howdy. ");
		System.out.println("Hello friend");
		System.out.println("That was too close");
		Human h = new Human("Zach", 28, 150);
		System.out.println(h);
		Human.setHomePlanet("Mars");
		h.setName("Zach");
		h.setAge(28);
		h.setWeight(160);
		System.out.println(h);
		System.out.println(h.getName());
		Human i = new Human();
		System.out.println(i);
		i.getName();
	}
}
