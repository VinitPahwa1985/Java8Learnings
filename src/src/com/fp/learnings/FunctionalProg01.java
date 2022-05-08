package com.fp.learnings;

import java.util.List;

public class FunctionalProg01 {

	public FunctionalProg01() {
		// TODO Auto-generated constructor stub
	}
	
	private static void printnumber(int num)
	{
		System.out.println(num);
	}

	private static void printnumbers(List<Integer> num)
	{
		num.stream().forEach(FunctionalProg01::printnumber);
	}
	
	public static void main(String args[])
	{
		printnumbers(List.of(1,2,3,4,5,6,7));
	}
}
