package com.array;

public class AvgOf3Cons
{
	public static void main(String[] args)
	{
		double a[] = {15,20,35,40,55,60};
		double avgArr;
		for(int i=0; i<a.length-2;i++) {
			avgArr = (a[i]+a[i+1]+a[i+2])/3;
			System.out.print(avgArr+" ");
		}
	}
}
