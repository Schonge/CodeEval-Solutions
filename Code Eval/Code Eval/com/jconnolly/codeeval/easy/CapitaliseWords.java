package com.jconnolly.codeeval.easy;

/*
 * Write a program which capitalizes the first letter of each word in a sentence.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CapitaliseWords {
	
	public static void main(String[] args) {
		
		File file = new File(args[0]);
		BufferedReader br;
		// Store each line as a string in an array
		try {
			br = new BufferedReader(new FileReader(file));
			String line;
			String[] sentence, words;
			while((line = br.readLine()) != null) {
				sentence = line.split("\n");
				for(int i = 0; i < sentence.length; i++) {
					words = sentence[i].split(" ");
					for(int j = 0; j < words.length; j++) {
						// Take first letter of word an convert it to uppercase
						String firstLetter = words[j].substring(0, 1).toUpperCase();
                        // Take the rest of the word and add it back on
                        // to firstLetter when printing out
						String restOfWord = words[j].substring(1);
						if(j == 0) {
							System.out.print(firstLetter + restOfWord);
						} else {
							System.out.print(" " + firstLetter + restOfWord);
						}
					}
					System.out.println();
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
