package com.abc.exone;

import java.util.Scanner;

public class Exercise1 {
	

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			PowerFinder powerObj=(x,y)->{
				
				return Math.pow(x, y);
			};
		
			System.out.println("Enter two numbers:");
			int x1=sc.nextInt();
			int y1=sc.nextInt();
			System.out.println("Power of "+x1+ " raised to "+y1 +" is: "+ powerObj.power(x1,y1));
		}


	}


