package com.fp.learnings;

import java.util.List;

public class SquareNumbersSum {

	public SquareNumbersSum() {
		// TODO Auto-generated constructor stub
	}
	
	public static void squareNumber(List<Integer> numbers)
	{
		int n = numbers.stream().map(number -> number*number).reduce(0,Integer::sum);
		System.out.println("Print Sum: \t"+n);
	}
	
	public static void main(String args[])
	{
		squareNumber(List.of(2,3,5,6,7,8,9));
	}

}
