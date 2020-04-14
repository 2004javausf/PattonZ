package com.revature.beans;
//Packages are "fancy" folders. 

/*
 * Naming Conventions
 * Classes and Projects: Pascal casing, Capitalize the first letter of each word. ex ProjectMayhem
 * Methods and Variables: camelCasing
 * Packages: lowercase and delimited by periods
 * Constants: ALL_CAPS, typically delimited by underscores
 */

public class Human {
	/*
	 * Members of a Class- couple of forms
	 * Instance Variables- property of a specific object (human's name)
	 * Static Variables- property of the class shared by all of it's instances
	 * Instance Methods- behavior relative to a specific object
	 * Static Methods- behavior relative to entire class
	 * Constructor- instantiates the class using the keyword "new"
	 */
	private String name;
	private int age;
	private int weight;
	
	public String getName() {
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
	
	public void setWeight(int weight) {
		this.weight=weight;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	
}
