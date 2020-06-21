package com.codeChallenge.eli.QACode;

public class TwoMaxNumInArray {

	public static void main(String[] args) {
		
		int[] num = {5,34,78,2,45,1,99,23};
		getTwoMaxNumInArray(num);
		

	}
	
	public static void getTwoMaxNumInArray(int[] num) {
		
		int max1 = 0;
		int max2 = 0;
		
		for(int n : num) {
			if(max1 < n) {
				max2 = max1;
				System.out.println("max1 = " + max1 + " max2 = " + max2);
				max1 = n;
				System.out.println("max1 = " + max1 + " n = " + n);
			}
			else if(max2 < n) {
				max2 = n;
				System.out.println("max1 = " + max2 + " n = " + n);
			}
		}
		System.out.println("First Max Number: "+max1);
        System.out.println("Second Max Number: "+max2);
	}

}
