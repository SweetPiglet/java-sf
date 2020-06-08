package learn.java.sf.px;

import java.util.Arrays;

/**
 * 
 * @version: 1.1.0
 * @Description: 选择排序,时间复杂度为：n^2,空间夫复杂度为1
 * @author: wsq
 * @date: 2020年6月6日下午5:42:24
 */
public class SelectionSort {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 8, 9, 2, 4, 10, 6, 7 };
		// 调用选择排序
		selection(array);
		// 打印数组
		System.out.println(Arrays.toString(array));
	}

	public static void selection(int[] array) {
		// 按顺序取出数组中的第一个数字
		for (int i = 0; i < array.length - 1; i++) {
			// 获取最小的元素的下标
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[minIndex] > array[j]) {
					minIndex = j;
				}
			}
			// 将i指向的当前位置的元素与最小元素互换
			// 判断是否需要进行互换
			if (minIndex != i) {
				int temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
		}
	}
}
