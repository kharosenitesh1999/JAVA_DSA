package com.dsa;

public class pivot {


	static int findPivot(int arr[] ){

		int s = 0;
		int e = arr.length-1;
		
		int mid = s+e /2;
		
		while(s<e){
			
		if(arr[mid] > arr[mid+1]){

			return mid ;
		}
		
		if(arr[mid-1]> arr[mid]){
			
			return mid-1;
		}

		// place on 6
		if(arr[s] < arr[mid]){
			
			s = mid ;
		}

		//place on 2
		if(arr[s] > arr[mid]){
			
			return e =  mid -1;
		}
		
		mid =  (s +e)/2;

		}
		return s;

	}	
	public static void main(String[] args){

		int arr[] ={4,5,6,7,8,9,1,2,3};
		
		int pivot = findPivot(arr );
		System.out.println("Pivot Element "+arr[pivot]+" index is "+pivot);
				


	}


}