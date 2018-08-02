package com.newer.sort;

public class ShellSort {
	public void shellsort(int[] a) {
		int gap = a.length / 2;
		while (gap > 0) {
			for (int i = gap; i < a.length; i++) {// 对所有相隔位置的元素采用直接插入排序
				int tmp = a[i];
				int j = i - gap;// 获得有序区的最后一个数

				// 如果有序区的数大于需要插入的数，有序区的数往后移一个位置
				while (j >= 0 && a[j] > tmp) {
					a[j + gap] = a[j];
					j = j - gap;
				}
				a[j + gap] = tmp; // 否则将数存放在j+gap的位置
			}
			gap=gap/2;
		}
		
	}
}
