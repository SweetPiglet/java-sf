package learn.java.sf.px;

import java.util.Arrays;

/**
 * 
 * @version: 1.1.0
 * @Description: ѡ������,ʱ�临�Ӷ�Ϊ��n^2,�ռ���Ӷ�Ϊ1
 * @author: wsq
 * @date: 2020��6��6������5:42:24
 */
public class SelectionSort {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 8, 9, 2, 4, 10, 6, 7 };
		// ����ѡ������
		selection(array);
		// ��ӡ����
		System.out.println(Arrays.toString(array));
	}

	public static void selection(int[] array) {
		// ��˳��ȡ�������еĵ�һ������
		for (int i = 0; i < array.length - 1; i++) {
			// ��ȡ��С��Ԫ�ص��±�
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[minIndex] > array[j]) {
					minIndex = j;
				}
			}
			// ��iָ��ĵ�ǰλ�õ�Ԫ������СԪ�ػ���
			// �ж��Ƿ���Ҫ���л���
			if (minIndex != i) {
				int temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
		}
	}
}
