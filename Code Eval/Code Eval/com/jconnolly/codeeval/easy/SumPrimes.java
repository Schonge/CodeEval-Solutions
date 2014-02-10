package com.jconnolly.codeeval.easy;

public class SumPrimes {
	
	public static void main(String[] args) {
		SumPrimes sp = new SumPrimes();
		sp.run();
	}
	
	public void run() {
		int sum = 0, counter = 0;
		int i = 2;
		// 0 and 1 are not prime numbers
		while(counter < 1000) {
			if(isPrime(i)) {
				counter++;
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
		System.exit(0);
	}
	
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
