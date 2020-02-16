package by.mrbregovich.partition;

/*
 * Ќаписать метод(методы) дл€ вычислени€ суммы факториалов всех нечетных чисел от 1 до 9
 */

class Task7 {
	public static void main(String[] args) {
		int num = 9;
		System.out.println(sumOfFact(num));
	}

	//нахождение факториала числа
	private static int fact(int num) {
		int f = 1;
		for (int i = 2; i <= num; i++) {
			f *= i;
		}
		return f;
	}
	//нахождение суммы факториалов чисел от 1 до num включительно
	private static int sumOfFact(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i += 2) {
			sum += fact(i);
		}
		return sum;
	}
}
