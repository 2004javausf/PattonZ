package com.revature.strings;

public class FunWithStrings {

	/*
	 *	Strings!
	 *		NOT char or Character
	 *		Fully Qualified Class name: java.lang.String
	 *		String literal is 0+ characters ex. "" or String a = "Hello World";
	 *		Concatenate Strings with + or .concat("something")
	 *		"Goodbye" + "Earth"
	 *		Strings are immutable
	 *		String Pool - collection of unique String literals in heap memory
	 *		String API has utility methods
	 */
	
	public static void main(String[] args) {
		String a = "Hello"; //this creates a new reference in the string pool
		System.out.println(a.hashCode());
		a = a.concat(" World");//this ALSO creates a new reference in the string pool
		System.out.println(a);
		System.out.println(a.hashCode());
		String b = "Hello";
		System.out.println(b.hashCode());
		String c = "Hello"; //compiler is searching the string pool to see if this exists already
		System.out.println(c.hashCode());
		String d = new String("Hello");
		System.out.println(d.hashCode());
		System.out.println(c.charAt(3));
		/*
		 * String - String pool!, Immutable, thread safe (synchronized), fast
		 * StringBuilder-no string pool, mutable, not thread safe, fast 
		 * StringBuffer- no string pool, mutable, thread safe, slow
		 */
		StringBuilder sb = new StringBuilder("Hey");
		System.out.println(sb);
		StringBuffer t = new StringBuffer("Hey");
		System.out.println(t);
		System.out.println(t.hashCode());
		System.out.println(sb.hashCode());
		
		
	}
}
