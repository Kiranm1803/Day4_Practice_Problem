package com.javabasics;

import java.util.Scanner;

public class HarmonicNum {

		public static void main(String[] ars)
		{
		    Scanner s = new Scanner(System.in);
		
		try 
		{
			System.out.println("enter harmonic no to find");
			int n = s.nextInt();
			double h = 1;
			for (double i = 2; i <= n; i++)
			{
				h = h + 1 / i;
			}
			System.out.println(h);

		}
		catch (Exception e)
		{
			System.out.println("enter integer");
			main(ars);
		}
		
	}
}

