package com.newer.sort;

public class SelectsortMain {
       public static void main(String[] args) {
		Selectsort s=new Selectsort();
		int a[]={5,1,3,6,2,4};
		s.select(a);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}
