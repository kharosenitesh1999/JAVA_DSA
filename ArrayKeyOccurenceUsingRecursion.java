package com.dsa;

public class ArrayKeyOccurenceUsingRecursion {
	
public static void main(String[] args) {
		

		int arr[] = {91,81,11,61,11,41,11,21,11};
		
		int key = 11;
		int count=0;
		int ans  = findKeyOccurence(arr,0,arr.length,key,count);
		System.out.println(key + " number Occures  "+ans+" times");		
		
		
	}

private static int findKeyOccurence(int[] arr, int i, int length, int key,int count) {
	// TODO Auto-generated method stub
	
	// base condition
	if(i==arr.length) {
		return count;
	}
	
	// processing
	if(arr[i] == key) {
		count++;
		System.out.println(count);
	}
	
	// recursive call
	return findKeyOccurence(arr,i+1,arr.length,key,count);
	

}

}
