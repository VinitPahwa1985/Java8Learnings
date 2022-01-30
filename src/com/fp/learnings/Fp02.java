package com.fp.learnings;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Fp02 {

	public Fp02() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[])
	{
		List<Integer> listNumbers = List.of(1,2,3,4,5,56,6,5,4,3,3);
		
		//distinct
		listNumbers.stream().distinct().forEach(System.out::println);
		
		//sorted
		listNumbers.stream().sorted().forEach(System.out::println);
		
		List<Integer> evenNumbers = listNumbers.parallelStream().filter(x -> (x%2 == 1)).sorted().distinct().collect(Collectors.toList());
		System.out.println("Even number list :"+evenNumbers);
 	}
}
