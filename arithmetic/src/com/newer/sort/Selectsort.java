package com.newer.sort;

public class Selectsort {
              public void select(int[] a){
            	  
            	  for(int i=0;i<a.length-1;i++){
            		  int temp=a[i];//����һ������һ���������
            		  int m=i;//����������±��m
            		  for(int j=i+1;j<a.length;j++){
            			  if(a[m]>a[j]){
            				  m=j;//ʼ�ձ���m��ŵ����ǵ�����С��
            			  }
            			 
            		  }
            		  //����λ�ã�ѡ������ÿ��ѭ��ֻ��Ҫ����һ��
            		  a[i]=a[m];
            		  a[m]=temp;
            		  
            	  } 
            	  
              }
}
