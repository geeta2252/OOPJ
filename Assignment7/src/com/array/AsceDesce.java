package com.array;

import java.util.Arrays;

public class AsceDesce
{
	public static void main(String[] args)
	{
		int [] arr = new int [] {5, 2, 8, 7, 1};
		int temp = 0;
		System.out.println("The given array is :"+Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;    
	               }     
	            }     
	        }
		System.out.println("Array sorted in Descending order :"+Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;    
	               }     
	            }     
	        }
		System.out.println("Array sorted in Ascending order :"+Arrays.toString(arr));
	}
}
