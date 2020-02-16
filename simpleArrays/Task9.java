package by.mrbregovich.simpleArrays;

/*
 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
 * чисел несколько, то определить наименьшее из них
 */

import by.mrbregovich.helperPackage.*;
import java.util.Arrays;

class Task9 {
	public static void main(String[] args) {
		ArrayHelper arrHelper = new ArrayHelper();
		UserInputHelper usrInput = new UserInputHelper();
		int n = 0;
		System.out.println("Введите размер массива n больше нуля");
		while (n <= 0) {
			n = usrInput.getIntValue("n: ");
		}
		int[] arr = arrHelper.getRandomIntArray(n, 0, 5);
		System.out.println(Arrays.toString(arr));

		// массив popular[] хранит количество повторений каждого уникального числа в
		// массиве.
		// если число повторяется, то 2 и все последующие помечаются как -1 в массиве
		// popular[]
		int[] popular = new int[n];
		for (int i = 0; i < n; i++) {
			// -1 как флаг для чисел, которые уже встречались и соответственно подсчитаны
			// ранее => пропустить
			if (popular[i] == -1)
				continue;
			// не -1, значит число новое => подсчитать циклом количество вхождений в массив,
			// помечая повторы -1
			for (int j = i; j < n; j++)
				if (arr[j] == arr[i]) {
					popular[i]++;
					popular[j] = -1;
				}
		}

		// найти самое популярное число. если их несколько, найти минимальное
		int num = arr[0];
		int maxFrequency = popular[0];
		for (int i = 1; i < n; i++) {
			if (popular[i] > maxFrequency) {
				num = arr[i];
				maxFrequency = popular[i];
			} else if ((popular[i] == maxFrequency) && (arr[i] < num)) {
				num = arr[i];
			}
		}

		System.out.println("Наиболее встречаемое число (минимальное): " + num);

	}

}
