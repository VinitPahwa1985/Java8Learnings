package com.fp.learnings;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Fp03Interfaces {

	public Fp03Interfaces() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = List.of(3,4,5,6,7);
		
		Predicate<Integer> isEvenpredicate = x -> x%2==0;
		
		Function<Integer,Integer> squarfunction = x -> x*x;
		
		Function<Integer, String> stringoutputfunc = x -> x+"";
		
		Consumer<Integer> stsouconsumener = x -> System.out.println(x);
		
		BinaryOperator<Integer> SumBinary = (x,y) -> x +y;
		
		// No inputs return something..
		
		Supplier<Integer> randomInteger = () -> 2;
		System.out.println(" Value of randomeInteger"+randomInteger.get());
		
		// UnaryOperator
		
		UnaryOperator<Integer> uni = (x) -> 3 * x;
		
		System.out.println("Value of unary operator"+uni.apply(10));
		
		// Method reference 
		
		List<String> courses = List.of("Cash","Card Payment","scala");
		courses.stream()
	    .map(String::toUpperCase)
	    .sorted((a, b) -> b.compareTo(a))
	    .forEach(System.out::println);
	}

}
