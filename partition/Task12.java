package by.mrbregovich.partition;

import java.util.Arrays;

/*
 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого 
 * являются числа, сумма цифр которых равна К и которые не большее N.
 */

class Task12 {
	public static void main(String[] args) {
		int k = 5, n = 999;
		int[] arr = getArray(k, n);
		System.out.println(Arrays.toString(arr));
	}

	private static int getSumOfDigits(int num) {
		int sum = num % 10;
		while ((num = num / 10) != 0)
			sum += num % 10;
		return sum;
	}

	private static int[] getArray(int k, int n) {
		int size = 0;
		for (int i = 1; i <= n; i++) {
			int sum = getSumOfDigits(i);
			if (sum == k)
				size++;
		}
		int[] arr = new int[size];
		int j = 0;
		for (int i = 1; i <= n; i++) {
			int sum = getSumOfDigits(i);
			if (sum == k)
				arr[j++] = i;
		}
		return arr;
	}
}
