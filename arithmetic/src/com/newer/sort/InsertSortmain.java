package com.newer.sort;

import java.util.Arrays;

public class InsertSortmain {
	public static void main(String[] args) {
		InsertSort insert=new InsertSort();
		 int a[]=new int[100001];
		 for(int i=100000;i>=0;i--){
			 a[i]=100000-i;
		 }	 
		 long t=System.currentTimeMillis();
		 insert.Insertsort(a);
		 t=System.currentTimeMillis()-t;
		 System.out.println(t);
		 
		 
//		 InsertSort insert=new InsertSort();
//		 int a[]={10,9,8,7,6,5,4,3,2,1};
//		 insert.Insertsort(a);
//		 System.out.println(Arrays.toString(a));
	}
         
          
}
