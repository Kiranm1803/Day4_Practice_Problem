package com.javabasics;

import java.util.Scanner;

public class Distance {


	public static void main(String[] args)
	{
			Scanner sc = new Scanner(System.in);
			
			System.out.print("enter value for x : ");
			int x = sc.nextInt();
			
			System.out.print("enter value for y : ");
			int y = sc.nextInt();
			
			System.out.println("distance from "+x+" and "+y+" is " + Math.pow((x * x + y * y), 0.5));
					
	}
}
