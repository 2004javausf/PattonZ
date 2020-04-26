package com.revature.ol;

public class Calculator {
	
	static int a;
	static double b;
	
	public static void main(String[] args) {
		a=5;
		b=a;
		//System.out.println(b);
		b=3.1;
		a=(int)b;
		Double d = 5.2;
		Integer e = 8;
		//System.out.println(a);
		//System.out.println(b);
		/*add(3,6);
		add(1.3,4.5);
		add(4,5,6);
		System.out.println(add(1,2,3,4));*/
		System.out.println(add(d.intValue(),(int)5.1,3,e));
		
	}
	//Parametric polymorphism
	static int add(int a, int b) {
		System.out.println("This is one");
		System.out.println(a+b);
		return a + b;
	}
	
	static double add(double a, double b) {
		System.out.println("This is two");
		//System.out.println(a+b);
		return a + b;
	}
	static int add(int a, int b, int c) {
		System.out.println("This is three");
		//System.out.println(a+b+c);
		return a+b+c;
	}
	static int add(int ... a  ) {
		System.out.println("This is four");
		int total=0;
		for (int i:a) {
			total = total + i;
		}
		return total;
	}
}
