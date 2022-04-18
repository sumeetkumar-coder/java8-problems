package com.sumeet.java8.reduce;

// find largest digit in no

public class LargestDigitInNum {

	public static void main(String[] args) {

		int no = 893;
		int sum = 0;
		
		for (int i=no; i !=0 ; sum= sum + i%10,i=i/10) {
			
		}
		
		System.out.println(sum);
		
		// find length of integer
		int size = (int)Math.log10(no) + 1;
		System.out.println(size);
		
		
	}

}
