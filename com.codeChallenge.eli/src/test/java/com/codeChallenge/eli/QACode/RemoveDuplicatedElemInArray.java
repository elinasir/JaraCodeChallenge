package com.codeChallenge.eli.QACode;

public class RemoveDuplicatedElemInArray {

	
//	Create an auxiliary array temp[] to store unique elements.
//	Traverse input array and one by one copy unique elements of arr[] to temp[]. Also keep track of count of unique elements. Let this count be j.
//	Copy j elements from temp[] to arr[] and return j
	
	
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
		int n = arr.length;
		
		n =removeDupVal(arr,n);
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" "); 
		}

	}
	
	static int removeDupVal(int arr[], int n) {
		
		// Return, if array is empty or contains a single element 
		if (n == 0 || n == 1) {
			return n;
		}
		
		int[] temp = new int[n];
		System.out.print(temp);
		int j = 0;
		for(int i=0; i< n-1; i++) {
			// If current element is not equal  to next element then store that current element 
			if(arr[i] != arr[i+1]) {
				temp[j++] = arr[i];
				System.out.print("j = " + j + " i = " +i);
//				int currentTemp = temp[j];
//				System.out.print(currentTemp);
			}
	
		}
		
		// Store the last element as whether it is unique or repeated, it hasn't stored previously
		temp[j++] = arr[n-1];
		for (int i=0; i<j; i++) {
			arr[i] = temp[i];
			
		}
		return j;
	}

}
