package com.array;

import java.util.Arrays;

public class ReverseArray
{	
	public static void main(String[] args)
	{
		int[] arr = new int[] {4,2,7,9,1};
		System.out.println("Given array :"+Arrays.toString(arr));
		
		int[] rev = new int[arr.length];
		
		for(int i=arr.length-1;i>=0;i--)
		{
			rev[arr.length-1-i] = arr[i];
		}
		System.out.println("Reversed array :"+Arrays.toString(rev));
	}
	
	public static void main1(String[] args)
	{
		int[] arr = new int[] {4,2,7,9,1};
		System.out.println("The given array is :"+Arrays.toString(arr));
		System.out.print("Array : [");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
	}
}