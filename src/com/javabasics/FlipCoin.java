package com.javabasics;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		
	int no_of_times;
	int heads_count=0, tail_count=0;
	
	Scanner input_count=new Scanner(System.in);
	System.out.println("Enter No Of Times To Flip The Coin: ");
	no_of_times=input_count.nextInt();
	
	for(int i=0;i<no_of_times;i++)
	{
		double random=Math.random();
		
		if(random<0.5)
		{
			System.out.println("Tail");
			tail_count++;
		}
		else
		{
			System.out.println("Head");
			heads_count++;
		}
		
	}
	
	//Counting head and tails
	System.out.println("Head Count: "+heads_count);
	System.out.println("Tail Count: "+tail_count);
	
	
	//percentage calculation
	
	double Head_Percentage= heads_count/(double)no_of_times*100;
	System.out.println("Percentage Of Heads: "+Head_Percentage);
	
	double Tail_Percentage= tail_count/(double)no_of_times*100;
	System.out.println("Percentage Of Tails: "+Tail_Percentage);
}

}


