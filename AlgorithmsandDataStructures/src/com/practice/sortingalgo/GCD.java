package com.practice.sortingalgo;


public class GCD {
	
	int m,n;
	
	public int calculateGCD(int number1, int number2) {
		
		if(number1 > number1) {
			m = number1;
			n = number2;
		} else {
			m = number2;
			n = number1;
		}
		
		int result = calculateGCDUsingEucilid(m,n);
		
		return result;
		
	}
	
	//Recursive method
	private int calculateGCDUsingEucilid(int m , int n) {
		
		int remainder  = m % n;
		
		//base case
		if(remainder == 0) {
			return n;
		}
		
		m = n;
		n = remainder;
		
		return calculateGCDUsingEucilid(m,n);
		
	}
	
	public static void main(String[] args) {
		
		if(args.length < 2) {
			System.out.println("Please enter two numbers to get the GCD as command line arguments");
		}
		GCD gcd = new GCD();
		
		System.out.println("GCD of the two numbers is : "+ gcd.calculateGCD(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
		
		
	}

}
