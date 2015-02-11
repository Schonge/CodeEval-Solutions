package com.jconnolly.codeeval.easy;

/*
 * The major element in a sequence with the length of L is the element
 * which appears in a sequence more than L/2 times.
 * The challenge is to find that element in a sequence.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TheMajorElement {
	
	public static void main(String[] args) {
		
		File file = new File(args[0]);
		BufferedReader br;
		try {
			// Read in file
			br = new BufferedReader(new FileReader(file));
			String line;
			String[] elements;
			while((line = br.readLine()) != null) {
				elements = line.split(",");
				int l = elements.length;
                int counter;
				String majorElement = "";
				// Count how many times an element appears in the array
				for(int i = 0; i < elements.length; i++) {
                    counter = 0;
					for(int j = 0; j < elements.length; j++) {
						if(elements[i].equals(elements[j])) {
							counter++;							
						}
					}
					if(counter >= (l / 2)) {
						majorElement = elements[i];
						break;
					} else {
    					majorElement = "None";
					}					
				}
				System.out.println(majorElement);
			}
			System.exit(0);
		} catch(IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		
	}

}
