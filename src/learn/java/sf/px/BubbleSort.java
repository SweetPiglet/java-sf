package learn.java.sf.px;

import java.util.Arrays;

/**
 * 
 * @version: 1.1.0
 * @Description: ð������ʱ�临�Ӷ�ΪN^2���ռ临�Ӷ�Ϊ1
 * @author: wsq
 * @date: 2020��6��6������5:26:03
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 6, 8, 2, 7, 4, 3, 9 };
		// ���ÿ��ŵķ���
		bubbleSort(array);
		// �������ݵĴ�ӡ
		System.out.println(Arrays.toString(array));
	}

	public static void bubbleSort(int[] array) {
		// ������������
		int temp;
		// �������,һ��Ϊһ�˵ıȽ�
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				// ǰ������ݽ��жԱ�,���ǰ������ݱȺ���Ĵ�,��ô���н���
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
}
