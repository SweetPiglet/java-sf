package learn.java.sf.px;

import java.util.Arrays;

/**
 * 
 * @version: 1.1.0
 * @Description: 插入排序，平均时间复杂度：n^2,空间复杂度1
 * @author: wsq
 * @date: 2020年6月6日下午6:36:16
 */
public class InsertionSort {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 6, 8, 9, 2, 7, 4, 3, 9 };
		// 调用插入排序
		insertionSort(array);
		// 打印集合
		System.out.println(Arrays.toString(array));
	}

	public static void insertionSort(int[] array) {
		// 遍历外侧的下标大于1所有元素
		for (int i = 1; i < array.length; i++) {
			// 取出需要选择位置的元素
			int max = array[i];
			int j = i - 1;
			// 找出第一个值小于此元素的元素
			while (j >= 0 && max < array[j]) {
				// 将元素后移
				array[j + 1] = array[j];
				j--;
			}
			// 将目标元素放到合适的位置上
			array[j + 1] = max;
		}
	}
}
