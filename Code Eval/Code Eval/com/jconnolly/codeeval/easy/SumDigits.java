package com.jconnolly.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SumDigits {
	
	public static void main(String[] args) {
		
		File file = new File(args[0]);
		BufferedReader br;
		String[] numbers;
		int sum = 0;
		try {
			br = new BufferedReader(new FileReader(file));
			String line;
			while((line = br.readLine()) != null) {
				numbers = line.split("\n");
				for(int i = 0; i < numbers.length; i++) {
					for(int j = 0; j < numbers[i].length(); j++) {
						Character c = new Character(numbers[i].charAt(j));
						String character = c.toString();
						int digit = Integer.parseInt(character);
						sum += digit;
					}
					System.out.println(sum);
					sum = 0;
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

}
