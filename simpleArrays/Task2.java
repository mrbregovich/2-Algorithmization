package by.mrbregovich.simpleArrays;

/*
 * Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, 
 * этим числом. Подсчитать количество замен.
 */
import java.util.Arrays;

import by.mrbregovich.helperPackage.ArrayHelper;
import by.mrbregovich.helperPackage.UserInputHelper;

class Task2 {
	public static void main(String[] args) {
		UserInputHelper inputHeper = new UserInputHelper();
		int z = inputHeper.getIntValue("Введите целое число: ");
		int counter = 0;
		ArrayHelper arrHelper = new ArrayHelper();
		int[] arr = arrHelper.getRandomIntArray(20, -100, 100);
		System.out.println("Массив из 20 случайных чисел от -100 до 100");
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > z) {
				arr[i] = z;
				counter++;
			}
		}
		System.out.println("\nМассив после замены всех элементов больше " + z + " на " + z);
		System.out.println(Arrays.toString(arr));
		System.out.println("Всего осуществлено замен: " + counter);
	}

}
