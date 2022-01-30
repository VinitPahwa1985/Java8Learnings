package com.fp.learnings;

import java.util.List;
import java.util.Optional;

public class FPExcercise01 {

	public FPExcercise01() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[])
	{
		//Print odd numbers
		printOddNumbers(List.of(1,2,3,5,6,8,9));
		printCourses(List.of("Spring","AWS","GCP","Spring Boot"));
		printCoursesSpring(List.of("Spring","AWS","GCP","Spring Boot"));
		printCourses3Letter(List.of("Spring","AWS","GCP","Spring Boot"));

		printCubeOddNumbers(List.of(1,2,3,5,6,8,9));
		printCoursesLen(List.of("Spring","AWS","GCP","Spring Boot"));
		printSumLong(List.of(10001L,2222L,3333L));
	}
	
	public static void printOddNumbers(List<Integer> num)
	{
	
	
		num.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
	}

	public static void printCourses(List<String> courses)
	{
		courses.stream().forEach(System.out::println);
	}
	
	public static void printCoursesSpring(List<String> courses)
	{
		courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
	}
	
	public static void printCourses3Letter(List<String> courses)
	{
		courses.stream().filter(course -> course.length()==3).forEach(System.out::println);
	}
	
	public static void printCubeOddNumbers(List<Integer> num)
	{
	
		num.stream().filter(number -> number % 2 != 0).map(number -> number*number).forEach(System.out::println);
	}
	public static void printCoursesLen(List<String> courses)
	{
		courses.stream().map(course -> course.length()).forEach(System.out::println);
	}
	
	public static void printSumLong(List<Long> lg)
	{
	      //Optional<Long> sumVal =  lg.stream().reduce(Long::sum);
	      System.out.println(lg.stream().map(number -> number).reduce(0L,Long::sum));
	}
}
