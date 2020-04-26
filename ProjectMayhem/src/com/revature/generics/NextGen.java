package com.revature.generics;

public class NextGen {

		public static void main(String[] args) {
			//create a GenOne Reference for Integers
			GenOne<Integer> i;
			i = new GenOne<Integer>(88);
			//Show type
			i.showType();
			//Get value
			int v = i.getOb();
			System.out.println(v);
			
			GenOne<String> s = new GenOne<String>("Generics Test");
			s.showType();
			String str = s.getOb();
			System.out.println("Value: " + str);
		}
}
