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
			// Store each line as a string in an array
			while((line = br.readLine()) != null) {
				nums = line.split(" ");
				int[] numbers = new int[nums.length];
				for(int i = 0; i < numbers.length; i++) {
					numbers[i] = Integer.parseInt(nums[i]);
				}
				for(int j = 0; j < nums.length; j++) {
					if(j == 0) {
						fb.checkFizzBuzz(numbers[j]);
					} else {
						fb.checkFizzBuzz2(numbers[j]);
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
	
	public void checkFizzBuzz(int num) {
		
		if(num % 3 == 0) {
			System.out.print("F");
		} else if(num % 5 == 0) {
			System.out.print("B");
		} else if(num % 3 == 0 && num % 5 == 0) {
			System.out.print("FB");
		} else {
			System.out.print(num);
		}
		
	}
	
	public void checkFizzBuzz2(int num) {
		
		if(num % 3 == 0) {
			System.out.print(" " + "F");
		} else if(num % 5 == 0) {
			System.out.print(" " + "B");
		} else if(num % 3 == 0 && num % 5 == 0) {
			System.out.print(" " + "FB");
		} else {
			System.out.print(" " + num);
		}
		
	}

}
