package com.newer.sort;

public class InsertSort {
       public void Insertsort(int[]a){
    	  
    	   for(int i=1;i<a.length;i++){
    		   int temp=a[i];//����Ҫ����������ñ�������
    		   int j=i-1;//��������������һ����
    		   //�������������������Ҫ�������������������������һ��λ��
    		   while(j>=0&&a[j]>temp){
    			   a[j+1]=a[j];
    			   j--;
    		   }
    		   //�����������j+1��λ��
    		   a[j+1]=temp;
    	   }
       }
}
