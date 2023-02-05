package com.javabasics;

import java.util.Scanner;

public class Quadratic {
  
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			
				System.out.println("enter a ");
				int a = sc.nextInt();
				
				System.out.println("enter b");
				int b = sc.nextInt();
				
				System.out.println("enter c");
				int c = sc.nextInt();
				
				int delta = (b * b - 4 * a * c);
				
				double root1 = (-b + Math.pow(delta, 1 / 2)) / (2 * a);
				double root2 = (-b - Math.pow(delta, 1 / 2)) / (2 * a);
				System.out.println(root1);
				System.out.println(root2);
			
		}
	}
