package learn.java.sf.px;

import java.util.Arrays;

/**
 * 
 * @version: 1.1.0
 * @Description: �鲢����ʱ�临�Ӷȣ�nlogn���ռ临�Ӷȣ�n
 * @author: wsq
 * @date: 2020��6��7������10:05:03
 */
public class MergeSort {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 8, 9, 2, 4, 10, 6, 7 };
		// ���ù鲢����
		int[] result = mergeSort(array);
		// ��ӡ����
		System.out.println(Arrays.toString(result));
	}

	public static int[] mergeSort(int[] array) {
		// �����ж����Ҽ����ǲ��ǲ����Լ������ж��β�֣��˳��ݹ�
		if (array.length < 2) {
			return array;
		}
		// ������
		int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
		// ������
		int[] right = Arrays.copyOfRange(array, array.length / 2, array.length);
		return merge(mergeSort(left), mergeSort(right));

	}

// ����������жԱȺͲ�
	public static int[] merge(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		for (int i = 0, j = 0, index = 0; index < result.length; index++) {
			if (i >= left.length) {
				result[index] = right[j++];
			} else if (j >= right.length) {
				result[index] = left[i++];
			} else if (left[i] > right[j]) {
				result[index] = right[j++];
			} else {
				result[index] = left[i++];
			}
		}
		return result;
	}
}
