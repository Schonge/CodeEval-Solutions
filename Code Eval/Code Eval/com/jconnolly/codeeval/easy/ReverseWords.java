package com.jconnolly.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReverseWords {
	
	public static void main(String[] args) {
		
		File file = new File(args[0]);
		BufferedReader br;
		String[] sentences, words;
		try {
			br = new BufferedReader(new FileReader(file));
			String line;
			while((line = br.readLine()) != null) {
				sentences = line.split("\n");
				for(int i = 0; i < sentences.length; i++) {
					words = sentences[i].split("\\s");
					for(int j = words.length - 1; j >= 0; j--) {
						System.out.print(words[j] + " ");
					}
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
