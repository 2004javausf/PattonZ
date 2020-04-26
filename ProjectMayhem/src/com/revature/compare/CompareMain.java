package com.revature.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareMain {

	public static void main(String[] args) {
		System.out.println("==============================================\n");
		List<Student> studentList = new ArrayList<Student>();
		studentList.addAll(Arrays.asList(
				new Student[] {
						new Student(15, "Matt", 8.43),
						new Student(23, "Abid", 3.67),
						new Student(10, "Mark", 0.68),
						new Student(12, "Dom", 9.99),
						new Student(27, "Raul", 4.00),
						new Student(6, "Felix", 3.86)
				}));
		System.out.println("Original List");
		for(Student s: studentList) {
			System.out.println(s);
		}
		
		System.out.println("\n==============================================\n");
		
		Collections.sort(studentList);
		System.out.println("Sorted by StudentID");
		for(Student s: studentList) {
			System.out.println(s);
		}
		
		System.out.println("\n==============================================\n");
		
		Collections.sort(studentList, new StudentComparator());
		System.out.println("Sorted by GPA");
		for(Student s: studentList) {
			System.out.println(s);
		}
		
		System.out.println("\n==============================================\n");
		
		System.out.println("Sort by Label with Lambda");
		Collections.sort(studentList, (arg0, arg1)
				->{return arg0.getLabels().compareTo(arg1.getLabels());}
				);
		for(Student s: studentList) {
			System.out.println(s);
		}
		
		System.out.println("\n==============================================\n");
	}

}
