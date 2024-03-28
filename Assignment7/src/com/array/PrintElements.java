package com.array;

import java.util.Scanner;

public class PrintElements
{
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int[] arr = new int[] {3,6,9};
		System.out.print("Array : [");
		for(int i=0;i<3;i++)
			System.out.print(arr[i]+" ");
		System.out.print("]");
	}
	
	public static void main2(String[] args)
	{
		int[] arr = new int[3];
		
		System.out.println("Enter 1st Element : ");
		arr[0] = sc.nextInt();
		System.out.println("Enter 1st Element : ");
		arr[1] = sc.nextInt();
		System.out.println("Enter 1st Element : ");
		arr[2] = sc.nextInt();
		
		System.out.println("Your Entered Array : ["+arr[0]+","+arr[1]+","+arr[2]+"]");
	}

	public static void main1(String[] args)
	{
		//int[] arr = null;
		//arr = new int[3];
		int[] arr = new int[3];
		
		arr[0] = 5;
		arr[1] = 10;
		arr[2] = 15;
		
		System.out.println("arr[0]  :  "+arr[0]);
		System.out.println("arr[1]  :  "+arr[1]);
		System.out.println("arr[2]  :  "+arr[2]);
		//System.out.println("Array : ["+arr[0]+","+arr[1]+","+arr[2]+"]");
	}

}
