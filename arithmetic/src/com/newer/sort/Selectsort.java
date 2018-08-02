package com.newer.sort;

public class Selectsort {
              public void select(int[] a){
            	  
            	  for(int i=0;i<a.length-1;i++){
            		  int temp=a[i];//将第一个数用一个变量存放
            		  int m=i;//将这个数的下标给m
            		  for(int j=i+1;j<a.length;j++){
            			  if(a[m]>a[j]){
            				  m=j;//始终保持m存放的数是当中最小的
            			  }
            			 
            		  }
            		  //交换位置，选择排序每次循环只需要交换一次
            		  a[i]=a[m];
            		  a[m]=temp;
            		  
            	  } 
            	  
              }
}
