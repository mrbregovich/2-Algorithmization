package by.mrbregovich.partition;

import java.util.Arrays;

/*
 * Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. 
 * Для решения задачи использовать декомпозицию.
 */

class Task13 {
	public static void main(String[] args) {
		printTwinPrimes(3, 1000);

	}

	private static boolean[] findPrimeNumbers(int n) {
		boolean[] primes = new boolean[n + 1];
		Arrays.fill(primes, true);

		for (int i = 2; i * i < n; i++) {
			if (primes[i]) {
				for (int j = i * i; j <= n; j += i)
					primes[j] = false;
			}
		}
		return primes;
	}

	private static boolean checkForTwinPrimes(int num, boolean[] primes) {
		if (primes[num] && primes[num + 2])
			return true;
		return false;
	}

	private static void printTwinPrimes(int start, int end) {
		boolean[] primes = findPrimeNumbers(end);
		for (int i = start; i + 2 <= end; i++) {
			if (checkForTwinPrimes(i, primes))
				System.out.println(i + "  " + (i + 2));
		}
	}
}
