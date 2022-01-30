package com.fp.learnings;

import java.util.List;

public class SortCourses {

	public SortCourses() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[])
	{
		List<String> courses = List.of("vinit","java","dsadsa");
		courses.stream().sorted().forEach(System.out::println);
	}

}
