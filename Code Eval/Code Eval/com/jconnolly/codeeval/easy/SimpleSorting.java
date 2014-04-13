package com.jconnolly.codeeval.easy;

/*
 * Write a program which sorts numbers.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class SimpleSorting {
	
	public static void main(String[] args) {
		
    	SimpleSorting ss = new SimpleSorting();
		File file = new File(args[0]);
		BufferedReader br;
		String[] numbers;
		// Formats doubles to be printed to 3 digits
		DecimalFormat df = new DecimalFormat("0.000");
		
		try {
			br = new BufferedReader(new FileReader(file));
			String line;
			while((line = br.readLine()) != null) {
				numbers = line.split(" ");
				double[] nums = new double[numbers.length];
				for(int i = 0; i < nums.length; i++) {
					nums[i] = Double.parseDouble(numbers[i]);
				}
				double[] sortedNums = ss.sortNums(nums);
				// Print sorted arrays
                for(int j = 0; j < sortedNums.length; j++) {
                    if(j == 0) {
                        System.out.print(df.format(sortedNums[j]));
                    } else {
                        System.out.print(" " + df.format(sortedNums[j]));
                    }
                }
                System.out.println();
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	// Uses insertion sort to sort the arrays
	public double[] sortNums(double[] arr) {
		
		int j;
		double temp;
		for(int i = 1; i < arr.length; i++) {
			j = i;
			temp = arr[i];
			while(j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j -1];
				j--;
			}
			arr[j] = temp;
		}
		return arr;
	}
}
