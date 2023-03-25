package com.dsa;

public class FindPowOfTwoUsingRecursion {
	
	public static void main(String[] args) {
		
		int pow = 7;
		int i=1;
		int ans = findPow(pow ,i);
		System.out.println(ans);
		
	}
	
	static int ans =2;

	private static int findPow(int pow,int iter) {
		// TODO Auto-generated method stub
		
		// base condition 
		if(iter==pow) {
			return ans ;
		}
		
		// proccessing 
		ans = 2*ans ;
		
		// recursive
		return findPow(pow,iter+1);
	}

}

