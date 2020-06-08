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
 * @Description: ����ȼ��ַ�����test
 * @author: wsq
 * @date: 2020��6��7������9:00:24
 */
@SuppressWarnings("all")
public class FirstProblem {
	public static void main(String[] args) {
		Arrays.asList(args);
		// ��ȡ�û�����ļ���
		List<String> inputList = getInputList();
		// ��ȡ���
		int count = getResultList(inputList);
		System.err.println("The count is:" + count);
	}

	/**
	 * 
	 * @Description: ��ȡ�û�����ļ���
	 * @author: wsq
	 * @date: 2020��6��7������9:00:24
	 */
	public static List<String> getInputList() {
		List<String> inputList = new ArrayList<String>();
		int stringSize = 0;
		while (true) {
			// ����ÿһ���ַ����ĳ���
			System.out.println("Please input the length of each string");
			stringSize = new Scanner(System.in).nextInt();
			if (stringSize < 20) {
				break;
			}
			// ���Ȳ����Գ���20
			System.out.println("Please input again,the length of the string cannot exceed 20");
		}
		while (true) {
			// �����ܳ��Ȳ����Գ���1000
			if (inputList.size() == 1000) {
				System.out.println("The length is exceed 1000,you can't input anything");
				break;
			}
			System.out.println("Please input string");
			String value = new Scanner(System.in).nextLine();
			// ÿ���ַ������ȱ�����ͬ
			if (value.length() != stringSize) {
				System.out.println("Please input again,the string length must be 20" + stringSize);
				continue;
			}
			// �ַ������붼ΪСд��ĸ
			if (!isLetterDigit(value)) {
				System.out.println("Please input again,string must consist of lowercase letters");
				continue;
			}
			inputList.add(value);
			// ����N�˳�ѭ����ֹͣ����
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
	 * @Description: ��ȡ���յĽ��
	 * @author: wsq
	 * @date: 2020��6��7������9:00:24
	 */
	public static int getResultList(List<String> inputList) {
		// �û��洢�����������(ȥ��)
		Set<String> changeList = new HashSet<String>();
		for (int index = 0; index < inputList.size(); index++) {
			// ����������
			List<Character> oddList = new ArrayList<Character>();
			// ������ż��
			List<Character> evenList = new ArrayList<Character>();
			String input = inputList.get(index);
			char[] array = input.toCharArray();
			// ��ż����
			for (int i = 0; i < array.length; i++) {
				if (i % 2 != 0) {
					oddList.add(array[i]);
				} else {
					evenList.add(array[i]);
				}
			}
			// �ֱ�����
			Collections.sort(oddList);
			Collections.sort(evenList);
			// ���Ϻϲ�
			oddList.addAll(evenList);
			// ת��Ϊ�ַ���
			String change = oddList.stream().map(String::valueOf).collect(Collectors.joining(","));
			changeList.add(change);
		}
		return changeList.size();
	}

	/**
	 * 
	 * @Description: ������ʽ��ֻ��ΪСд��ĸ��
	 * @author: wsq
	 * @date: 2020��6��7������9:00:24
	 */
	public static boolean isLetterDigit(String str) {
		String regex = "^[a-z]+$";
		return str.matches(regex);
	}

}
