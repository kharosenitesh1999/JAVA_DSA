package com.dsa;

public class ArrayFindKeyUsingRecursion {
	
//	static int key;
	
	public static void main(String[] args) {
		

		int arr[] = {91,81,71,61,51,41,31,21,11};
		
		int target = 61;
		int ans  = findKey(arr,0,arr.length,target);
		System.out.println(target + " number  at index " + ans +" key :");		
		
		
	}

	private static int findKey(int[] arr, int i, int length, int target ) {
		// TODO Auto-generated method stub
		
		
		
		// base condition
		if(i==arr.length) {
			return -1 ;
		}
		
		// proccessing
		
		if(arr[i]== target) {
		
			return i ;
			
		}
		
		// recusive call 
		
		return  findKey(arr,i+1,length,target);
		
	}

}
