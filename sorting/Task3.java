package by.mrbregovich.sorting;

import java.util.Arrays;

/*
 * Сортировка выбором. Дана последовательность чисел a1 <= a2 <=... <= an .Требуется переставить элементы так,
 * чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
 * элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
 * повторяется. Написать алгоритм сортировки выбором
 */

import by.mrbregovich.helperPackage.ArrayHelper;

class Task3 {
	public static void main(String[] args) {
		ArrayHelper arrHelper = new ArrayHelper();
		int size = 30;
		int[] arr = arrHelper.getRandomIntArray(size, -10, 11);
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Массив после сортировки вставками: ");
		long time = System.nanoTime();
		selectionDescSort(arr);
		time = System.nanoTime() - time;
		System.out.println(Arrays.toString(arr));
		System.out.println("Время на сортировку: " + time + " наносек");
	}

	private static void selectionDescSort(int[] arr) {
		int maxInd;
		for (int i = 0; i < arr.length - 1; i++) {
			maxInd = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[maxInd])
					maxInd = j;
			}
			swap(arr, i, maxInd);
		}
	}

	private static void swap(int[] arr, int iIndex, int jIndex) {
		int temp = arr[iIndex];
		arr[iIndex] = arr[jIndex];
		arr[jIndex] = temp;
	}

}
