package com.javabasics;


import java.util.Scanner;

public class SwapTwoNum {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter two numbers to swap: ");
		
		int num1=input.nextInt();
		int num2=input.nextInt();
		
		System.out.println("Before Swapping the numbers are: ");
		System.out.println("Number1 : "+num1);
		System.out.println("Number2 : "+num2);
		
		int temp=num1;
		num1=num2;
		num2=temp;
				
		System.out.println("After Swapping the numbers are: ");
		System.out.println("Number1 : "+num1);
		System.out.println("Number2 : "+num2);
	}
}
