package com.javabasics;


import java.io.PrintWriter;
import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int m = sc.nextInt();
		System.out.println("Enter number of columns: ");
		int n = sc.nextInt();
		
		int a[][] = new int[m][n];
		System.out.println();
		System.out.println("Integer Array");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		double b[][] = new double[m][n];
		System.out.println();
		System.out.println("Double Array");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				b[i][j] = sc.nextDouble();
			}
		}
		
		boolean c[][] = new boolean[m][n];
		System.out.println();
		System.out.println("Boolean Array");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				c[i][j] = sc.nextBoolean(); //!= null;
			}
		}
	
		
		PrintWriter pw = new PrintWriter(System.out,true);

		// display integers
		System.out.println();
		pw.println("2D ARRAY INTEGER");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				pw.print("\t" + a[i][j] + " ");
			}
			pw.println("\t");
			
		}
		
		// display double
				System.out.println();
				pw.println("2D ARRAY DOUBLE");

				for (int i = 0; i < m; i++) {
					for (int j = 0; j < n; j++) {
						pw.print("\t" + b[i][j] + " ");
					}
					pw.println("\t");
				}

				// display boolean
				System.out.println();
				pw.println("2D ARRAY BOOLEAN");

				for (int i = 0; i < m; i++) {
					for (int j = 0; j < n; j++) {
						pw.print("\t" + c[i][j] + " ");
					}
					pw.println("\t");
				}
			}
	
}

