package by.mrbregovich.simpleArrays;

/*
 * Даны действительные числа a1,a2,...,a2n . Найти max( a1 + a2n,a2 + a2n-1,...,an + an+1)
 */

import by.mrbregovich.helperPackage.*;
import java.util.*;

class Task7 {
	public static void main(String[] args) {

		ArrayHelper arrHelper = new ArrayHelper();
		UserInputHelper usrInput = new UserInputHelper();

		int n = 0;
		while (n <= 0 || n % 2 != 0) {
			n = usrInput.getIntValue("Введите число элементов последовательности (четное число > 0): ");
		}
		int[] arr = arrHelper.getRandomIntArray(n, -20, 20);
		System.out.println(Arrays.toString(arr));

		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < n / 2; i++) {
			if (arr[i] + arr[n - 1 - i] > maxSum)
				maxSum = arr[i] + arr[n - 1 - i];
		}
		System.out.println("Максимальная сумма: " + maxSum);
	}

}
