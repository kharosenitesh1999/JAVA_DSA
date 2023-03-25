package com.dsa;

public class SquareRootOfNumber {
	
	static int find_sqrt(int num) {
		
		int s = 0;
		int e = num;
		int ans =-1;
		
		int mid = (s+e)/2;
		
		while(s<=e) {
			
			if(mid * mid ==  num) {

				return mid ;
			}
			if(mid * mid >num) {
				
				e =  mid -1;
			}
			if(mid * mid < num ) {
				ans =  mid ;
				
				s = mid +1;
			}
			
			mid = (s+e)/2;
			
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		
		
		int num = 10 ;
		
		System.out.println("Square root of "+num +" is "+find_sqrt(num));
		int ans =  find_sqrt(num) ;
		
		int precision= 6 ;
		
		double step = 0.1 ; 
		
		double total =  ans ; 
		
		for( int i=0;i<precision ;i++) {
			
			for( total = ans ; total * total <=num; ) {
				
				total = total + step ;
					
			}
			step =  step /10;
		//	System.out.println("Sqrt of "+num +" iS " + total);				
			
		}
		System.out.println("Sqrt of "+num +" iS **" + total);
	}

}
