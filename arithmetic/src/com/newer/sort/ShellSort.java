package com.newer.sort;

public class ShellSort {
	public void shellsort(int[] a) {
		int gap = a.length / 2;
		while (gap > 0) {
			for (int i = gap; i < a.length; i++) {// ���������λ�õ�Ԫ�ز���ֱ�Ӳ�������
				int tmp = a[i];
				int j = i - gap;// ��������������һ����

				// �������������������Ҫ�������������������������һ��λ��
				while (j >= 0 && a[j] > tmp) {
					a[j + gap] = a[j];
					j = j - gap;
				}
				a[j + gap] = tmp; // �����������j+gap��λ��
			}
			gap=gap/2;
		}
		
	}
}
