package com.array;

import java.util.Arrays;

public class ThirdLarge 
{
	public static void main(String[] args)
	{
		int [] arr = {24,54,31,16,82,45,67};
		System.out.println("Given Array :"+Arrays.toString(arr));
		int first = arr[0];
		for(int i=1;i<arr.length;i++)
			if(arr[i]>first)
				first=arr[i];
		int second = arr[1];
		for(int i=0;i<arr.length;i++)
			if(arr[i]>second && arr[i]<first)
				second=arr[i];
		int third = arr[1];
		for(int i=0;i<arr.length;i++)
			if(arr[i]>third && arr[i]<first && arr[i]<second)
				third=arr[i];
		System.out.println("Third largest no. :"+third+" ("+first+" and "+second+" are the largest and second-largest)");
	}
}
