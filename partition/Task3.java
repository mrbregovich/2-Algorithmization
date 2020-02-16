package by.mrbregovich.partition;

/*
 * Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
 * треугольника
 */

import java.util.Random;

class Task3 {
	public static void main(String[] args) {
		int a = new Random().nextInt(21) + 1;
		System.out.println("Площадь правильного шестиугольника со стороной " + a + " равна " + 6 * triangleSq(a));

	}

	private static double triangleSq(int size) {
		return Math.pow(3, 1 / 2) / 4 * size * size;
	}
}
