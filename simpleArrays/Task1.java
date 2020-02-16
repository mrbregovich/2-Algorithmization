package by.mrbregovich.simpleArrays;
/*
 * В массив A[n] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному k.
 */

import java.util.Arrays;

import by.mrbregovich.helperPackage.ArrayHelper;
import by.mrbregovich.helperPackage.UserInputHelper;

class Task1 {
	public static void main(String[] args) {
		// получение данных от пользователя
		UserInputHelper usrInput = new UserInputHelper();
		int n = 0;
		while (n <= 0) {
			n = usrInput.getIntValue("Введите размер массива больше нуля: ");
		}
		int k = 0;
		while (k < 1 || k > 10) {
			k = usrInput.getIntValue("Введите число k от 1 до 10 включительно: ");
		}

		// создание массива
		ArrayHelper arrHelper = new ArrayHelper();
		int[] arr = arrHelper.getRandomIntArray(n, -100, 100);
		System.out.println("Массив из " + n + " случайных чисел от -100 до 100");
		System.out.println(Arrays.toString(arr));

		// поиск суммы
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % k == 0)
				sum += arr[i];
		}
		System.out.println("Сумма элементов массива, кратных " + k + ", равна " + sum);
	}
}
