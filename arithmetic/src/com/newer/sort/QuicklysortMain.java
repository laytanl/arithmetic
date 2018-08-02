package com.newer.sort;

import java.util.Arrays;

public class QuicklysortMain {
	  public static void main(String []args){
		    Quicklysort s=new Quicklysort();
	        int[] a = {3, 6, 5, 2, 12, 8, 7, 11 ,1};
	        int start = 0;
	        int end = a.length-1; 
	       s. sort(a,start,end);
	       System.out.println(Arrays.toString(a));
	  }
}