package com.javabasics;


import java.util.Scanner;

public class PrimeFactors {

	public static void main(String args[]){
	      
	      Scanner input = new Scanner(System.in);
	      System.out.print("Enter a number :");
	      int num = input.nextInt();
	     
	     System.out.println("prime factors are: ");
	     
	      for(int i = 2; i<= num; i++) {
	         while(num%i == 0) {
	            System.out.println(i+" ");
	            num = num/i;
	         }
	      }
	      
	      if(num >2) {
	    	  
	         System.out.println(num);
	      }
	  }
}
