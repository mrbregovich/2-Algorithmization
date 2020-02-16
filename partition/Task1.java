package by.mrbregovich.partition;

/*
 * Ќаписать метод(методы) дл€ нахождени€ наибольшего общего делител€ и наименьшего общего кратного двух
 * натуральных чисел:
 */

import by.mrbregovich.helperPackage.UserInputHelper;

class Task1 {
	public static void main(String[] args) {
		UserInputHelper usrInput = new UserInputHelper();
		int a, b;
		do {
			System.out.println("¬ведите два целых числа больше нул€");
			a = usrInput.getIntValue("a: ");
			b = usrInput.getIntValue("b: ");
		} while (a <= 0 || b <= 0);
		System.out.println("Ќаименьшее общее кратное чисел " + a + " и " + b + " равно " + lcm(a, b));
	}

	// вычисление Ќќƒ
	private static int gcd(int a, int b) {
		if (b == 0)
			return Math.abs(a);
		return gcd(b, a % b);
	}

	// вычисление наименьшего общего кратного
	private static int lcm(int a, int b) {
		return a / gcd(a, b) * b;
	}
}
