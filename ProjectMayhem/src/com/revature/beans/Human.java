package com.revature.beans;

import com.revature.classtypes.Animal;
import com.revature.classtypes.Hunt;

//Packages are "fancy" folders. 

/*
 * Naming Conventions
 * Classes and Projects: Pascal casing, Capitalize the first letter of each word. ex ProjectMayhem
 * Methods and Variables: camelCasing
 * Packages: lowercase and delimited by periods
 * Constants: ALL_CAPS, typically delimited by underscores
 */

public class Human extends Animal implements Hunt {
	/*
	 * Members of a Class- couple of forms
	 * Instance Variables- property of a specific object (human's name)
	 * Static Variables- property of the class shared by all of it's instances
	 * Instance Methods- behavior relative to a specific object
	 * Static Methods- behavior relative to entire class
	 * Constructor- instantiates the class using the keyword "new"
	 * 
	 * Code Block- {Things between curly braces}
	 */
		//Instance Code Block
	{System.out.println("I'm in an instance code block");}
	
		//Static Code Block
	static {System.out.println("I'm in a static code block");}
	
	//no args constructor
	public Human() {
		System.out.println("I'm in the no args constructor");
	}
	
	//constructor with fields
	 public Human(String name, int age, int weight) { 
		 //super(); 
		 this.name=name;
		 this.age=age;
		 this.weight=weight;
		 System.out.println("I am the constructor with fields");
	 }
	 
	
	public static String homePlanet= "Earth";
	
	private String name;
	private int age;
	private int weight;
	
	public String getName() {
		String s;
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getWeight() {
		return weight;
	}
	//example of shadowing
	public void setWeight(int weight) {
		this.weight=weight; //weight is method scope; this.method is an instance scope
	}
	public static String getHomePlanet() {
		return homePlanet;
	}

	public static void setHomePlanet(String homePlanet) {
		Human.homePlanet = homePlanet;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", weight=" + weight + ", homePlanet= " + homePlanet + "]";
	}

	@Override
	public void findPrey() {
		System.out.println("I use a spear to hunt");
		
	}

	@Override
	public void breathe() {
		System.out.println("I breathe air using lungs");
		
	}
}
