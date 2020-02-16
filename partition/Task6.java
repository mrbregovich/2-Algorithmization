package by.mrbregovich.partition;
/*
 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми
 */

class Task6 {
	public static void main(String[] args) {
		int a = 10, b = 9, c = 17;
		if (areCoPrimeInts(a, b, c))
			System.out.println("Numbers " + a + ", " + b + ", " + c + " are coprimes");
		else
			System.out.println("Numbers " + a + ", " + b + ", " + c + " are not coprimes");

	}

	private static boolean areCoPrimeInts(int a, int b, int c) {
		int gcDiviser = gcd(a, b);
		if (gcDiviser == 1)
			return true;
		else
			return (gcDiviser = gcd(gcDiviser, c)) == 1;
	}

	// вычисление НОД
	private static int gcd(int a, int b) {
		if (b == 0)
			return Math.abs(a);
		return gcd(b, a % b);
	}
}
