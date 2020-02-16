package by.mrbregovich.partition;

import java.util.Arrays;

import by.mrbregovich.helperPackage.ArrayHelper;

/*
 * Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. 
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов 
 * массива с номерами от k до m.
 */

class Task8 {
	public static void main(String[] args) {
		ArrayHelper arrHelper = new ArrayHelper();
		int[] arr = arrHelper.getRandomIntArray(10, 0, 10);
		System.out.println(Arrays.toString(arr));
		System.out.println("Сумма элементов с индексами 1, 2 и 3 равна: " + sumofThreeElems(arr, 1));
		System.out.println("Сумма элементов с индексами 3, 4 и 5 равна: " + sumofThreeElems(arr, 3));
		System.out.println("Сумма элементов с индексами 4, 5 и 6 равна: " + sumofThreeElems(arr, 4));
	}

	// если элементов меньше трех, возвращается сумма доступных элемнтов
	private static int sumofThreeElems(int[] arr, int startIndex) {
		int sum = 0;
		for (int i = startIndex; i < arr.length && i < startIndex + 3; i++)
			sum += arr[i];
		return sum;
	}
}
