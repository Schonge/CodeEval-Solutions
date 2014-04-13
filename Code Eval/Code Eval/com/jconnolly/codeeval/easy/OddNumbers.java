package com.jconnolly.codeeval.easy;

/*
 * Print the odd numbers from 1 to 99.
 */

public class OddNumbers {
	
	public static void main(String[] args) {
		OddNumbers on = new OddNumbers();
		on.run();
	}
	
	public void run() {
		for(int i = 1; i <= 99; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		System.exit(0);
	}

}
