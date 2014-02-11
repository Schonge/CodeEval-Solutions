package com.jconnolly.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class NmodM {
	
	public static void main(String[] args) {
		
		NmodM nmm = new NmodM();
		File file = new File(args[0]);
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			String line;
			String[] nums;
			// Split lines into arrays of integers
			while((line = br.readLine()) != null) {
				nums = line.split(",");
				int n, m;
				n = Integer.parseInt(nums[0]);
				m = Integer.parseInt(nums[1]);
				nmm.nModM(n, m);
			}
			System.exit(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(-1);
		}
		
	}
	
	// Find modulos without using %
	public void nModM(int n, int m) {
		int modulos = 0, temp1 = 0, temp2 = 0;
		// Divide n by m to get how many times m goes into n
		temp1 = n / m;
		// Multiply the answer by the divisor, m, to get just
		// how much goes into n
		temp2 = temp1 * m;
		// Subtract that answer from n to get what's left over i.e. the modulos
		modulos = n - temp2;
		System.out.println(modulos);
		
		
	}

}
