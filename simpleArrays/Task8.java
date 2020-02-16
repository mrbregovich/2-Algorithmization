package by.mrbregovich.simpleArrays;
/*
 * Дана последовательность целых чисел a1,a2,...,an . Образовать новую последовательность, выбросив из
 * исходной те члены, которые равны min(a1,a2,...,an)
 */

import java.util.Arrays;

import by.mrbregovich.helperPackage.ArrayHelper;

class Task8 {
	public static void main(String[] args) {
		ArrayHelper arrHelp = new ArrayHelper();
		int n = 40;
		int[] arr = arrHelp.getRandomIntArray(n, 5, 10);
		System.out.println(Arrays.toString(arr));
		int min = Integer.MAX_VALUE;
		int minCounter = 0;
		for (int elem : arr) {
			if (elem < min) {
				min = elem;
				// сбрасываем количество минимальных элементов до 1
				minCounter = 1;
			} else if (elem == min) {
				// если совпадение с минимаальным элементом, приращение значения
				minCounter++;
			}
		}

		int[] newArr = new int[n - minCounter];
		for (int i = 0, j = 0; i < n; i++) {
			if (arr[i] != min) {
				newArr[j++] = arr[i];
			}
		}

		System.out.println("Значение минимального элемента старого массива: " + min);
		System.out.println("Количество минимальных элементов старого массива: " + minCounter);
		System.out.println("Новый массив");
		System.out.println(Arrays.toString(newArr));
	}

}
