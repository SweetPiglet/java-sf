package learn.java.sf.px;

import java.util.Arrays;

/**
 * 
 * @version: 1.1.0
 * @Description: 冒泡排序，时间复杂度为N^2，空间复杂度为1
 * @author: wsq
 * @date: 2020年6月6日下午5:26:03
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 6, 8, 2, 7, 4, 3, 9 };
		// 调用快排的方法
		bubbleSort(array);
		// 进行数据的打印
		System.out.println(Arrays.toString(array));
	}

	public static void bubbleSort(int[] array) {
		// 用来交换数据
		int temp;
		// 外层排序,一次为一趟的比较
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				// 前后的数据进行对比,如果前面的数据比后面的大,那么进行交换
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
}
