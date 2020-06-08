package learn.java.sf.px;

import java.util.Arrays;

/**
 * 
 * @version: 1.1.0
 * @Description: 堆排序，时间复杂度：nlogn，空间复杂度：1
 * @author: wsq
 * @date: 2020年6月7日上午11:47:07
 */
public class HeapSort {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 6, 8, 9, 2, 7, 4, 3, 9 };
		// 调用堆排序
		heapSort(array, array.length);
		// 打印数组
		System.out.println(Arrays.toString(array));
	}

	public static void heapSort(int[] array, int length) {
		for (int i = length / 2; i >= 0; i--) {
			judgeAndChange(array, i, length);
		}
		// 交换堆顶的值
		int temp = array[0];
		array[0] = array[length - 1];
		array[length - 1] = temp;
		// 递归调用
		length -= 1;
		if (length > 1) {
			heapSort(array, length);
		}
	}

	public static void judgeAndChange(int[] array, int i, int length) {
		// 默认自己为最大值
		int max = i;
		// 获取左子节点
		int leftCode = i * 2 + 1;
		// 获取右子节点
		int rightCode = leftCode + 1;
		// 比较左子节点和最大节点
		if (leftCode < length && array[leftCode] > array[max]) {
			max = leftCode;
		}
		// 比较左子节点和最大节点
		if (rightCode < length && array[rightCode] > array[max]) {
			max = rightCode;
		}
		// 进行父节点和子节点的交换
		if (max != i) {
			int temp = array[max];
			array[max] = array[i];
			array[i] = temp;
			// 处理节点交换导致的问题
			judgeAndChange(array, max, length);
		}
	}
}
