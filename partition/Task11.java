package by.mrbregovich.partition;
/*
 *  Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */

class Task11 {
	public static void main(String[] args) {
		int a = 123456;
		int b = 1234567;
		findLongerNum(a, b);

	}

	private static int getLen(int num) {
		int count = 1;
		while ((num /= 10) != 0)
			count++;
		return count;
	}

	private static void findLongerNum(int firstNum, int secondNum) {
		int firstNumLen = getLen(firstNum);
		int secondNumLen = getLen(secondNum);
		if (firstNumLen > secondNumLen)
			System.out.println("Число " + firstNum + " содержит больше цифр, чем " + secondNum);
		else if (firstNumLen < secondNumLen)
			System.out.println("Число " + secondNum + " содержит больше цифр, чем " + firstNum);
		else
			System.out.println("Количество цифр в обоих числах одинаково");

	}
}
