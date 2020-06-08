package learn.java.sf.px;

import java.util.Arrays;

/**
 * 
 * @version: 1.1.0
 * @Description: ��������ƽ��ʱ�临�Ӷȣ�n^2,�ռ临�Ӷ�1
 * @author: wsq
 * @date: 2020��6��6������6:36:16
 */
public class InsertionSort {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 6, 8, 9, 2, 7, 4, 3, 9 };
		// ���ò�������
		insertionSort(array);
		// ��ӡ����
		System.out.println(Arrays.toString(array));
	}

	public static void insertionSort(int[] array) {
		// ���������±����1����Ԫ��
		for (int i = 1; i < array.length; i++) {
			// ȡ����Ҫѡ��λ�õ�Ԫ��
			int max = array[i];
			int j = i - 1;
			// �ҳ���һ��ֵС�ڴ�Ԫ�ص�Ԫ��
			while (j >= 0 && max < array[j]) {
				// ��Ԫ�غ���
				array[j + 1] = array[j];
				j--;
			}
			// ��Ŀ��Ԫ�طŵ����ʵ�λ����
			array[j + 1] = max;
		}
	}
}
