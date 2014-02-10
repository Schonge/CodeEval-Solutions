package com.jconnolly.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RightmostChar {
	
	public static void main(String[] args) {
    	
		File file = new File(args[0]);
		BufferedReader br;
		String[] sentence;
		int rightMost = 0;
		try {
			br = new BufferedReader(new FileReader(file));
			String line;
			while((line = br.readLine()) != null) {
				sentence = line.split("\n");
				for(int i = 0; i < sentence.length; i++) {
					if(sentence[i] != "") {
						String character = sentence[i].substring(sentence[i].length() - 1);
						String s = sentence[i].substring(0, sentence[i].length() - 1);
						if(s.lastIndexOf(character) == -1) {
							System.out.println(-1);
						} else {
							rightMost = s.lastIndexOf(character);
							System.out.println(rightMost);
						}
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
