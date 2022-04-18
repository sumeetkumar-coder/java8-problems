package com.sumeet.java8.groupBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// find total amount group by fruits

public class FruitsGroupByTest {

	public static void main(String[] args) {
		
		Fruits f1 = new Fruits("Mango",40);
		Fruits f2 = new Fruits("Apple",20);
		Fruits f3 = new Fruits("Banana",30);
		Fruits f4 = new Fruits("Mango",40);
		Fruits f5 = new Fruits("Banana",30);
		
		List<Fruits> l = new ArrayList<>();
		l.add(f1);
		l.add(f2);
		l.add(f3);
		l.add(f4);
		l.add(f5);
		
		Map<String, List<Fruits>> m = l.stream().collect(Collectors.groupingBy(Fruits::getName, Collectors.toList()));
		
		 l.stream().collect(Collectors.groupingBy(Fruits::getName, 
				Collectors.counting())).entrySet().stream().map(entry -> entry.getKey())
		 		.forEach(System.out::println);
		
		 l.stream().collect(Collectors.groupingBy(Fruits::getName, 
				Collectors.summingDouble(Fruits::getPrice))).forEach((k,v) -> System.out.println("Key:"+k + ":value::" + v));
		
		System.out.println(m.toString());
	
		
		
		
		


	}

}
