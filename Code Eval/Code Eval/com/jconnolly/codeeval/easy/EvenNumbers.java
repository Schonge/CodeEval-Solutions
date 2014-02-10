package com.jconnolly.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EvenNumbers {
	
	public static void main(String[] args) {
    	
		File file = new File(args[0]);
		BufferedReader br;
		String[] numbers;
		try {
			br = new BufferedReader(new FileReader(file));
			String line;
			while((line = br.readLine()) != null) {
				numbers = line.split("\n");
				for(int i = 0; i < numbers.length; i++) {
					int num = Integer.parseInt(numbers[i]);
					if(num % 2 == 0) {
						System.out.println(1);
					} else {
						System.out.println(0);
					}
				
				}
			}
			System.exit(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(-1);
		}
	}

}
