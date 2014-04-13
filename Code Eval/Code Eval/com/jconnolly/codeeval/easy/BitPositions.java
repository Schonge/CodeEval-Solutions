package com.jconnolly.codeeval.easy;

/*
 * Given a number n and two integers p1,p2 determine if the bits in position p1 and p2 are the same or not.
 * Positions p1 and p2 and 1 based.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BitPositions {
	
	public static void main(String[] args) {
		
		BitPositions bp = new BitPositions();
		File file = new File(args[0]);
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			String line;
			String[] nums;
			while((line = br.readLine()) != null) {
				nums = line.split(",");
				int n, p1, p2;
				n = Integer.parseInt(nums[0]);
				p1 = Integer.parseInt(nums[1]);
				p2 = Integer.parseInt(nums[2]);
				bp.convertToBits(n, p1, p2);
			}
			System.exit(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(-1);
		}
		
	}
	
	// Converts number n to bits and checks if the bit at p1
	// is equal to the bit at p2
	public void convertToBits(int n, int p1, int p2) {
		String bits = Integer.toString(n, 2);
		char c1 = bits.charAt(bits.length() - p1);
		char c2 = bits.charAt(bits.length() - p2);
		if(c1 == c2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
	}

}
