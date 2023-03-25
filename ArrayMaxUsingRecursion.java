package com.dsa;

public class ArrayMaxUsingRecursion {
	static int max = Integer.MIN_VALUE;
	
	public static void main(String[] args) {
		
		int arr[] = {5,10,1,20,45,30,80,85};
		int ans  = findMax(arr,0,arr.length);
		System.out.println("This is max number: "+ans);
	}

	private static int  findMax(int[] arr, int i, int length) {
		// TODO Auto-generated method stub
		
//		System.out.println("This is in fun"+i);
		
		// base condition
		if(i==arr.length)
			return max;
		
		// proccessing 		
		if(max < arr[i]) {
			max = arr[i] ;
		}
		
		// recursive call 		
		return findMax(arr,i+1,arr.length);
	
		
		
	}

}
