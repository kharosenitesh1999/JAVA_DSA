package com.dsa;

public class Find_Element {

	private static int findPivotElement(int[] arr) {
		// TODO Auto-generated method stub
		int s = 0;
		int e = arr.length - 1;
		int mid = s + (e - s) / 2;

		while (s < e) {

			// if mid gretter than mid+1
			if (arr[mid] > arr[mid + 1] && mid + 1 < arr.length - 1) {
				return mid;
			}
			// if mid is less than mid -1

			if (arr[mid - 1] > arr[mid] && mid - 1 >= 0) {
				return mid - 1;
			}

			// this is mid is anywhere

			if (arr[s] < arr[mid]) {

				s = mid;

			}
			if (arr[s] > arr[mid]) {

				e = mid - 1;
			}

			mid = s + (e - s) / 2;

		}

		return s;
	}

	static int binarySearch(int arr[], int target, int s, int e) {

		int mid = s + (e - s) / 2;

		while (s <= e) {

			if (arr[mid] == target) {
				return mid;

			}

			if (target < arr[mid]) {

				e = mid - 1;

			} else {

				s = mid + 1;
			}
			mid = s + (e - s) / 2;

		}

		return -1;
	}

	public static void main(String[] args) {

		int arr[] = {3,4,5,6,7,8,9,10,11,12,0,1,2};

//		int arr[] = {10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,90};

//		int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//	
	//	NOTE:
	/*	This is  not work on decreasing order  
		int arr[] = {5,4,3,2,1};
		
		*/
		int pivot = findPivotElement(arr);
		System.out.println(arr[pivot]);

		int target = 2;
		int ans = -1;
		

		if (target >= arr[0] && target <= arr[pivot] && pivot >= 0) {

			ans = binarySearch(arr, target, 0, pivot);
		} else if (target >= arr[pivot + 1] && pivot + 1 < arr.length - 1 && target <= arr[arr.length - 1]) {

			ans = binarySearch(arr, target, pivot + 1, arr.length - 1);

		}

//		System.out.println(target + " Element  index is " + ans + " "); 
//		
//		ans = binarySearch(arr, target, 0, arr.length - 1);

	

	System.out.println(target + " Element  index is " + ans + " "); 


	}

}
