package com.jconnolly.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		FibonacciSeries fs = new FibonacciSeries();
		File file = new File(args[0]);
		BufferedReader br;
		String[] numbers;
		try {
			br = new BufferedReader(new FileReader(file));
			String line;
			int n;
			while((line = br.readLine()) != null) {
				numbers = line.split("\n");
				for(int i = 0; i < numbers.length; i++) {
						n = Integer.parseInt(numbers[i]);
						System.out.println(fs.fibonacci(n));		
				}
			}
			System.exit(0);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(-1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(-1);
		}
		
	}
	
	public int fibonacci(int n) {
		if(n == 0) {
			return 0;
		} else if(n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
	
}
