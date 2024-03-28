package com.array;

import java.util.Arrays;

public class Series
{
	//1, 4, 27,16,125,36
	public static void main(String[] args)
	{
		int i;
		int[] arr = new int[10];
		for(i=1;i<=10;i=i+2) {
			arr[i-1]=i*i*i;
		}
		for(i=2;i<=10;i=i+2) {
			arr[i-1]=i*i;
		}
		System.out.print(Arrays.toString(arr));
	}
}
