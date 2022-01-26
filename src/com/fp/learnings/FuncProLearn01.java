package com.fp.learnings;

import java.util.List;

public class FuncProLearn01 {

	public FuncProLearn01() {
		// TODO Auto-generated constructor stub
	}
	
	public static void printlistofnumbers(List<Integer> numbers)
	{
		for(int number:numbers)
			System.out.println("Value"+number);
	}

	public static void main(String args[])
	{
		System.out.println("First Program");
		printlistofnumbers(List.of(1,2,3,4,5,6,7,8,9));
	}
}
