package com.newer.sort;

public class Quicklysort {
	void sort(int a[], int left, int right) {
		int  temp;
		//直到所有左边的数都小于右边的数退出递归
		if (left <right){
		temp = a[left]; // 通过设置一个变量来存储基准值
		int i = left; //不要去改变表参数变量，将它赋值给一个变量
		int j = right;
		while ( i != j) {
			// 顺序很重要，要先从右边开始找
			while (a[j] >= temp && i < j)
				j--;
			// 再找左边的
			while (a[i] <= temp && i < j)
				i++;
			// 交换两个数在数组中的位置
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			
		}
	   //将基准数归位
		a[left] = a[i];
		a[i] = temp;
		sort(a, left, i - 1);// 继续处理左边的，这里是一个递归的过程。
		sort(a, i + 1, right);// 继续处理右边的 ，这里是一个递归的过程。
		}
	}
}
