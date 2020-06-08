package learn.java.sf.px;

import java.util.Arrays;

/**
 * 
 * @version: 1.1.0
 * @Description: ��������ʱ�临�Ӷȣ�nlogn���ռ临�Ӷȣ�1
 * @author: wsq
 * @date: 2020��6��7������11:05:32
 */
public class QuickSort {
	public static void main(String[] args) {
		int[] array = new int[] { 5, 10, 9, 7, 8, 2, 1, 3, 4, 6 };
		// ���ÿ�������
		quickSort(array, 0, array.length - 1);
		// ��ӡ����
		System.out.println(Arrays.toString(array));
	}

	public static void quickSort(int[] array, int low, int high) {
		// ��С����
		if (low < high) {
			int i = low;
			int j = high;
			int middle = array[low];
			// �����жϣ����һ���
			while (i < j) {
				// Ѱ�ҳ���ߵĲ�����Ԫ��
				while (i < j && array[j] >= middle) {
					j--;
				}
				// Ѱ�ҳ��ұߵĲ�����Ԫ��
				while (i < j && array[i] <= middle) {
					i++;
				}
				if (i < j) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			// ����׼�����ָ��λ�õ������л���
			array[low] = array[j];
			array[j] = middle;
			// ����׼����ߺ��ұ߽���ͬ���Ĳ���
			quickSort(array, low, j - 1);
			quickSort(array, j + 1, high);
		}
	}

}
