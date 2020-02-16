package by.mrbregovich.sorting;

/*
 * Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
 * один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
 * дополнительный массив
 */

import by.mrbregovich.helperPackage.ArrayHelper;
import by.mrbregovich.helperPackage.UserInputHelper;

import java.util.Arrays;

class Task1 {
	public static void main(String[] args) {
		UserInputHelper usrInput = new UserInputHelper();
		ArrayHelper arrHelper = new ArrayHelper();
		int sizeA = 20;
		int sizeB = 10;
		int[] arrA = arrHelper.getRandomIntArray(sizeA, 0, 100);
		int[] arrB = arrHelper.getRandomIntArray(sizeB, 0, 100);
		System.out.println("Введите число k в интервале от 0 до " + (sizeA - 1));
		System.out.println("При вводе числа меньше 0 или больше " + (sizeA - 1)
				+ " второй массив будет вставлен в начали или конец первого массива соответственно");
		int k = usrInput.getIntValue("k: ");
//		if (k < 0)
//			k = 0;
//		else if (k > sizeA - 1)
//			k = sizeA - 1;
		System.out.println("Изначальные массивы");
		System.out.println(Arrays.toString(arrA));
		System.out.println(Arrays.toString(arrB));
		System.out.println("Массив после слияния");
		System.out.println(Arrays.toString(merge(arrA, arrB, k)));

	}

	private static int[] merge(int[] left, int[] right, int k) {
		int[] arr = new int[left.length + right.length];
		if (k < 0) {
			// вставка в начало массива
			for (int i = 0; i < right.length; i++)
				arr[i] = right[i];
			for (int i = 0; i < left.length; i++)
				arr[right.length + i] = left[i];
		} else if (k > left.length - 1) {
			// вставка в конец массива
			for (int i = 0; i < left.length; i++)
				arr[i] = left[i];
			for (int i = 0; i < right.length; i++)
				arr[left.length + i] = right[i];
		} else {
			// вставка в середину массива
			for (int i = 0; i <= k; i++)
				arr[i] = left[i];
			for (int i = 0; i < right.length; i++)
				arr[k + 1 + i] = right[i];
			for (int i = k + 1; i < left.length; i++)
				arr[i + right.length] = left[i];
		}
		return arr;
	}

}
