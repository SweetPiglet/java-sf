package learn.java.sf.px;

import java.util.Arrays;

/**
 * 
 * @version: 1.1.0
 * @Description: ������ʱ�临�Ӷȣ�nlogn���ռ临�Ӷȣ�1
 * @author: wsq
 * @date: 2020��6��7������11:47:07
 */
public class HeapSort {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 6, 8, 9, 2, 7, 4, 3, 9 };
		// ���ö�����
		heapSort(array, array.length);
		// ��ӡ����
		System.out.println(Arrays.toString(array));
	}

	public static void heapSort(int[] array, int length) {
		for (int i = length / 2; i >= 0; i--) {
			judgeAndChange(array, i, length);
		}
		// �����Ѷ���ֵ
		int temp = array[0];
		array[0] = array[length - 1];
		array[length - 1] = temp;
		// �ݹ����
		length -= 1;
		if (length > 1) {
			heapSort(array, length);
		}
	}

	public static void judgeAndChange(int[] array, int i, int length) {
		// Ĭ���Լ�Ϊ���ֵ
		int max = i;
		// ��ȡ���ӽڵ�
		int leftCode = i * 2 + 1;
		// ��ȡ���ӽڵ�
		int rightCode = leftCode + 1;
		// �Ƚ����ӽڵ�����ڵ�
		if (leftCode < length && array[leftCode] > array[max]) {
			max = leftCode;
		}
		// �Ƚ����ӽڵ�����ڵ�
		if (rightCode < length && array[rightCode] > array[max]) {
			max = rightCode;
		}
		// ���и��ڵ���ӽڵ�Ľ���
		if (max != i) {
			int temp = array[max];
			array[max] = array[i];
			array[i] = temp;
			// ����ڵ㽻�����µ�����
			judgeAndChange(array, max, length);
		}
	}
}
