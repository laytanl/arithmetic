package com.newer.sort;

public class Quicklysort {
	void sort(int a[], int left, int right) {
		int  temp;
		//ֱ��������ߵ�����С���ұߵ����˳��ݹ�
		if (left <right){
		temp = a[left]; // ͨ������һ���������洢��׼ֵ
		int i = left; //��Ҫȥ�ı�����������������ֵ��һ������
		int j = right;
		while ( i != j) {
			// ˳�����Ҫ��Ҫ�ȴ��ұ߿�ʼ��
			while (a[j] >= temp && i < j)
				j--;
			// ������ߵ�
			while (a[i] <= temp && i < j)
				i++;
			// �����������������е�λ��
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			
		}
	   //����׼����λ
		a[left] = a[i];
		a[i] = temp;
		sort(a, left, i - 1);// ����������ߵģ�������һ���ݹ�Ĺ��̡�
		sort(a, i + 1, right);// ���������ұߵ� ��������һ���ݹ�Ĺ��̡�
		}
	}
}
