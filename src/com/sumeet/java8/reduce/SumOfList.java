package com.sumeet.java8.reduce;

import java.util.Arrays;
import java.util.List;

public class SumOfList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3,12,45,61,9);
		
		//Addition the nums in list
		int result = list.stream().reduce(0, Integer::sum); 
		
		System.out.println(result);
		
		//Multiply nos
		
		result = list.stream().reduce(1, (a,b) -> a*b);
		
		System.out.println(result);
		
		//using parallel stream
		
		result = list.parallelStream().reduce(0, Integer::sum);
		
		System.out.println(result);

	}

}
