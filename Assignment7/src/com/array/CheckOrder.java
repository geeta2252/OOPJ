package com.array;

import java.util.Arrays;

public class CheckOrder
{
	static void check(int[] arr)
	{
		System.out.println("The given array is :"+Arrays.toString(arr));
		int i,j=0,k=0;
		for(i=0;i<arr.length-1;i++)
		{
			if(arr[i]<arr[i+1])
				k++;
			else if(arr[i]>arr[i+1])
				j++;
		}
		if(k==arr.length-1)
				System.out.println("Ascending");
		else if(j==arr.length-1)
				System.out.println("Descending");
		//else if(j<arr.length-1 || i<arr.length-1)
		else
			System.out.println("Random");
	}
	public static void main(String[] args)
	{
		int arr1[]= {5,14,35,90,139};
		CheckOrder.check(arr1);
		int arr2[]= {88,67,35,14,-12};
		CheckOrder.check(arr2);
		int arr3[]= {65,14,129,34,7};
		CheckOrder.check(arr3);
	}
}
