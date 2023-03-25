package com.dsa;

public class Pivote_Element {
	
	public static void main(String[] args) {
		
//		int arr[] = {3,4,5,6,7,1,2};
//		int arr[] = {1,2,3,4,5,6,7};
		int arr[] = {7,1,2,3,4,5,6};
	
//		int arr[] = {1};
	
		
		
		
		int ans = findPivote(arr);
		System.out.println("pivote element is : "+arr[ans]);
		System.out.println("pivote element  index is : "+ans);
		
		
	}

	private static int findPivote(int[] arr) {
		// TODO Auto-generated method stub
		
		int s = 0;
		int e = arr.length-1;
		int mid = s+(e-s)/2;
		
		while(s<e) {
			
			if (  arr[mid] > arr[mid+1] && mid+1 <arr.length) {		// mid+1 <arr.length && 
				return mid;
			}
			if( arr[mid-1]>arr[mid] && mid-1 >=0) {	//mid -1 >=0 &&
				
				return  mid-1;
			}
			if(arr[s] > arr[mid]) {
				// left 
				e = mid-1;
				
			}else if(arr[s]< arr[mid]){
				
				s = mid;
				
				
			}
			
			mid =  s + (e-s)/2;
		}
		
		return s;
	}

}
