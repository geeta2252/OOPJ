package com.array;
import java.util.Arrays;
import java.util.Scanner;

public class FindPairs
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[] {5,3,6,4,7,9};
		
		System.out.println("The given array is :"+Arrays.toString(arr));
		System.out.println("Enter the number to check sum : ");
		int number = sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if((arr[i]+arr[j])==number) {
					System.out.println(arr[i]+","+arr[j]);
				}
			}
		}
		sc.close();
	}

}
