package by.mrbregovich.multyArrays;

/*
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали
 */

import by.mrbregovich.helperPackage.matrix.*;

class Task2 {
	public static void main(String[] args) {
		MatrixHelper mxHelper = new MatrixHelper();
		MatrixPrinter mxPrinter = new MatrixPrinter();
		final int size = 10;
		int[][] matrix = mxHelper.getRandomIntMatrix(size, size, 0, 26);
		mxPrinter.print(matrix);

		System.out.print("Главная диагональ: ");
		for (int i = 0, n = matrix.length; i < n; i++) {
			System.out.print(matrix[i][i] + " ");
		}
		System.out.print("\nПобочная диагональ: ");
		for (int i = 0, n = matrix.length; i < n; i++) {
			System.out.print(matrix[i][n - 1 - i] + " ");
		}
	}

}
