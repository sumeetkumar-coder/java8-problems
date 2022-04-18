package com.sumeet.java8.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// TO find longest string in list using java 8

public class LongestString {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("sumeet","amit","kiran");
		
		Optional<String> result = list.stream().reduce((s1,s2) -> s1.length()>s2.length()?s1:s2);
		
		System.out.println(result.get());

	}

}
