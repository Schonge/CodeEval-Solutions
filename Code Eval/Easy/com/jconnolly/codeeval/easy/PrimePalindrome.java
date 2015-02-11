package com.jconnolly.codeeval.easy;

/*
 * Write a program to determine the biggest prime palindrome under 1000.
 */

public class PrimePalindrome {
	
	public static void main(String[] args) {
		PrimePalindrome pp = new PrimePalindrome();
		pp.run();
	}
	
	public void run() {
		
		int palindrome, bigPalindrome = 0;
		for(int number = 100; number < 1000; number++) {
			palindrome = number;
			if(isPalindrome(palindrome) == true && isPrime(palindrome)) {
				if(palindrome > bigPalindrome) {
					bigPalindrome = palindrome;
				}
			}
		}
		System.out.println(bigPalindrome);
		System.exit(0);
	}
	
	// Check if number is palindrome
	public boolean isPalindrome(int num) {
		
		int original = num;
		int reverse = 0, dig = 0;
		// Reverse the number and compare it to original
		while(num > 0) {
			dig = num % 10;
			reverse = (reverse * 10) + dig;
			num = num / 10;
		}
		
		return reverse == original;
	}
	
	// Checks if number is prime
	public boolean isPrime(int num) {
		// If number is divisible by 2 then it is divisible by num / 2
		for(int j = 2 ; j <= Math.sqrt(num) ; j++) {
			if(num % j == 0) {
				return false;
			}
		}
		return true;
	}
	
}
