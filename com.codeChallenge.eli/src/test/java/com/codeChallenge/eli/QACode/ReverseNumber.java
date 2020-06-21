package com.codeChallenge.eli.QACode;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num = 0;
		int reverseNum = 0;
		
		System.out.println("Input your number and press enter: ");
		
		Scanner input = new Scanner(System.in);
		
		//Captured input would be stored in number num
		num = input.nextInt();
		
		//While Loop: Logic to find out the reverse number
		while(num != 0) {
			reverseNum = reverseNum * 10;
			reverseNum = reverseNum + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse of input number is: "+reverseNum);

	}

}
