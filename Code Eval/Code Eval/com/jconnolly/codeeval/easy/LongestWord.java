package com.jconnolly.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LongestWord {

	public static void main(String[] args) {
		
		File file = new File(args[0]);
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			String line, longestWord;
			int length = 0, longest = 0;
			String[] words;
			// Store each word as a string in an array
			while((line = br.readLine()) != null) {
				words = line.split(" ");
				longestWord = "";
				for(int i = 0; i < words.length; i++) {
					// Get length of word
					length = words[i].length();
					if(length > longest) {
						longest = length;
						longestWord = words[i];
					}
				}
				System.out.println(longestWord);
			}
			System.exit(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(-1);
		}
	}
	
}
