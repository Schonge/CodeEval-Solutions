package com.jconnolly.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WordsToDigit {
	
	public static void main(String[] args) {
		
		File file = new File(args[0]);
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			String line;
			String[] sentence, words;
			// Store each line as a string in an array
			while((line = br.readLine()) != null) {
				sentence = line.split("\n");
				for(int i = 0; i < sentence.length; i++) {
					words = sentence[i].split(";");
					for(int j = 0; j < words.length; j++) {
						// Switch statement to check which word comes up and display its numeric equivalent
						switch(words[j]) {
						case "zero":
							System.out.print("0");
							break;
						case "one":
							System.out.print("1");
							break;
						case "two":
							System.out.print("2");
							break;
						case "three":
							System.out.print("3");
							break;
						case "four":
							System.out.print("4");
							break;
						case "five":
							System.out.print("5");
							break;
						case "six":
							System.out.print("6");
							break;
						case "seven":
							System.out.print("7");
							break;
						case "eight":
							System.out.print("8");
							break;
						case "nine":
							System.out.print("9");
							break;
						}
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

}
