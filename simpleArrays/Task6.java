package by.mrbregovich.simpleArrays;

/*
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
 * являются простыми числами.
 */
import java.util.Arrays;
import by.mrbregovich.helperPackage.ArrayHelper;

class Task6 {
	public static void main(String[] args) {
		ArrayHelper helper = new ArrayHelper();
		// количество членов последовательности
		int n = 30;
		double[] arr = helper.getRandomDoubleArray(n, 0, 100);
		System.out.println(Arrays.toString(arr));

		// массив для отметок о простых числах
		boolean[] isPrime = new boolean[n];
		for (int i = 2; i < n; i++)
			isPrime[i] = true;

		for (int i = 2; i * i < n; i++) {
			if (isPrime[i])
				// числа кратные i не простые
				for (int j = i; j * i < n; j++)
					isPrime[i * j] = false;
		}

		// суммируем элементы, чьи индексы - простые числа
		double sum = 0;
		for (int i = 2; i < n; i++) {
			if (isPrime[i])
				sum += arr[i];
		}

		System.out.println("сумма равна " + sum);
	}

}
