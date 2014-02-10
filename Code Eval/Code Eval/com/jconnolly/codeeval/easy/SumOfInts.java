package com.jconnolly.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SumOfInts {
	
	public static void main(String[] args) {
		
		File file = new File(args[0]);
		BufferedReader br;
		String[] numbers;
		int sum = 0, n;
		try {
			br = new BufferedReader(new FileReader(file));
			String line;
			while((line = br.readLine()) != null) {
				numbers = line.split("\n");
				for(int i = 0; i < numbers.length; i++) {
					n = Integer.parseInt(numbers[i]);
					sum += n;
				}
			}
			System.out.println(sum);
			System.exit(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(-1);
		}
	}

}
