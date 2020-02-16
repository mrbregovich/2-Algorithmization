package by.mrbregovich.sorting;

/*
 * Сортировка вставками. Дана последовательность чисел a1,a2,...,an . Требуется переставить числа в порядке
 * возрастания. Делается это следующим образом. Пусть a1,a2,..,ai - упорядоченная последовательность, т. е.
 * a1 <= a2 <=...<= an . Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
 * последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
 * не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
 * с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */

import by.mrbregovich.helperPackage.ArrayHelper;

import java.util.Arrays;

class Task5 {
	public static void main(String[] args) {
		ArrayHelper arrHelper = new ArrayHelper();
		int size = 100;
		int[] arr = arrHelper.getRandomIntArray(size, -20, 21);
		System.out.println(Arrays.toString(arr));
		long time = System.nanoTime();
		insertionSort(arr);
		time = System.nanoTime() - time;
		System.out.println("Массив после сортировки");
		System.out.println(Arrays.toString(arr));
		System.out.println("Время сортировки: " + time + " наносек");

	}

	private static void insertionSort(int[] arr) {
		int pos;
		for (int i = 1; i < arr.length; i++) {
			pos = binarySearch(i, arr);
			if (pos != i)
				insert(i, pos, arr);
		}
	}

	private static int binarySearch(int curPos, int[] arr) {
		int leftBoud = 0;
		int rightBound = curPos - 1;
		int pos = curPos;
		while (leftBoud <= rightBound) {
			pos = leftBoud + (rightBound - leftBoud) / 2;
			if (arr[curPos] < arr[pos]) {
				rightBound = pos - 1;
			} else {
				leftBoud = pos + 1;
				pos++;
			}
		}
		return pos;
	}

	private static void insert(int curInd, int newPos, int[] arr) {
		// сохранить текущий элемент
		int temp = arr[curInd];
		// сдвинуть элементы массива на 1 позицию вправо начиная с newPos до curInd
		for (int i = curInd; i > newPos; i--) {
			arr[i] = arr[i - 1];
		}
		arr[newPos] = temp;
	}
}
