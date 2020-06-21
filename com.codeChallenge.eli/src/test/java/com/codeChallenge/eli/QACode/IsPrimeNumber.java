package com.codeChallenge.eli.QACode;

import java.util.Scanner;

public class IsPrimeNumber {

	public static void main(String[] args) {
		

		isPrime(31);
		isPrime(33);
		isPrime(99);
		isPrime(28);
		isPrime(17);

	}

	public static boolean isPrime(int inputNum) {
	
		
		if (inputNum <= 1) {
			return false;
		}
		
		for(int i=2; i < inputNum/2; i++) {
			if(inputNum % i ==0) {
				System.out.println(inputNum + " is not a prime number");
				return false;
			}
		}
		System.out.println(inputNum + " is a prime number");
		return true;
		

	}

}
