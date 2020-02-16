package by.mrbregovich.sorting;

import java.util.Arrays;

/*
 * Сортировка обменами. Дана последовательность чисел a1 <= a2 <=...<= an .Требуется переставить числа в
 * порядке убывания. Для этого сравниваются два соседних числа ai и ai+1 . Если ai > ai+1 , то делается
 * перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */

import by.mrbregovich.helperPackage.ArrayHelper;

class Task4 {
	public static void main(String[] args) {
		ArrayHelper arrHelper = new ArrayHelper();
		int size = 30;
		int[] arr = arrHelper.getRandomIntArray(size, -20, 21);
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int counter = 0;
		long time = System.nanoTime();
		counter = bubbleDescSort(arr);
		time = System.nanoTime() - time;
		System.out.println("Массив после сортировки");
		System.out.println(Arrays.toString(arr));
		System.out.println("Количество перестановок: " + counter);
		System.out.println("Время сортировки: " + time + " наносек");
	}

	private static int bubbleDescSort(int[] arr) {
		int counter = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = arr.length - 1; j > i; j--) {
				if (arr[j] > arr[j - 1]) {
					swap(arr, j, j - 1);
					counter++;
				}
			}
		}
		return counter;
	}

	private static void swap(int[] arr, int iInd, int jInd) {
		int temp = arr[iInd];
		arr[iInd] = arr[jInd];
		arr[jInd] = temp;
	}
}
