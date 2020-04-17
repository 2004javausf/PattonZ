package com.revature.arrays;

import java.util.Arrays;

public class FunWithArrays {
		//group of like types variables that are referred by a common name
	public static void main(String[] args) {
		//int array with 6 "buckets"
		int [] myArray= new int[6];
		
		int [] chaos = {1,2,3,4,5,6,7,8,9};
		chaos [5]=99;
		System.out.println(chaos[5]);
		
		System.out.println(" ");
		
		for (int i=0;i<chaos.length;i++)	{
			chaos[i]=chaos[i]*4;
		}
		for(int i:chaos) {
			System.out.println(i);
		}
		
		System.out.println(" ");
		
		Arrays.sort(chaos);
		for (int i:chaos) {
			System.out.println(i);
		}
		
		System.out.println(" ");
		
		System.out.println(Arrays.toString(chaos));
		
		System.out.println(" ");
		
		
	}
}
