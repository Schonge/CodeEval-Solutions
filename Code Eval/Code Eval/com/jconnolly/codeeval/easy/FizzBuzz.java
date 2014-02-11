package com.jconnolly.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FizzBuzz {
	
	public static void main(String[] args) {
		
		FizzBuzz fb = new FizzBuzz();
		File file = new File(args[0]);
		BufferedReader br;
		try {
			// Read in file
			br = new BufferedReader(new FileReader(file));
			String line;
			String[] nums;
			int a, b, n;
			while((line = br.readLine()) != null) {
				nums = line.split(" ");
				// Set variables A, B and N, A represents number for Fizz,
				// B represents number for Buzz and N represents number limit
				// to count up to
				a = Integer.parseInt(nums[0]);
				b = Integer.parseInt(nums[1]);
				n = Integer.parseInt(nums[2]);
				
				for(int i = 1; i <= n; i++) {
					if(i == 1) {
						fb.checkFizzBuzz(i, a, b);
					} else {
						fb.checkFizzBuzz2(i, a, b);
					}
				}
				System.out.println();
			}
			System.exit(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(-1);
		}
	}
	
	// Check for the first Fizz or Buzz etc. in line. No spaces are printed
	public void checkFizzBuzz(int num, int divisorA, int divisorB) {
		
		if(num % divisorA == 0 && num % divisorB == 0) {
			System.out.print("FB");
		} else if(num % divisorA == 0) {
			System.out.print("F");
		} else if(num % divisorB == 0) {
			System.out.print("B");			
		} else {
			System.out.print(num);
		}
		
	}
	
	// Check for Fizz or Buzz etc. in line. This accounts for the spaces that need to be provided.
	public void checkFizzBuzz2(int num, int divisorA, int divisorB) {
		
		if(num % divisorA == 0 && num % divisorB == 0) {
			System.out.print(" " + "FB");
		} else if(num % divisorA == 0) {
			System.out.print(" " + "F");
		} else if(num % divisorB == 0) {
			System.out.print(" " + "B");
		} else {
			System.out.print(" " + num);
		}
		
	}

}
