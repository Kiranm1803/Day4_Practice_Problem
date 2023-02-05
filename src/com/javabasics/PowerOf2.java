package com.javabasics;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the power value of N<31: ");
		int power=input.nextInt();
		int val = 1;
		
		for (int i = 1; i <= power; i++)
		{
			if(power<31)
			{
			val = val * 2;
			System.out.println(val);
			}
			else
			{
				System.out.println("invalid input ");
				System.out.println("enter value less than 31");
				power = input.nextInt();
			}
		}
		
	}
}

