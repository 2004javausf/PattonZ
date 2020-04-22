package com.revature.classtypes;
/*Special Class that can't be instantiated
 *	They contain at least one abstract method
 *	They can contain concrete methods
 *	"Contract based" - abstract methods MUST be overriden in the subclass
 */

public abstract class Animal {
	//abstract method
	public abstract void breathe();
}
