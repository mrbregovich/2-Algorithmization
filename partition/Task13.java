package by.mrbregovich.partition;

import java.util.Arrays;

/*
 * ��� ������� ����� ���������� �����������, ���� ��� ���������� ���� �� ����� �� 2 (��������, 41 � 43).
 * ����� � ���������� ��� ���� ���������� �� ������� [n,2n], ��� n - �������� ����������� ����� ������ 2. 
 * ��� ������� ������ ������������ ������������.
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
