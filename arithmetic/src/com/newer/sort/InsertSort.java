package com.newer.sort;

public class InsertSort {
       public void Insertsort(int[]a){
    	  
    	   for(int i=1;i<a.length;i++){
    		   int temp=a[i];//将需要插入的数先用变量存着
    		   int j=i-1;//获得有序区的最后一个数
    		   //如果有序区的数大于需要插入的数，有序区的数往后移一个位置
    		   while(j>=0&&a[j]>temp){
    			   a[j+1]=a[j];
    			   j--;
    		   }
    		   //否则将数存放在j+1的位置
    		   a[j+1]=temp;
    	   }
       }
}
