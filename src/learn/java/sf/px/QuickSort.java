package learn.java.sf.px;

import java.util.Arrays;

/**
 * 
 * @version: 1.1.0
 * @Description: 快速排序，时间复杂度：nlogn，空间复杂度：1
 * @author: wsq
 * @date: 2020年6月7日上午11:05:32
 */
public class QuickSort {
	public static void main(String[] args) {
		int[] array = new int[] { 5, 10, 9, 7, 8, 2, 1, 3, 4, 6 };
		// 调用快速排序
		quickSort(array, 0, array.length - 1);
		// 打印数组
		System.out.println(Arrays.toString(array));
	}

	public static void quickSort(int[] array, int low, int high) {
		// 最小数组
		if (low < high) {
			int i = low;
			int j = high;
			int middle = array[low];
			// 进行判断，并且互换
			while (i < j) {
				// 寻找出左边的不合适元素
				while (i < j && array[j] >= middle) {
					j--;
				}
				// 寻找出右边的不合适元素
				while (i < j && array[i] <= middle) {
					i++;
				}
				if (i < j) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			// 将基准和最后指针位置的数进行互换
			array[low] = array[j];
			array[j] = middle;
			// 将基准数左边和右边进行同样的操作
			quickSort(array, low, j - 1);
			quickSort(array, j + 1, high);
		}
	}

}
