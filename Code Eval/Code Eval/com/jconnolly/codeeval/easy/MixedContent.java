package com.jconnolly.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MixedContent {
	
	public ArrayList<String> words;
	public ArrayList<String> digits;
	
	public static void main(String[] args) {
		
		MixedContent mc = new MixedContent();
		mc.words = new ArrayList<String>();
		mc.digits = new ArrayList<String>();
		File file = new File(args[0]);
		BufferedReader br;
		try {
			// Read in file
			br = new BufferedReader(new FileReader(file));
			String line, str;
			String[] elements;
			while((line = br.readLine()) != null) {
				elements = line.split(",");
				for(int i = 0; i < elements.length; i++) {
					str = elements[i];
					// Check if element is a digit or word
					if(str.matches(".*\\d.*")) {
						mc.digits.add(elements[i]);
					} else {
						mc.words.add(elements[i]);
					}
				}
				mc.printWords(mc.words);
				if(mc.words.size() > 0 && mc.digits.size() > 0) {
					System.out.print("|");
				}
				mc.printDigits(mc.digits);
				System.out.println();
				mc.words.clear();
				mc.digits.clear();
			}
			System.exit(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(-1);
		}
		
	}
	
	// Print array list of words
	public void printWords(ArrayList<String> words) {		
		for(int i = 0; i < words.size(); i++) {
			if(i == 0) {
				System.out.print(words.get(i));
			} else {
				System.out.print("," + words.get(i));
			}
		}
		
			
	}	
		
	// Print array list of digits
	public void printDigits(ArrayList<String> digits) {
		for(int i = 0; i < digits.size(); i++) {
			if(i == 0) {
				System.out.print(digits.get(i));
			} else {
				System.out.print("," + digits.get(i));
			}
		}
	}

}