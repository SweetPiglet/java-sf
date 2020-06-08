package learn.java.sf.px;

import java.util.Arrays;

/**
 * 
 * @version: 1.1.0
 * @Description: 希尔排序，时间复杂度：nlog2 n，空间复杂度：1
 * @author: wsq
 * @date: 2020年6月6日下午9:25:27
 */
public class ShellSort {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 6, 8, 9, 2, 7, 4, 3, 9 };
		// 调用希尔排序
		shellSort(array);
		// 打印数组
		System.out.println(Arrays.toString(array));
	}

	public static void shellSort(int[] array) {
		// 计算最小增量
		int gap = array.length / 2;
		while (gap > 0) {
			// 插入排序
			for (int i = gap; i < array.length; i++) {
				int temp = array[i];
				int j = i - gap;
				while (j >= 0 && temp < array[j]) {
					array[j + gap] = array[j];
					j = j - gap;
				}
				array[j + gap] = temp;
			}
			// 计算最小增量
			gap /= 2;
		}
	}
}
