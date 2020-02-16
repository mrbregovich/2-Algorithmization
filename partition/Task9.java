package by.mrbregovich.partition;

import by.mrbregovich.helperPackage.UserInputHelper;

/*
 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади, 
 * если угол между сторонами длиной X и Y— прямой.
 */

class Task9 {
	public static void main(String[] args) {
		UserInputHelper usrInput = new UserInputHelper();
		double a, b, c, d;
		do {
			a = usrInput.getDoubleValue("Введите длину стороны a > 0\n");
		} while (a <= 0);
		do {
			b = usrInput.getDoubleValue("Введите длину стороны b > 0\n");
		} while (b <= 0);
		do {
			c = usrInput.getDoubleValue("Введите длину стороны c > 0\n");
		} while (c <= 0);
		do {
			d = usrInput.getDoubleValue("Введите длину стороны d > 0\n");
		} while (d <= 0);
		System.out.println("Плащадь четырехуголника со сторонами " + a + ", " + b + ", " + c + " и " + d + " равна "
				+ getRectAreaBySydes(a, b, c, d));
	}

	private static double getRectAreaBySydes(double a, double b, double c, double d) {
		double p = (a + b + c + d) / 2;
		return Math.sqrt((p - a) * (p - b) * (p - c) * (p - d));
	}

}
