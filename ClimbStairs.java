package com.dsa;

public class ClimbStairs {
	
	public static void main(String[] args) {
		
		int n =5;
		int ans = findClimbStairs(n);
		
		System.out.println(ans);
	}

	private static int findClimbStairs(int n) {
		// TODO Auto-generated method stub
		
		
		if(n==0 || n==1) {
			
			return 1 ;
			
		}
		
		int ans = findClimbStairs(n-1) +findClimbStairs(n-2)  ;
		
		return ans ;
		
	}

}
