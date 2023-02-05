package com.javabasics;

import java.util.Scanner;

public class QuotientAndRemainder {

public static void main(String[] args) {
		
		int num1,num2;
		Scanner inputNum=new Scanner(System.in);
		System.out.print("Enter num1: ");
		num1=inputNum.nextInt();
		
		System.out.print("Enter num2: ");
		num2=inputNum.nextInt();
	
		int Quotient=num1/num2;
		System.out.println("Quotient is: "+Quotient);
		
		int Remainder=num1%num2;
		System.out.print("Remainder is: "+Remainder);
	}
	
}

