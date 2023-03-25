package com.dsa;

public class ArrayMinUsingRecursion {
	
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) {
		
		
		int arr[] = {-45,10,1,20,45,30,-32,-85};
		int ans  = findMin(arr,0,arr.length);
		System.out.println("This is Min number: "+ans);
	
	}

	private static int findMin(int[] arr, int i, int length) {
		// TODO Auto-generated method stub
		
		//base condition 
		if(i==arr.length) {
			return min ;
		}
		
		// processing 
		if(min > arr[i])
			min =arr[i];
		
		// recursive call
		return findMin(arr,i+1,arr.length);
	}
}
