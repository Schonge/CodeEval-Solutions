package com.jconnolly.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/*
 * Your friends decided to make fun of you.
 * They have installed a script on your computer which shuffled all words within a text.
 * It is a joke, so they have left hints for each sentence.
 * The hints will allow you to rebuild the data easily, but you need to find out how to use them.
 * 
 * Your task is to write a program which reconstructs each sentence out of a set of words
 * and prints out the original sentences.
 */

public class DataRecovery {
	
	public static void main(String[] args) {
    	
		File file = new File(args[0]);
		BufferedReader br;
    	Map<Integer, String> wordPosition;
		// Read in file
		try {
			br = new BufferedReader(new FileReader(file));
			
			
			String line;
			String[] sentence;
			ArrayList<String>  words, positions;
			ArrayList<Integer> posIndex;
			while((line = br.readLine()) != null) 
			{
				// Create HashMap
				wordPosition = new HashMap<Integer, String>();
				// Split sentence into words and numbers
				sentence = line.split(";");
				// Separate sentence into individual words and positions
				words = new ArrayList<>();
				words.addAll(Arrays.asList(sentence[0].split(" ")));
				positions = new ArrayList<>();
				positions.addAll(Arrays.asList(sentence[1].split(" ")));
				// Find the missing position
				for(int i = 1; i <= words.size(); i++) {
					if(!positions.contains(Integer.toString(i))) {
						positions.add(Integer.toString(i));
					}
				}
				// Convert strings to integers
				posIndex = new ArrayList<>();
				for(int i = 0; i < positions.size(); i++) {
					posIndex.add(Integer.parseInt(positions.get(i)));
				}
				for(int i = 0; i < words.size(); i++) {
					// Add each position and word(Key, Value) to hashmap
					
					wordPosition.put(posIndex.get(i), words.get(i));
				}
				
				// Change map type to tree map to sort the order of the sentence
				Map<Integer, String> orderedSentence = new TreeMap<Integer, String>(wordPosition);
				for(Entry<Integer, String> entry : orderedSentence.entrySet()) {
					// Print out the words(values) of the sentence
					System.out.print(entry.getValue() + " ");
				}
				System.out.println();
				
			}
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		
	}

}
