package com.revature.compare;

import java.util.Comparator;

//Method 2 of comparing
//External class that implements Comparator
public class StudentComparator implements Comparator<Student>{
	
	//Compare GPAs
	@Override
	public int compare(Student arg0, Student arg1) {
		return (int)((arg0.getGpa()-arg1.getGpa())*100);
	}

}
