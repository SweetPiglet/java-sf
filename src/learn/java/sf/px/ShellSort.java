package learn.java.sf.px;

import java.util.Arrays;

/**
 * 
 * @version: 1.1.0
 * @Description: ϣ������ʱ�临�Ӷȣ�nlog2 n���ռ临�Ӷȣ�1
 * @author: wsq
 * @date: 2020��6��6������9:25:27
 */
public class ShellSort {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 6, 8, 9, 2, 7, 4, 3, 9 };
		// ����ϣ������
		shellSort(array);
		// ��ӡ����
		System.out.println(Arrays.toString(array));
	}

	public static void shellSort(int[] array) {
		// ������С����
		int gap = array.length / 2;
		while (gap > 0) {
			// ��������
			for (int i = gap; i < array.length; i++) {
				int temp = array[i];
				int j = i - gap;
				while (j >= 0 && temp < array[j]) {
					array[j + gap] = array[j];
					j = j - gap;
				}
				array[j + gap] = temp;
			}
			// ������С����
			gap /= 2;
		}
	}
}
