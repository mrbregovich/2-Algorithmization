package by.mrbregovich.partition;

/*
 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких 
 * действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */

class Task17 {
	public static void main(String[] args) {
		int number = 1758;
		int count = 0;
		while (number > 0) {
			number -= getSumOfDigits(number);
			count++;
		}
		System.out.println(count);
	}

	private static int getSumOfDigits(int num) {
		int sum = num % 10;
		while ((num = num / 10) != 0)
			sum += num % 10;
		return sum;
	}
}
