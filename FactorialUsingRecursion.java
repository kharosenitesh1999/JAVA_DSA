package com.dsa;

public class FactorialUsingRecursion {
	
	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 21 34 55 89 144
		int n = 13;
		
		int ans = fibbo(n);
		System.out.println("Fibbonacci "+n+" is "+ans);
	}

	private static int fibbo(int n) {
		// TODO Auto-generated method stub
		
		// base condition 
		if(n==1) return 0;
		if(n==2)  return 1;
		
		return fibbo(n-1)+fibbo(n-2);
	}

}
