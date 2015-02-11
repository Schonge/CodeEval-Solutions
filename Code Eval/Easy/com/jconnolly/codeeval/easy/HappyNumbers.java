package com.jconnolly.codeeval.easy;

/*
 * A happy number is defined by the following process.
 * Starting with any positive integer, replace the number by the sum of the squares of its digits,
 * and repeat the process until the number equals 1 (where it will stay), or it loops endlessly
 * in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy numbers, while those that do not end in 1 are unhappy numbers.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class HappyNumbers {
	
	// Holds numbers after they are squared and added together
	ArrayList<Integer> happy = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
    	HappyNumbers hn = new HappyNumbers();
		File file = new File(args[0]);
		BufferedReader br;
		try {
			// Read in file
			br = new BufferedReader(new FileReader(file));
			String line;
			// Store each line as a string in an array
			while((line = br.readLine()) != null) {
				if(hn.isHappy(Integer.parseInt(line))) {
					System.out.println(1);
					hn.happy.clear();
				} else {
					System.out.println(0);
					hn.happy.clear();
				}
			}
            System.exit(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
            System.exit(-1);
		}
	}
	
	// Checks if number is happy
	public boolean isHappy(int num) {
		
		while(!happy.contains(num) && num != 1) {
			happy.add(num);
			num = sumOfDigitSquares(num);			
		}
		return num == 1;
	}
	
	// Separates digits, squares them and adds them together
	public int sumOfDigitSquares(int n) {
		int sum = 0;
		String str = Integer.toString(n);
		int length = str.length();
		
		for(int i = 0; i < length; i++) {
			int digit = Character.getNumericValue(str.charAt(i));
			sum += digit * digit;
		}
		return sum;
	}

}
