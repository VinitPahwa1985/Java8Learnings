package com.fp.learnings;

import java.util.List;
import java.util.function.Predicate;

public class FP04CustomClass {

	public FP04CustomClass() {
		// TODO Auto-generated constructor stub
		
		
	}
	
	public static void main(String args[])
	{
		List<Course> courses = List.of(
				new Course("C++","Language",65,25),
				new Course("Java","Language",65,25),
				new Course("Spring","Framework",65,25),
				new Course("Angular","Framework",65,25),
				new Course("C","Language",65,25)
				);
		
		
		// allmatch ,nonematch,anymatch
		Predicate<? super Course> predicategreaterThan90 = course -> course.getReviewScore() > 90;
		Predicate<? super Course> predicateallgreaterThan90 = course -> course.getReviewScore() > 90;
		Predicate<? super Course> predicatenonegreaterThan90 = course -> course.getReviewScore() > 90;
		Predicate<? super Course> predicateanygreaterThan90 = course -> course.getReviewScore() > 90;
		
		System.out.println(
		courses.stream().allMatch(predicategreaterThan90));
		
	}

}

class Course {
	
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;
	
	public Course(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getReviewScore() {
		return reviewScore;
	}
	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	
	 public String toString()
	{
		return name+":"+noOfStudents+":"+reviewScore;
	}

}