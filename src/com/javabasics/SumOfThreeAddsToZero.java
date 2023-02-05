package com.javabasics;

import java.util.Scanner;

public class SumOfThreeAddsToZero {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no of inputs: ");
		int n=sc.nextInt();
		int count = 0;
		int[] arr= new int[n];
		System.out.println("enter values");
		// taking integer input for creating array
		
		for (int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		

		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i + 1; j < arr.length; j++)
			{
				for (int k = j + 1; k < arr.length; k++)
				{
					if (arr[i] + arr[j] + arr[k] == 0) 
					{
						count++;
						System.out.println(arr[i] + "+" + arr[j] + "+" + arr[k] + "=" + "0");
					}
				}
			}
		}
		// output
		System.out.println("total pairs are " + count);
		
	}
}

