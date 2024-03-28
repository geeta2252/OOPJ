package com.array;

import java.util.Arrays;

public class MergeArray
{
	public static void main(String[] args)
	{
		int a[] = {5,22,4,65};
		int b[] = {4,3,6};
		
		int merger = a.length + b.length;
		int[] c = new int[merger];
		
		for (int i=0; i<a.length; i++) {
			c[i] = a[i];
		}
		for (int i=0; i<b.length;i++) {
			c[a.length+i]= b[i];
		}
		System.out.println("The given array is :"+Arrays.toString(c));
		/*for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}*/
	}

}
