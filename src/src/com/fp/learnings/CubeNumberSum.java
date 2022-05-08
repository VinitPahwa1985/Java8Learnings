package com.fp.learnings;

import java.util.List;

public class CubeNumberSum {

	public CubeNumberSum() {
		// TODO Auto-generated constructor stub
	}

	
	public static void CubeNumbersSum(List<Integer> numbers)
	{
		int i = numbers.stream().map(number -> number*number*number).reduce(0,Integer::sum);
		System.out.println("Print Sum of Cubes of number"+i);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CubeNumbersSum(List.of(3,5,8,6,9));
	}

}
