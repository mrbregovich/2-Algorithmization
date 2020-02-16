package by.mrbregovich.simpleArrays;

/*
 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
 * положительных и нулевых элементов
 */
import java.util.Arrays;

import by.mrbregovich.helperPackage.*;

class Task3 {
	public static void main(String[] args) {

		UserInputHelper inputHelp = new UserInputHelper();
		ArrayHelper arrHelp = new ArrayHelper();
		// размер массива
		int n = 0;
		// счетчик отрицательных элементов
		int negCounter = 0;
		// счетчик положительных элементов
		int posCounter = 0;
		// счетчик элементов, равных нулю
		int zeroCounter = 0;

		while (n <= 0) {
			n = inputHelp.getIntValue("Введите размер массива: ");
		}

		int[] arr = arrHelp.getRandomIntArray(n, -100, 100);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0)
				negCounter++;
			else if (arr[i] > 0)
				posCounter++;
			else
				zeroCounter++;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Количество отрицательных элементов: " + negCounter);
		System.out.println("Количество положительных элементов: " + posCounter);
		System.out.println("Количество элементов, равных нулю: " + zeroCounter);
	}
}
