package learn.java.sf.px;

import java.util.Arrays;

/**
 * 
 * @version: 1.1.0
 * @Description: 归并排序，时间复杂度：nlogn，空间复杂度：n
 * @author: wsq
 * @date: 2020年6月7日上午10:05:03
 */
public class MergeSort {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 8, 9, 2, 4, 10, 6, 7 };
		// 调用归并排序
		int[] result = mergeSort(array);
		// 打印数组
		System.out.println(Arrays.toString(result));
	}

	public static int[] mergeSort(int[] array) {
		// 用于判断左右集合是不是不可以继续进行二次拆分，退出递归
		if (array.length < 2) {
			return array;
		}
		// 左数组
		int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
		// 右数组
		int[] right = Arrays.copyOfRange(array, array.length / 2, array.length);
		return merge(mergeSort(left), mergeSort(right));

	}

// 左右数组进行对比和并
	public static int[] merge(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		for (int i = 0, j = 0, index = 0; index < result.length; index++) {
			if (i >= left.length) {
				result[index] = right[j++];
			} else if (j >= right.length) {
				result[index] = left[i++];
			} else if (left[i] > right[j]) {
				result[index] = right[j++];
			} else {
				result[index] = left[i++];
			}
		}
		return result;
	}
}
