package com.jconnolly.codeeval.easy;

/*
 * Print the size of a file in bytes.
 */

import java.io.File;

public class FileSize {
	
	public static void main(String[] args) {
		
		File file = new File(args[0]);
		System.out.println(file.length());
		
	}

}
