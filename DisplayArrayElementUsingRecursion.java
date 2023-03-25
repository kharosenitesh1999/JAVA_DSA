package com.dsa;

public class DisplayArrayElementUsingRecursion {
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50} ;
		
		displayArray(arr,0 ,arr.length);
		
		
	}

	private static void displayArray(int[] arr,int i ,  int length) {
		// TODO Auto-generated method stub
		
		// base condition
		if(i==length) return ;

		// proccessing assending order
		if(i==0)
		System.out.println("assending order");
		
		
		System.out.print(arr[i]+ "->");
			
		displayArray(arr,++i,length);
		
		// descending order
		if(i==length)
		System.out.println("\ndescending order");
		
		System.out.print(arr[i-1]+ "->");
		
		
	}

}
