package com.array;

import java.util.Arrays;

public class CheckEquality
{
	public static void main(String[] args)
	{
		char a[] = {'a','b','c'};
		char b[] = {'a','b','c'};
		//int a[] = {30,45,50};
		//int b[] = {30,45,50};
		//int c[] = {20,40,60};
		
		boolean result = Arrays.equals(a, b);
		//boolean result = Arrays.equals(a, c);
		
		System.out.println("First Array:   ["+a[0]+","+a[1]+","+a[2]+"]");
		System.out.println("Second Array : ["+b[0]+","+b[1]+","+b[2]+"]");
		
		if (result == true){
			System.out.println("These two Arrays are equal.");
		}
		else {
			System.out.println("These two Arrays are not equal.");
		}
	}

}
