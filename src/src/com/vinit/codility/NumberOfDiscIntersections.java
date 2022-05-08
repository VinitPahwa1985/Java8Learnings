package com.vinit.codility;
/*
We draw N discs on a plane. The discs are numbered from 0 to N − 1. An array A of N non-negative integers, specifying the radiuses of the discs, is given. The J-th disc is drawn with its center at (J, 0) and radius A[J].

We say that the J-th disc and K-th disc intersect if J ≠ K and the J-th and K-th discs have at least one common point (assuming that the discs contain their borders).

The figure below shows discs drawn for N = 6 and A as follows:

  A[0] = 1
  A[1] = 5
  A[2] = 2
  A[3] = 1
  A[4] = 4
  A[5] = 0*/

public class NumberOfDiscIntersections {

	public NumberOfDiscIntersections() {
		// TODO Auto-generated constructor stub
	}
	
	  public int solution(int[] A) {
	        
	        // main idea:
	        // 1. store all the "lower points" and "upper points" of the discs
	        // 2. count the intersections (if one upper point > one lower point)
	        
	        // note: use "long" for big numbers (be careful)
	        long[] lower = new long[A.length];
	        long[] upper = new long[A.length];
	        
	        for(int i=0; i<A.length; i++){
	            lower[i] = i - (long)A[i]; // note: lower = center - A[i]
	            upper[i] = i + (long)A[i]; // note: upper = center + A[i]
	        }
	        
	        // "sort" the "lower points" and "upper points"
	        Arrays.sort(upper);
	        Arrays.sort(lower);
	        
	        int intersection = 0; // number of intersections
	        int j=0; // for the lower points
	        
	        // scan the upper points
	        for(int i=0; i<A.length; i++){
	        
	            // for the curent "j" (lower point)
	            while( j < A.length && upper[i] >= lower[j]){
	                    intersection = intersection + j; // add j intersections
	                    intersection = intersection - i; // minus "i" (avoid double count) 
	                    j++;
	            }          
	        }
	        
	        // for the overflow cases
	        if(intersection > 10_000_000)
	            return -1;
	        
	        return intersection; // number of intersections      
	    }

}
