package com.javabasics;

import java.util.Scanner;

public class LargestAmongThree {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();   //taking 3 numbers as input
		
		//computation
		if(num1>num2 )
		{
			System.out.println(num1+" is largest");
		}
		else if(num2>num3)
		{
			System.out.println(num2+" is largest");
		}
		else
		{
			System.out.println(num3+" is largest");
		}
		
	}
}

