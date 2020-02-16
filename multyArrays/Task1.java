package by.mrbregovich.multyArrays;

/*
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
 */

import by.mrbregovich.helperPackage.matrix.*;

class Task1 {
	public static void main(String[] args) {
		MatrixHelper mxHelper = new MatrixHelper();
		MatrixPrinter mxPrinter = new MatrixPrinter();
		int[][] matrix = mxHelper.getRandomIntMatrix(5, 10, 0, 26);
		mxPrinter.print(matrix);
		System.out.println("Все нечетные столбцы, у которых первый элемент больше последнего");

		for (int j = 1; j < matrix[0].length; j += 2) {
			if (matrix[0][j] > matrix[matrix.length - 1][j]) {
				System.out.println("Столбец с индексом " + j);
				printColumn(matrix, j);
			}
		}
	}

	private static void printColumn(int[][] mx, int col) {
		System.out.print("[ ");
		for (int i = 0; i < mx.length; i++) {
			System.out.print(mx[i][col] + " ");
		}
		System.out.println("]");

	}

}
