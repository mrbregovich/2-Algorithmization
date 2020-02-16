package by.mrbregovich.multyArrays;

/*
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы
 */

import by.mrbregovich.helperPackage.matrix.*;

class Task3 {
	public static void main(String[] args) {
		MatrixHelper mxHelper = new MatrixHelper();
		MatrixPrinter mxPrinter = new MatrixPrinter();
		int[][] matrix = mxHelper.getRandomIntMatrix(5, 10, 0, 100);
		mxPrinter.print(matrix);
		// номер строки
		int k = 1;
		System.out.println("\nСтрока с индексом " + k + ": ");
		for (int j = 0; j < matrix[k].length; j++)
			System.out.print(matrix[k][j] + "  ");
		// номер столбца
		int p = 8;
		System.out.println("\nСтолбец с индексом " + p + ": ");
		for (int i = 0; i < matrix.length; i++)
			System.out.print(matrix[i][p] + "  ");

	}
}
