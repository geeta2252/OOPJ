package com.array;

import java.util.Arrays;

public class LargeSmall
{
	public static void main(String[] args)
	{
		int arr[]= {34,26,7,56,91,48};
		System.out.println("The given array is :"+Arrays.toString(arr));
		int max = arr[0];
		int min = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i]){
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("Largest number of the array is : "+max);
		System.out.println("Smallest number of the array is : "+min);
	}
}