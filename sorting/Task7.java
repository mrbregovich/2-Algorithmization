package by.mrbregovich.sorting;

/*
 * Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <=...<= an и b1 <=b2 <=...<= bm .
 * Требуется указать те места, на которые нужно вставлять элементы последовательности b1 <= b2 <=...<= bm в первую
 * последовательность так, чтобы новая последовательность оставалась возрастающей
 */

import by.mrbregovich.helperPackage.ArrayHelper;

import java.util.Arrays;

class Task7 {
	public static void main(String[] args) {
		ArrayHelper arrHelper = new ArrayHelper();
		int size = 10;
		int[] arrA = arrHelper.getRandomIntArray(size, -10, 10);
		Arrays.sort(arrA);
		int[] arrB = arrHelper.getRandomIntArray(size, -10, 10);
		Arrays.sort(arrB);
		System.out.println("Массив arrА неубывающих чисел");
		System.out.println(Arrays.toString(arrA));
		System.out.println("Массив arrB неубывающих чисел");
		System.out.println(Arrays.toString(arrB));
		int indA = 0;
		int indB = 0;
		// элемнты последовательности B, которые вставляются в начало последовательности
		// А
		while (indB < arrB.length && arrB[indB] < arrA[indA]) {
			indB++;
		}
		if (indB > 0) {
			System.out.println("Перед элементом arrА[" + indA + "]:" + arrA[indA] + " вставляются " + " элементы:");
			for (int i = 0; i < indB; i++) {
				System.out.print("arrB[" + i + "]:" + arrB[i] + "  ");
			}
			System.out.println();
		}
		// вставка в середину последовательности А
		while (indA < arrA.length && indB < arrB.length) {
			if (arrB[indB] < arrA[indA]) {
				System.out.println("Вставить элемент arrB[" + indB + "]:" + arrB[indB] + " перед элементом arrA[" + indA
						+ "]:" + arrA[indA]);
				indB++;
			} else {
				indA++;
			}
		}
		// проверить оставшиеся элементы в последовательности arrB
		if (indA == arrA.length) {
			System.out.println("В конец последовательности arrA вставить элементы:");
			for (int i = indB; i < arrB.length; i++) {
				System.out.print("arrB[" + i + "]:" + arrB[i] + "  ");
			}
		}
	}

}
