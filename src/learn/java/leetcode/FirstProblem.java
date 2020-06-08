package learn.java.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 
 * @version: 1.1.0
 * @Description: 特殊等价字符串组test
 * @author: wsq
 * @date: 2020年6月7日下午9:00:24
 */
@SuppressWarnings("all")
public class FirstProblem {
	public static void main(String[] args) {
		Arrays.asList(args);
		// 获取用户输入的集合
		List<String> inputList = getInputList();
		// 获取结果
		int count = getResultList(inputList);
		System.err.println("The count is:" + count);
	}

	/**
	 * 
	 * @Description: 获取用户输入的集合
	 * @author: wsq
	 * @date: 2020年6月7日下午9:00:24
	 */
	public static List<String> getInputList() {
		List<String> inputList = new ArrayList<String>();
		int stringSize = 0;
		while (true) {
			// 输入每一个字符串的长度
			System.out.println("Please input the length of each string");
			stringSize = new Scanner(System.in).nextInt();
			if (stringSize < 20) {
				break;
			}
			// 长度不可以超过20
			System.out.println("Please input again,the length of the string cannot exceed 20");
		}
		while (true) {
			// 数组总长度不可以超过1000
			if (inputList.size() == 1000) {
				System.out.println("The length is exceed 1000,you can't input anything");
				break;
			}
			System.out.println("Please input string");
			String value = new Scanner(System.in).nextLine();
			// 每个字符串长度必须相同
			if (value.length() != stringSize) {
				System.out.println("Please input again,the string length must be 20" + stringSize);
				continue;
			}
			// 字符串必须都为小写字母
			if (!isLetterDigit(value)) {
				System.out.println("Please input again,string must consist of lowercase letters");
				continue;
			}
			inputList.add(value);
			// 输入N退出循环，停止输入
			System.out.println("Input anything to go on or input 'N' to leave");
			String button = new Scanner(System.in).nextLine();
			if (button.equals("N")) {
				break;
			}
		}
		return inputList;
	}

	/**
	 * 
	 * @Description: 获取最终的结果
	 * @author: wsq
	 * @date: 2020年6月7日下午9:00:24
	 */
	public static int getResultList(List<String> inputList) {
		// 用户存储处理过的数据(去重)
		Set<String> changeList = new HashSet<String>();
		for (int index = 0; index < inputList.size(); index++) {
			// 用来放奇数
			List<Character> oddList = new ArrayList<Character>();
			// 用来放偶数
			List<Character> evenList = new ArrayList<Character>();
			String input = inputList.get(index);
			char[] array = input.toCharArray();
			// 奇偶分离
			for (int i = 0; i < array.length; i++) {
				if (i % 2 != 0) {
					oddList.add(array[i]);
				} else {
					evenList.add(array[i]);
				}
			}
			// 分别排序
			Collections.sort(oddList);
			Collections.sort(evenList);
			// 集合合并
			oddList.addAll(evenList);
			// 转化为字符串
			String change = oddList.stream().map(String::valueOf).collect(Collectors.joining(","));
			changeList.add(change);
		}
		return changeList.size();
	}

	/**
	 * 
	 * @Description: 正则表达式（只能为小写字母）
	 * @author: wsq
	 * @date: 2020年6月7日下午9:00:24
	 */
	public static boolean isLetterDigit(String str) {
		String regex = "^[a-z]+$";
		return str.matches(regex);
	}

}
