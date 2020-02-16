package by.mrbregovich.partition;

/*
 * Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую 
 * последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */

class Task15 {
	public static void main(String[] args) {
		int size = 3;
		printStrictlyAscendingNums(size);

	}

	private static boolean isStrictlyAscending(int num, int numOdDigits) {
		boolean flag = true;
		int currDigit = num % 10;
		for (int i = 0; i < numOdDigits - 1; i++) {
			num /= 10;
			if (num % 10 >= currDigit) {
				flag = false;
				break;
			}
			currDigit = num % 10;
		}
		return flag;
	}

	private static void printStrictlyAscendingNums(int numOfDigits) {
		int x = (int) Math.pow(10, numOfDigits - 1);
		for (int i = 1 * x; i < 10 * x; i++) {
			if (isStrictlyAscending(i, numOfDigits))
				System.out.println(i);
		}
	}
}
