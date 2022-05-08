package com.fp.learnings;

import java.util.List;
import java.util.function.Predicate;

public class FP03ParametrizationBehaviour {

	public FP03ParametrizationBehaviour() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = List.of(4,5,6,7,8,9);
		filterandprint(numbers, x -> x%3==0);

	}

	
	public static void 	filterandprint(List<Integer> numbers,Predicate<? super Integer> predicate)
	{
		numbers.stream().filter(predicate).forEach(System.out::println);
	}
}
