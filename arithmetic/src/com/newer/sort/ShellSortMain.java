package com.newer.sort;

import java.util.Arrays;

public class ShellSortMain {
	public static void main(String[] args) {
//		 ShellSort shell=new ShellSort();
//		 int a[]=new int[100001];
//		 for(int i=100000;i>=0;i--){
//			 a[i]=100000-i;
//		 }	 
//		 long t=System.currentTimeMillis();
//		 shell.shellsort(a);
//		 t=System.currentTimeMillis()-t;
//		 System.out.println(t);
		
		
		ShellSort shell=new ShellSort();
		 int a[]={10,9,8,7,6,5,4,3,2,1};
		 shell.shellsort(a);
		 System.out.println(Arrays.toString(a));
	}
}
