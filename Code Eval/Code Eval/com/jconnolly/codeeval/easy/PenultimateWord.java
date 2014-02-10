package com.jconnolly.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PenultimateWord {
	
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
					String penWord = words[words.length - 2];
					System.out.println(penWord);
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
