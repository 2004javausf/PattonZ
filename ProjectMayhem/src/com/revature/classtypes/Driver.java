package com.revature.classtypes;

import com.revature.beans.Human;

public class Driver {
	public static void main(String[] args) {
		Shark s = new Shark();
		s.breathe();
		s.findPrey();
		s.swim();
		Human h = new Human();
		h.findPrey();
		h.breathe();
	}
}
