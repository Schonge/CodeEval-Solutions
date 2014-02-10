package com.jconnolly.codeeval.easy;

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
